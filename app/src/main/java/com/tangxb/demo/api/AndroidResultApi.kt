package com.tangxb.demo.api

import com.tangxb.demo.bean.CommonBean
import com.tangxb.demo.bean.ResultBean
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by Taxngb on 2017/11/14.
 */
interface AndroidResultApi {
    @GET("data/Android/{pageSize}/{page}")
    fun getData(@Path("pageSize") pageSize: Int, @Path("page") page: Int): Observable<CommonBean<List<ResultBean>>>
}