package com.zzj.designPattern.structural.bridgePattern;

/**
 * 圆形
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Circle extends Shape{

    private int radius;

    public Circle(int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
    }


    @Override
    public void draw() {
        // 因为是圆形，所以只需要半径
        drawAPI.draw(radius, 0, 0);
    }
}
