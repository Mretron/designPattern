package com.zzj.designPattern.structural.bridgePattern;

/**
 * 画图的API
 * @author zengzhongjie
 * @date 2020/11/7
 */
public interface DrawAPI {
    /**
     * 给一个半径，坐标进行画图
     * @param radius
     * @param x
     * @param y
     */
    void draw(int radius, int x, int y);
}
