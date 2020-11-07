package com.zzj.designPattern.structural.bridgePattern;

/**
 * 桥梁的优点就是非常容易扩展
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Main {
    public static void main(String[] args) {
        Shape greenCircle = new Circle(10, new GreenPen());
        Shape redRectangle = new Rectangle(4, 8, new RedPen());
        greenCircle.draw();
        redRectangle.draw();
    }
}
