package com.zzj.designPattern.structural.facadePattern;

import com.zzj.designPattern.structural.facadePattern.domain.Circle;
import com.zzj.designPattern.structural.facadePattern.domain.Rectangle;
import com.zzj.designPattern.structural.facadePattern.domain.Shape;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Main {
    public static void main(String[] args) {
        // 当我们需要画一个圆形，一个长方形

        // 不用门面模式
        Shape circle = new Circle();
        circle.draw();
        Shape rectangle = new Rectangle();
        rectangle.draw();

        // 使用门面模式
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
