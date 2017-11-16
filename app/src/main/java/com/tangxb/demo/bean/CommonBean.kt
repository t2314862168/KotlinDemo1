package com.tangxb.demo.bean

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Taxngb on 2017/11/14.
 */
class CommonBean<T> {
    @Expose
    @SerializedName("error")
    var error: Boolean = false

    @Expose
    @SerializedName("results")
    var results: T? = null
}