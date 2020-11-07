package com.zzj.designPattern.behavioral.strategyPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public interface Strategy {
    /**
     * 画图形
     * @param radius
     * @param x
     * @param y
     */
    void draw(int radius, int x, int y);
}
