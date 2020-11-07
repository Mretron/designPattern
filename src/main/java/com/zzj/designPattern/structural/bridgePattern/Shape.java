package com.zzj.designPattern.structural.bridgePattern;

/**
 * 定义一个抽象类，此类的实现类都需要使用 DrawAP
 * @author zengzhongjie
 * @date 2020/11/7
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    /**
     * 画图
     */
    public abstract void draw();
}
