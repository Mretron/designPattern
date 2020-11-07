package com.zzj.designPattern.behavioral.observerPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public abstract class Observer {

    protected Subject subject;

    /**
     * 观察者进行操作
     */
    public abstract void update();
}
