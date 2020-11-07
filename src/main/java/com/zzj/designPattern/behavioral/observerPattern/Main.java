package com.zzj.designPattern.behavioral.observerPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Main {
    public static void main(String[] args) {
        // 先制定一个主题
        Subject subject = new Subject();

        // 定义观察者
        new BinaryObserver(subject);
        new HexaObserver(subject);

        // 模拟数据变更，这个时候，观察者们的 update 方法将会被调用
        subject.setState(11);
    }
}
