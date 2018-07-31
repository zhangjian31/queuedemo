package com.example.zhangjian.queuedemo.upload.bean;

public class UploadVideoBean extends BaseUploadBean {
    private String scid;
    private String tags;
    private String desc;

    public String getScid() {
        return scid;
    }

    public void setScid(String scid) {
        this.scid = scid;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
