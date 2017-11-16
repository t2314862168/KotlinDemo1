package com.tangxb.demo.mvp.presenter

import com.tangxb.demo.bean.ResultBean
import com.tangxb.demo.mvp.model.AndroidResultModelImpl
import com.tangxb.demo.mvp.view.BaseActivityView
import io.reactivex.Observable

/**
 * Created by Taxngb on 2017/11/14.
 */

class AndroidResultPresenter(mvpView: BaseActivityView) : BaseActivityPresenter(mvpView) {
    var model: AndroidResultModelImpl? = null

    init {
        model = AndroidResultModelImpl()
    }

    fun getData(pageSize: Int, page: Int): Observable<List<ResultBean>> {
        return model!!.getData(pageSize, page)
    }
}
