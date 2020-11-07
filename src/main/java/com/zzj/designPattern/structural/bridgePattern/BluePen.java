package com.zzj.designPattern.structural.bridgePattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class BluePen implements DrawAPI{
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("使用蓝色蜡笔，radius:" + radius + ", x : " + x + ", y: " + y);
    }
}
