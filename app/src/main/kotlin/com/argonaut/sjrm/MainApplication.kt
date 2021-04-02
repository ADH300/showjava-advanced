
package com.argonaut.sjrm

import android.app.NotificationManager
import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatDelegate
import androidx.multidex.MultiDexApplication
import androidx.preference.PreferenceManager
import androidx.work.WorkManager
import com.argonaut.sjrm.utils.Ads
import com.argonaut.sjrm.utils.UserPreferences
import com.argonaut.sjrm.utils.logging.ProductionTree
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import timber.log.Timber
//import com.crashlytics.android.Crashlytics
//import com.google.firebase.iid.FirebaseInstanceId
//import io.fabric.sdk.android.Fabric


class MainApplication : MultiDexApplication() {

    val disposables = CompositeDisposable()
  //  lateinit var instanceId: String

    override fun onCreate() {
        super.onCreate()
      //  instanceId = FirebaseInstanceId.getInstance().id

        PreferenceManager.setDefaultValues(
            applicationContext,
            UserPreferences.NAME,
            Context.MODE_PRIVATE,
            R.xml.preferences,
            false
        )

        val preferences =
            UserPreferences(
                applicationContext.getSharedPreferences(
                    UserPreferences.NAME,
                    Context.MODE_PRIVATE
                )
            )

        AppCompatDelegate.setDefaultNightMode(
            if (preferences.darkMode)
                AppCompatDelegate.MODE_NIGHT_YES
            else
                AppCompatDelegate.MODE_NIGHT_NO
        )

        Ads(this).init()
     //   Fabric.with(this, Crashlytics())
     //   Crashlytics.setUserIdentifier(instanceId)

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(ProductionTree())
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            disposables.add(
                cleanStaleNotifications()
                    .subscribeOn(Schedulers.io())
                    .observeOn(Schedulers.io())
                    .onErrorReturn {}
                    .subscribe()
            )
        }
    }

    /**
     * Clean any stale notifications not linked to any decompiler process
     */
    @RequiresApi(Build.VERSION_CODES.M)
    fun cleanStaleNotifications(): Observable<Unit> {
        return Observable.fromCallable {
            val manager = applicationContext
                .getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            val workManager = WorkManager.getInstance()
            manager.activeNotifications.forEach { notification ->
                val status = workManager.getWorkInfosForUniqueWorkLiveData(notification.tag)
                    .value?.any { it.state.isFinished }
                if (status == null || status == true) {
                    manager.cancel(notification.tag, notification.id)
                }
            }
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        disposables.clear()
    }
}
