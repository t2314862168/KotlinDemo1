package com.tangxb.demo.fortest.api;


import com.tangxb.demo.fortest.bean.CommonBean;
import com.tangxb.demo.fortest.bean.ResultBean;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Taxngb on 2017/11/15.
 */
public interface AndroidResultApi {
    @GET("data/Android/{pageSize}/{page}")
    Observable<CommonBean<List<ResultBean>>> getData(@Path("pageSize") int pageSize, @Path("page") int page);
}
