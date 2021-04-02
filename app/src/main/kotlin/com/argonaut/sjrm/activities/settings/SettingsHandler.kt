
package com.argonaut.sjrm.activities.settings

import android.content.Context
import com.argonaut.sjrm.utils.ktx.appStorage
import io.reactivex.Observable

class SettingsHandler(private var context: Context) {

    /**
     * Delete all decompiled sources recursively
     */
    fun deleteHistory(): Observable<Any> {
        return Observable.fromCallable {
            appStorage.resolve("sources")
                .deleteRecursively()
        }
    }
}