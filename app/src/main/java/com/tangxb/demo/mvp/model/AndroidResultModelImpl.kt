package com.tangxb.demo.mvp.model

import com.tangxb.demo.api.AndroidResultApi
import com.tangxb.demo.api.RetrofitRxClient
import com.tangxb.demo.bean.ResultBean
import io.reactivex.Observable
import io.reactivex.functions.Function

/**
 * Created by Taxngb on 2017/11/14.
 */
class AndroidResultModelImpl : AndroidResultModel {
    override fun getData(pageSize: Int, page: Int): Observable<List<ResultBean>> {
        return RetrofitRxClient.instance.retrofit!!
                .create(AndroidResultApi::class.java)
                .getData(pageSize, page)
                .map(Function { listCommonBean -> listCommonBean.results })
    }

}