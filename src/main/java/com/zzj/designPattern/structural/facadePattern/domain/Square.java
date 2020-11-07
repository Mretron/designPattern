package com.zzj.designPattern.structural.facadePattern.domain;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
