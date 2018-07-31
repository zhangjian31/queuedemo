package com.example.zhangjian.queuedemo.upload;

import java.util.ArrayDeque;
import java.util.Deque;


public class UploadDispachter {
    private final Deque<UploadTask> runningAsyncTasks = new ArrayDeque<>();
    private UploadTask currentUploadTask;

    public synchronized void cancelAll() {
        for (UploadTask call : runningAsyncTasks) {
            call.cancel();
        }
    }

    synchronized void executed(UploadTask task) {
        runningAsyncTasks.add(task);
        promoteUpload();
    }

    synchronized void promoteUpload() {
        if (runningAsyncTasks.isEmpty()) return;
        if (currentUploadTask != null) return;
        currentUploadTask = runningAsyncTasks.getFirst();
    }

    synchronized void finished(UploadTask task) {
        try {
            runningAsyncTasks.remove(task);
            currentUploadTask = null;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            promoteUpload();
        }
    }
}
