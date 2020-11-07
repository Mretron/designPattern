package com.zzj.designPattern.behavioral.observerPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class BinaryObserver extends Observer{

    /**
     * 传入需要订阅的主题
     * @param subject
     */
    public BinaryObserver(Subject subject) {
        // 保存当前观察者订阅的主题
        this.subject = subject;
        // 通常在构造方法中将 this 发布出去的操作一定要小心
        // 给主题增加自己这个观察者
        this.subject.attach(this);
    }

    /**
     * 该方法由主题类在数据变更的时候进行调用
     */
    @Override
    public void update() {
        String result = Integer.toBinaryString(subject.getState());
        System.out.println("订阅的数据发生变化，新的数据处理为二进制值为：" + result);
    }
}
