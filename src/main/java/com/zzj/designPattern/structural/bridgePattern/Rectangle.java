package com.zzj.designPattern.structural.bridgePattern;

/**
 * 长方形
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Rectangle extends Shape{

    private int x;
    private int y;

    protected Rectangle(int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.draw(0, x, y);
    }
}
