package com.zzj.designPattern.structural.adapterPattern.defaultAdapter;

import org.apache.commons.io.monitor.FileAlterationObserver;

import java.io.File;


/**
 * 用 Apache commons-io 包中的 FileAlterationListener（文件改造监听器） 做例子
 * 用于对文件或文件夹进行监控，一旦发生了对应的操作，就会触发相应的方法
 *
 * 问题：
 * 此接口的抽象方法太多，如果我们需要使用这个接口，就算只需要监听文件删除，文件创建两个功能
 * 也不得不去实现所有的方法，显示得十分繁琐，很显然，这并不是我们想要的
 *
 * 所以我们可以使用一个适配器类,比如同一包下的FileAlterationListenerAdaptor，它用于实现这个接口的所有方法
 *
 * 但是所有的方法是空方法
 *
 * 这样我们就能转而继承这个适配器类，重写我们想要的固定几个方法
 *
 * @author cengzhongjie
 */
public interface FileAlterationListener {

    /**
     * File system observer started checking event.
     * 文件系统观测开始检查事件
     *
     * @param observer The file system observer
     */
    void onStart(final FileAlterationObserver observer);

    /**
     * Directory created Event.
     * 目录中创建活动
     *
     * @param directory The directory created
     */
    void onDirectoryCreate(final File directory);

    /**
     * Directory changed Event.
     * 目录变更事件
     *
     * @param directory The directory changed
     */
    void onDirectoryChange(final File directory);

    /**
     * Directory deleted Event.
     * 目录中删除事件
     *
     * @param directory The directory deleted
     */
    void onDirectoryDelete(final File directory);

    /**
     * File created Event.
     * 文件中创建活动
     *
     * @param file The file created
     */
    void onFileCreate(final File file);

    /**
     * File changed Event.
     * 文件变更事件
     *
     * @param file The file changed
     */
    void onFileChange(final File file);

    /**
     * File deleted Event.
     * 文件删除事件
     *
     * @param file The file deleted
     */
    void onFileDelete(final File file);

    /**
     * File system observer finished checking event.
     * 文件系统观测检查完事件
     *
     * @param observer The file system observer
     */
    void onStop(final FileAlterationObserver observer);
}