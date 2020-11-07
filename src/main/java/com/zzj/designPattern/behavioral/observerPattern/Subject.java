package com.zzj.designPattern.behavioral.observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Subject {
    private List<Observer>  observers = new ArrayList<Observer>();
    private int state;



    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        // 数据已经变更，通知所有观察者
        notifyAllObservers();
    }

    /**
     * 注册观察者
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 通知观察者们
     */
    public void notifyAllObservers() {
        observers.stream().forEach(Observer::update);
    }
}
