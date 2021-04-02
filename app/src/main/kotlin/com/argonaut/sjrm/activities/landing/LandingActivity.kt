
package com.argonaut.sjrm.activities.landing

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.os.Environment
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.PopupMenu
import androidx.recyclerview.widget.LinearLayoutManager
import com.argonaut.sjrm.R
import com.argonaut.sjrm.activities.BaseActivity
import com.argonaut.sjrm.activities.apps.AppsActivity
import com.argonaut.sjrm.activities.decompiler.DecompilerActivity
import com.argonaut.sjrm.activities.explorer.navigator.NavigatorActivity
import com.argonaut.sjrm.activities.landing.adapters.HistoryListAdapter
import com.argonaut.sjrm.data.PackageInfo
import com.argonaut.sjrm.data.SourceInfo
import com.argonaut.sjrm.utils.Ads
import com.argonaut.sjrm.utils.secure.PurchaseUtils
import com.github.angads25.filepicker.model.DialogConfigs
import com.github.angads25.filepicker.model.DialogProperties
import com.github.angads25.filepicker.view.FilePickerDialog
import com.google.ads.consent.ConsentStatus
import com.google.android.gms.ads.AdView
import com.startapp.sdk.adsbase.Ad
import com.startapp.sdk.adsbase.AutoInterstitialPreferences
import com.startapp.sdk.adsbase.StartAppAd
import com.startapp.sdk.adsbase.StartAppSDK
import com.startapp.sdk.adsbase.adlisteners.AdEventListener
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_landing.*
import timber.log.Timber
import java.io.File


class LandingActivity : BaseActivity() {

    private lateinit var drawerToggle: ActionBarDrawerToggle
    private lateinit var landingHandler: LandingHandler
    private lateinit var filePickerDialog: FilePickerDialog
    private lateinit var purchaseUtils: PurchaseUtils

    private var historyListAdapter: HistoryListAdapter? = null
    private var historyItems = ArrayList<SourceInfo>()


    private var shouldLoadHistory = true

    override fun init(savedInstanceState: Bundle?) {
        setupLayout(R.layout.activity_landing)
        drawerToggle = ActionBarDrawerToggle(
                this,
                drawerLayout,
                R.string.drawerOpen,
                R.string.drawerClose
        )
        navigationView.setNavigationItemSelectedListener {
            onOptionsItemSelected(it)
        }

        StartAppSDK.init(this, "202056284", false);
        StartAppAd.disableSplash()


        StartAppAd.AdMode.REWARDED_VIDEO

            StartAppAd.enableAutoInterstitial()

       // StartAppAd.setAutoInterstitialPreferences(
         //       AutoInterstitialPreferences()
           //             .setActivitiesBetweenAds(2)
    //    )



        val button = findViewById<Button>(R.id.start)
        button.setOnClickListener {
            val popupMenu: PopupMenu = PopupMenu(this, button)
            popupMenu.menuInflater.inflate(R.menu.menu_fab, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.action_pick_installed -> {
                        if (isPro()) {
                            startActivity(
                                    Intent(context, AppsActivity::class.java)

                            )
                        } else {
                            startActivity(
                                    Intent(context, AppsActivity::class.java)

                            )
                            showRewardedVideo()

                            Toast.makeText(this@LandingActivity, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                        }
                    }
                    R.id.action_pick_sdcard -> {
                        if(isPro()) {
                            pickFile()
                        }
                        else{
                            pickFile()
                            showRewardedVideo()
                        }
                        Toast.makeText(this@LandingActivity, "You Clicked : " + item.title, Toast.LENGTH_SHORT).show()
                    }
                }
                true
            })
            popupMenu.show()
        }





        if (!isPro()) {
            navigationView.menu.findItem(R.id.get_pro_option).isVisible = true
        }

        drawerLayout.addDrawerListener(drawerToggle)
        landingHandler = LandingHandler(context)


        if (savedInstanceState != null) {
             savedInstanceState.getParcelableArrayList<SourceInfo>("historyItems")?.let {
                 this.historyItems = it
                 shouldLoadHistory = false
                 setupList()
             }
        }

        val properties = DialogProperties()
        properties.selection_mode = DialogConfigs.SINGLE_MODE
        properties.selection_type = DialogConfigs.FILE_SELECT
        properties.root = Environment.getExternalStorageDirectory()
        properties.error_dir = properties.root
        properties.offset = properties.root
        properties.extensions = arrayOf("apk", "jar", "dex", "odex")

