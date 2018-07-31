package com.example.zhangjian.queuedemo.upload;

import com.example.zhangjian.queuedemo.upload.bean.BaseUploadBean;

public class UploadTask implements IUploadTask {
    private BaseUploadBean baseUploadBean;
    private int state = STATE_INIT;

    public BaseUploadBean getBaseUploadBean() {
        return baseUploadBean;
    }

    public void setBaseUploadBean(BaseUploadBean baseUploadBean) {
        this.baseUploadBean = baseUploadBean;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void execute() {

    }

    @Override
    public void cancel() {

    }

    @Override
    public boolean isExecuted() {
        return state != STATE_INIT;
    }

    @Override
    public boolean isCanceled() {
        return state == STATE_CANCEL;
    }

    @Override
    public boolean isUploadVideoDone() {
        return state == STATE_VIDEO_UPLOAD_DONE;
    }

    @Override
    public boolean isUploadCoverDone() {
        return state == STATE_COVER_UPLOAD_DONE;
    }

    @Override
    public boolean isCreateVideoInfoDone() {
        return state == STATE_CAREATE_INFO_DONE;
    }


}
