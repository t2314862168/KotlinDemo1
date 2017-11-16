package com.tangxb.demo;

import com.tangxb.demo.bean.CommonBean;
import com.tangxb.demo.bean.ResultBean;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Taxngb on 2017/11/14.
 */

public class TestK2 {
    public void test1() {
        Observable.just("hello", "world")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        System.out.println(s);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        System.out.println(throwable.getMessage());
                    }
                }, new Action() {
                    @Override
                    public void run() throws Exception {
                        System.out.println("dddd");
                    }
                });
    }

    private CompositeDisposable mCompositeSubscription;

    public void addSubscription(Observable observable, Consumer consumer, Consumer<Throwable> onError) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeDisposable();
        }
        mCompositeSubscription.add(observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(consumer, onError));
    }

    public Observable<List<ResultBean>> getObservable2(){
        return null;
    }
    public Observable<CommonBean<List<ResultBean>>> getObservable1(){
        return null;
    }

    public void test2() {
        addSubscription(getObservable2(), new Consumer<List<ResultBean>>() {
            @Override
            public void accept(List<ResultBean> o) throws Exception {

            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                
            }
        });
    }

    public void test3() {
        getObservable1().map(new Function<CommonBean<List<ResultBean>>, List<ResultBean>>() {
            @Override
            public List<ResultBean> apply(CommonBean<List<ResultBean>> listCommonBean) throws Exception {
                System.out.println(listCommonBean);
                return listCommonBean.getResults();
            }
        });
    }
}
