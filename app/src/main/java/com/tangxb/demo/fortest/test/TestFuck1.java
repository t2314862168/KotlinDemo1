package com.tangxb.demo.fortest.test;

import android.util.Log;

import com.tangxb.demo.fortest.api.AndroidResultApi;
import com.tangxb.demo.fortest.api.RetrofitRxClient;
import com.tangxb.demo.fortest.bean.CommonBean;
import com.tangxb.demo.fortest.bean.ResultBean;

import java.util.List;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Taxngb on 2017/11/15.
 */

public class TestFuck1 {
    final String TAG = TestFuck1.class.getSimpleName();

    public void test_1() {
        RetrofitRxClient.INSTANCE.getRetrofit().create(AndroidResultApi.class).getData(10, 1)
                .map(new Function<CommonBean<List<ResultBean>>, List<ResultBean>>() {
                    @Override
                    public List<ResultBean> apply(CommonBean<List<ResultBean>> listCommonBean) throws Exception {
                        Log.d(TAG, "listCommonBean.getResults().size()=====" + listCommonBean.getResults().size());
                        return listCommonBean.getResults();
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<List<ResultBean>>() {
                    @Override
                    public void accept(List<ResultBean> resultBeans) throws Exception {
                        Log.d(TAG, "resultBeans.size()=====" + resultBeans.size());
                        System.out.println();
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.d(TAG, "throwable=====" + throwable.getMessage());
                        System.out.println();
                    }
                });
    }
}
