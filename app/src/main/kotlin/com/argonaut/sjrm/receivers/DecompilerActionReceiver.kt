
package com.argonaut.sjrm.receivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.argonaut.sjrm.Constants
import com.argonaut.sjrm.workers.DecompilerWorker
import timber.log.Timber

/**
 * [DecompilerActionReceiver] is used to receive the cancel request from the notification action,
 * and cancel the decompilation process.
 */
class DecompilerActionReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action) {
            Constants.WORKER.ACTION.STOP -> {
                val id = intent.getStringExtra("id")
                Timber.d("[cancel-request] ID: $id")
                context?.let {
                    DecompilerWorker.cancel(it, id)
                }
            }
            else -> {
                Timber.i("Received an unknown action.")
            }
        }
    }

}