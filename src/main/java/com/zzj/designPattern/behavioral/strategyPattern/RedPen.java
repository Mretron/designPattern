package com.zzj.designPattern.behavioral.strategyPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class RedPen implements Strategy{
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用红色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
