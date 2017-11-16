package com.tangxb.demo

import com.tangxb.demo.bean.CommonBean
import com.tangxb.demo.bean.ResultBean

import javax.xml.transform.Source

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import io.reactivex.functions.Function
import io.reactivex.schedulers.Schedulers

/**
 * Created by Taxngb on 2017/11/14.
 */

class TestK1 {

    private var mCompositeSubscription: CompositeDisposable? = null

    val observable: Observable<List<ResultBean>>?
        get() = null

    fun test1() {
        Observable.just("hello", "world")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ s -> println(s) }, { throwable -> println(throwable.message) }) { println("dddd") }
    }

//    fun test3() {
//        getObservable1()!!.map(Function<CommonBean<List<ResultBean>>, List<ResultBean>> { listCommonBean ->
//            println(listCommonBean)
//            listCommonBean.results
//        })
//    }

//    fun addSubscription(observable: Observable<*>, consumer: Consumer<*>, onError: Consumer<Throwable>) {
//        if (mCompositeSubscription == null) {
//            mCompositeSubscription = CompositeDisposable()
//        }
//        mCompositeSubscription!!.add(observable!!
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(consumer, onError))
//    }
//
//    fun test2() {
//        addSubscription(observable, Consumer<List<ResultBean>> { list ->
//            println(list.size)
//            for (bean in list) {
//                println(bean.url)
//            }
//        }, Consumer { throwable -> println(throwable.message) })
//    }
}
