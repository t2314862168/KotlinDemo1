package com.tangxb.demo.bean

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by Taxngb on 2017/11/14.
 */

class ResultBean {

    /**
     * _id : 5a085efb421aa90fe50c01f6
     * createdAt : 2017-11-12T22:47:23.292Z
     * desc : Android持续集成：Jenkins+Github+蒲公英/Fir.im+邮件通知
     * publishedAt : 2017-11-13T12:10:58.643Z
     * source : web
     * type : Android
     * url : https://mp.weixin.qq.com/s?__biz=MzIwMzYwMTk1NA==&mid=2247488151&idx=1&sn=f329687505b416cd898c843ca558b693
     * used : true
     * who : 陈宇明
     */
    @Expose
    @SerializedName("_id")
    var _id: String? = null
    @Expose
    @SerializedName("createdAt")
    var createdAt: String? = null
    @Expose
    @SerializedName("desc")
    var desc: String? = null
    @Expose
    @SerializedName("publishedAt")
    var publishedAt: String? = null
    @Expose
    @SerializedName("source")
    var source: String? = null
    @Expose
    @SerializedName("type")
    var type: String? = null
    @Expose
    @SerializedName("url")
    var url: String? = null
    @Expose
    @SerializedName("used")
    var isUsed: Boolean = false
    @Expose
    @SerializedName("who")
    var who: String? = null
    @Expose
    @SerializedName("images")
    var images: List<String>? = null
}
