

package com.argonaut.sjrm.activities.about

import android.content.Intent
import android.os.Bundle
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity
import com.argonaut.sjrm.BuildConfig
import com.argonaut.sjrm.R
import com.argonaut.sjrm.activities.BaseActivity
import kotlinx.android.synthetic.main.activity_about.*

/**
 * Show information about the app, its version & licenses to all open source libraries used
 */
class AboutActivity : BaseActivity() {
    override fun init(savedInstanceState: Bundle?) {
        setupLayout(R.layout.activity_about)
        if (BuildConfig.GIT_SHA.isNotEmpty()) {
            version.setText(R.string.appVersionExtendedWithHash)
        }

      //  appInstanceId.text = getString(R.string.instanceId, mainApplication.instanceId)

        viewOpenSourceLicenses.setOnClickListener {
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            startActivity(Intent(context, OssLicensesMenuActivity::class.java))
        }
    }
}