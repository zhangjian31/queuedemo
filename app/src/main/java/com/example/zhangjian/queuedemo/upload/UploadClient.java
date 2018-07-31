package com.example.zhangjian.queuedemo.upload;

import com.example.zhangjian.queuedemo.upload.bean.BaseUploadBean;

public class UploadClient {
    private UploadDispachter uploadDispachter;

    public UploadClient() {
        uploadDispachter = new UploadDispachter();
    }

    public void execute(BaseUploadBean bean) {
        UploadTask task = new UploadTask();
        task.setBaseUploadBean(bean);
        task.setState(IUploadTask.STATE_INIT);
        uploadDispachter.executed(task);
    }

}
