package com.zzj.designPattern.structural.facadePattern;

import com.zzj.designPattern.structural.facadePattern.domain.Circle;
import com.zzj.designPattern.structural.facadePattern.domain.Rectangle;
import com.zzj.designPattern.structural.facadePattern.domain.Shape;
import com.zzj.designPattern.structural.facadePattern.domain.Square;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    /**
     * 下面定义一堆方法，具体应该调用什么方法，由这个门面来决定
     */
    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
