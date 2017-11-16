package com.tangxb.demo.mvp.presenter

import com.tangxb.demo.mvp.view.BaseActivityView

/**
 * Created by Taxngb on 2017/11/14.
 */
open class BaseActivityPresenter(mvpView: BaseActivityView) : BasePresenter<BaseActivityView>() {
    init {
        attachView(mvpView)
    }
}