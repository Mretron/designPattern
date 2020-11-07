package com.zzj.designPattern.construct.factoryPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class Main {
    public static void main(String[] args) {
        // 第一步先选取一个工厂
        FoodFactory foodFactory = new ChineseFoodFactory();
        // 调用工厂的简单工厂方法，不同的工厂造出不同的对象
        foodFactory.makeFood("A");
    }
}
