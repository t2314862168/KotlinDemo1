package com.tangxb.demo.ui.activity

import com.tangxb.demo.R
import com.tangxb.demo.mvp.presenter.AndroidResultPresenter
import com.tangxb.demo.mvp.presenter.BasePresenter
import com.tangxb.demo.mvp.view.AndroidResultActivityView
import com.tangxb.demo.mvp.view.BaseActivityView
import io.reactivex.functions.Consumer

/**
 * Created by Taxngb on 2017/11/14.
 */
class AndroidResultActivity : BaseActivity<AndroidResultPresenter>(), AndroidResultActivityView {
    var presenter: AndroidResultPresenter? = null
    override fun getLayoutResId(): Int {
        return R.layout.activity_main
    }

    override fun createPresenter(): BasePresenter<BaseActivityView> {
        presenter = AndroidResultPresenter(this)
        return presenter!!
    }

    override fun initData() {
        mvpPresenter!!.addSubscription(presenter!!.getData(10, 1),
                Consumer { list ->
                    println(list.size)
                    for (bean in list) {
                        println(bean.url)
                    }
                }, Consumer { throwable ->
            print(1)
            println(throwable.message)
        })
    }

}