package com.tangxb.demo.fortest.api;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.tangxb.demo.HttpLogger;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Tangxb on 2016/11/4.
 */

public enum RetrofitRxClient {

    INSTANCE;

    private final Retrofit retrofit;

    RetrofitRxClient() {
        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor(new HttpLogger());
        logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        // 使用 Stetho Chrome 调试
        builder.addNetworkInterceptor(new StethoInterceptor());
        builder.addInterceptor(logInterceptor);
        OkHttpClient client = builder.build();
        retrofit = new Retrofit.Builder()
                //设置OKHttpClient
                .client(client)
                //baseUrl
                .baseUrl("http://gank.io/api/")
                //gson转化器
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }

}
