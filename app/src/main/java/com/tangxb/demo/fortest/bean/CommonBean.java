package com.tangxb.demo.fortest.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Taxngb on 2017/11/15.
 */

public class CommonBean<T> {
    @Expose
    @SerializedName("error")
    private boolean error;

    @Expose
    @SerializedName("results")
    private T results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "CommonBean{" +
                "error=" + error +
                ", results=" + results +
                '}';
    }
}
