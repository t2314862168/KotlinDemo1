package com.tangxb.demo

import android.app.Application
import com.facebook.stetho.Stetho

/**
 * Created by Taxngb on 2017/11/16.
 */
class MApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
    }
}