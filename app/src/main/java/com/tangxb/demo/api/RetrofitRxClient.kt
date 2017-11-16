package com.tangxb.demo.api

import com.facebook.stetho.okhttp3.StethoInterceptor
import com.tangxb.demo.HttpLogger
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Created by Taxngb on 2017/11/14.
 */
class RetrofitRxClient {
    var retrofit: Retrofit? = null

    private constructor() {
        val builder = OkHttpClient().newBuilder()
        val logInterceptor = HttpLoggingInterceptor(HttpLogger())
        logInterceptor.level = HttpLoggingInterceptor.Level.BODY
        builder.addInterceptor(logInterceptor)
        builder.addNetworkInterceptor(StethoInterceptor())
        val client = builder.build()
        // 使用Chrome调试
        retrofit = Retrofit.Builder()
                //设置OKHttpClient
                .client(client)
                //baseUrl
                .baseUrl(ApiContants.BASE_URL)
                //gson转化器
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
    }

    companion object {
        val instance by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            RetrofitRxClient()
        }
    }
}