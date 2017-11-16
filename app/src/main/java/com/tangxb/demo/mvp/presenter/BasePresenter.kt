package com.tangxb.demo.mvp.presenter

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Consumer
import io.reactivex.schedulers.Schedulers

/**
 * Created by Taxngb on 2017/11/14.
 */
open class BasePresenter<V> {
    var mvpView: V? = null
    var compositeSub: CompositeDisposable? = null

    open fun attachView(view: V) {
        mvpView = view
    }

    open fun detachView() {
        mvpView = null
        onUnSubscribe()
    }

    /**
     * 取消注册，以避免内存泄露
     */
    open fun onUnSubscribe() {
        if (compositeSub != null && compositeSub!!.isDisposed()) {
            compositeSub!!.dispose()
            compositeSub = null
        }
    }


    open fun <T> addSubscription(observable: Observable<T>, consumer: Consumer<T>, onError: Consumer<Throwable>) {
        if (compositeSub == null) {
            compositeSub = CompositeDisposable()
        }
        compositeSub!!.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(consumer, onError))
    }

}