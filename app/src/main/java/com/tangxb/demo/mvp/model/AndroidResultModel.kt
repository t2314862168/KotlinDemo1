package com.tangxb.demo.mvp.model

import com.tangxb.demo.bean.CommonBean
import com.tangxb.demo.bean.ResultBean
import io.reactivex.Observable

/**
 * Created by Taxngb on 2017/11/14.
 */
interface AndroidResultModel {
    fun getData(pageSize: Int, page: Int): Observable<List<ResultBean>>
}