package com.zzj.designPattern.behavioral.strategyPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class BluePen implements Strategy{
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用蓝色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