        filePickerDialog = FilePickerDialog(this, properties)
        filePickerDialog.setTitle(getString(R.string.selectFile))

        filePickerDialog.setDialogSelectionListener { files ->
            if (files.isNotEmpty()) {
                val selectedFile = File(files.first())
                if (selectedFile.exists() && selectedFile.isFile) {
                    PackageInfo.fromFile(context, selectedFile) ?. let {
                        val i = Intent(context, DecompilerActivity::class.java)
                        i.putExtra("packageInfo", it)
                        startActivity(i)
                    }
                }
            }
        }

        swipeRefresh.setOnRefreshListener {
            populateHistory(true)
        }

        purchaseUtils = PurchaseUtils(this, secureUtils)
        purchaseUtils.doOnComplete {
            if (isPro()) {
                supportActionBar?.title = "${getString(R.string.appName)} Pro"
                findViewById<AdView>(R.id.adView)?.visibility = View.GONE
                navigationView.menu.findItem(R.id.get_pro_option)?.isVisible = false
            }
        }
        purchaseUtils.initializeCheckout(false, true)
        if (inEea && userPreferences.consentStatus == ConsentStatus.UNKNOWN.ordinal) {
            Ads(context).loadConsentScreen()
        }
    }

    override fun onBackPressed() {
        StartAppAd.onBackPressed(this)
        super.onBackPressed()
    }
    public override fun onResume() {
        super.onResume()
        if (hasValidPermissions()) {
            populateHistory(true)
        }
        if (isPro()) {
            supportActionBar?.title = "${getString(R.string.appName)} Pro"
            findViewById<AdView>(R.id.adView)?.visibility = View.GONE
            navigationView.menu.findItem(R.id.get_pro_option)?.isVisible = false
        }
    }


    fun showRewardedVideo() {
        val rewardedVideo = StartAppAd(this)
        rewardedVideo.setVideoListener {
            // Grant the reward to user
        }
        rewardedVideo.loadAd(StartAppAd.AdMode.REWARDED_VIDEO, object : AdEventListener {
            override fun onReceiveAd(ad: Ad) {
                rewardedVideo.showAd()
            }

            override fun onFailedToReceiveAd(ad: Ad) {
                // Can't show rewarded video
            }
        })
    }

    private fun pickFile() {
        filePickerDialog.show()
    }

    override fun postPermissionsGrant() {
        if (shouldLoadHistory) {
            populateHistory()
        }
    }

    private fun populateHistory(resume: Boolean = false) {
        swipeRefresh.isRefreshing = true
        disposables.add(landingHandler.loadHistory()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onErrorReturn {
                    Timber.e(it)
                    ArrayList()
                }
                .subscribe {
                    historyItems = it
                    swipeRefresh.isRefreshing = false
                    if (resume && historyListAdapter != null) {
                        historyListAdapter?.updateData(historyItems)
                        setListVisibility(!historyItems.isEmpty())
                    } else {
                        setupList()
                    }
                }
        )
    }

    private fun setListVisibility(isListVisible: Boolean = true) {
       val listGroupVisibility = if (isListVisible) View.VISIBLE else View.GONE
       val defaultGroupVisibility = if (isListVisible) View.GONE else View.VISIBLE
       historyListView.visibility = listGroupVisibility
        swipeRefresh.visibility = listGroupVisibility
      // pickAppText.visibility = listGroupVisibility
      welcomeLayout.visibility = defaultGroupVisibility
   }


    private fun setupList() {
        if (historyItems.isEmpty()) {
           setListVisibility(false)
        } else {
           setListVisibility(true)
            historyListView.setHasFixedSize(true)
            historyListView.layoutManager = LinearLayoutManager(context)
            historyListAdapter = HistoryListAdapter(historyItems) { selectedHistoryItem ->
                val intent = Intent(context, NavigatorActivity::class.java)
                intent.putExtra("selectedApp", selectedHistoryItem)
                startActivity(intent)
            }
            historyListView.adapter = historyListAdapter
        }
    }

    override fun onSaveInstanceState(bundle: Bundle) {
        super.onSaveInstanceState(bundle)
        bundle.putParcelableArrayList("historyItems", historyItems)
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        drawerToggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        drawerToggle.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (drawerToggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroy() {
        super.onDestroy()
        purchaseUtils.onDestroy()
    }
}
