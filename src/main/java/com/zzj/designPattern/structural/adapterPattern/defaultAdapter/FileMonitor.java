package com.zzj.designPattern.structural.adapterPattern.defaultAdapter;

import java.io.File;

/**
 * 这样我们不用实现所有的接口方法
 * 只需要继承适配器
 * 重写需要的方法即可
 * @author zengzhongjie
 * @date 2020/11/6
 */
public class FileMonitor extends FileAlterationListenerAdaptor{
    @Override
    public void onDirectoryCreate(File directory) {
        // 文件创建
        doSomething();
    }

    @Override
    public void onFileDelete(File file) {
        // 文件删除
        doSomething();
    }

    private void doSomething() {

    }
}
