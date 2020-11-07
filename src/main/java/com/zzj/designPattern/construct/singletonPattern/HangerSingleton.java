package com.zzj.designPattern.construct.singletonPattern;

import java.util.Date;

/**
 * 饿汉单例
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class HangerSingleton {


    /**
     * 注意首先是private的构造器
     * 防止被创建
     */
    private HangerSingleton(){};

    /**
     * 要返回的单例对象，设置为static类属性
     * 也声明为private
     */
    private static HangerSingleton instance = new HangerSingleton();

    /**
     * 通过这个静态方法返回单例对象
     * @return
     */
    public static HangerSingleton getSingleton() {
        return instance;
    }

    /**
     * 这里的static方法作用就是说明 饿汉单例 的缺点：
     * 如果还有其他静态方法
     * 在并不想去生成单例instance的时候，也会生成instance对象
     * @param mode
     * @return
     */
    public static Date getDate(String mode) {
        return new Date();
    }

}
