package com.zzj.designPattern.structural.adapterPattern.defaultAdapter;

import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;

/**
 * FileAlterationListener接口的适配器类
 * @author zengzhongjie
 * @date 2020/11/6
 */
public class FileAlterationListenerAdaptor implements FileAlterationListener{
    public void onStart(FileAlterationObserver observer) {

    }

    public void onDirectoryCreate(File directory) {

    }

    public void onDirectoryChange(File directory) {

    }

    public void onDirectoryDelete(File directory) {

    }

    public void onFileCreate(File file) {

    }

    public void onFileChange(File file) {

    }

    public void onFileDelete(File file) {

    }

    public void onStop(FileAlterationObserver observer) {

    }
}
