package com.tangxb.demo

import android.app.Application
import com.facebook.stetho.Stetho
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger


/**
 * Created by Taxngb on 2017/11/16.
 */
class MApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // 初始化 Stetho
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
        // 初始化 Logger
        Logger.addLogAdapter(object : AndroidLogAdapter() {
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG
            }
        })
    }
}