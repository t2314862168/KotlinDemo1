package com.tangxb.demo.fortest.bean;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Taxngb on 2017/11/15.
 */

public class ResultBean {

    /**
     * _id : 59f681c7421aa90fe72535d6
     * createdAt : 2017-10-30T09:35:03.780Z
     * desc : 30多个Android开发者超赞的工具
     * publishedAt : 2017-11-14T10:43:36.180Z
     * source : web
     * type : Android
     * url : https://mp.weixin.qq.com/s?__biz=MzIwMzYwMTk1NA==&mid=2247487835&idx=1&sn=3b8ddd7fd4c52e1a4d6e5c1e601d91d7
     * used : true
     * who : 陈宇明
     */
    @Expose
    @SerializedName("_id")
    private String _id;
    @Expose
    @SerializedName("createdAt")
    private String createdAt;
    @Expose
    @SerializedName("desc")
    private String desc;
    @Expose
    @SerializedName("publishedAt")
    private String publishedAt;
    @Expose
    @SerializedName("source")
    private String source;
    @Expose
    @SerializedName("type")
    private String type;
    @Expose
    @SerializedName("url")
    private String url;
    @Expose
    @SerializedName("used")
    private boolean used;
    @Expose
    @SerializedName("who")
    private String who;
    @Expose
    @SerializedName("images")
    private List<String> images;

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "_id='" + _id + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", desc='" + desc + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", source='" + source + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", used=" + used +
                ", who='" + who + '\'' +
                ", images=" + images +
                '}';
    }
}
