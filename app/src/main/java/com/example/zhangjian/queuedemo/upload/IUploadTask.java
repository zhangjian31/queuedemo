package com.example.zhangjian.queuedemo.upload;

import java.io.IOException;


public interface IUploadTask {
    int STATE_INIT = 1;
    int STATE_UPLOADING = 2;
    int STATE_ERROR = 3;
    int STATE_VIDEO_UPLOAD_DONE = 4;
    int STATE_COVER_UPLOAD_DONE = 5;
    int STATE_CAREATE_INFO_DONE = 6;
    int STATE_CANCEL = 7;

    void execute();

    void cancel();

    boolean isExecuted();

    boolean isCanceled();

    boolean isUploadVideoDone();
    boolean isUploadCoverDone();
    boolean isCreateVideoInfoDone();
}
