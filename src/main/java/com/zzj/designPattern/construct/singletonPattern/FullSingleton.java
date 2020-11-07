package com.zzj.designPattern.construct.singletonPattern;

/**
 * 饱汉单例
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class FullSingleton {

    private FullSingleton(){};

    /**
     * volatile注意必须含有
     */
    private static volatile FullSingleton instance = null;

    /**
     * 双重校验锁
     * @return
     */
    public static FullSingleton getInstance() {
        if(instance == null) {
            synchronized (FullSingleton.class) {
                if(instance == null) {
                    instance = new FullSingleton();
                }
            }
        }
        return instance;
    }
}
