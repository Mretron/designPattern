package com.zzj.designPattern.structural.decorationPattern;

/**
 * 饮料抽象基类
 * @author zengzhongjie
 * @date 2020/11/7
 */
public abstract class Beverage {
    /**
     * 返回描述
     * @return
     */
    public abstract String getDescription();


    /**
     * 返回价格
     * @return
     */
    public abstract double cost();
}
