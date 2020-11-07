package com.zzj.designPattern.structural.facadePattern.domain;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
