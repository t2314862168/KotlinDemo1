package com.tangxb.demo.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tangxb.demo.mvp.presenter.BasePresenter
import com.tangxb.demo.mvp.view.BaseActivityView

/**
 * Created by Taxngb on 2017/11/14.
 */
abstract class BaseActivity<P> : AppCompatActivity() {
    var mvpPresenter: BasePresenter<BaseActivityView>? = null
    abstract fun createPresenter(): BasePresenter<BaseActivityView>
    abstract fun getLayoutResId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId())
        initInParent()
    }

    fun initInParent() {
        mvpPresenter = createPresenter();
        init()
    }

    open fun init() {
        initData()
    }

    open fun initData() {

    }

    override fun onDestroy() {
        super.onDestroy()
        mvpPresenter?.detachView()
    }
}