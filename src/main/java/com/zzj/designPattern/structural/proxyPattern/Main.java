package com.zzj.designPattern.structural.proxyPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/6
 */
public class Main {


    public static void main(String[] args) {
        // 客户端调用，注意，我们要用代理来实例化接口
        FoodService foodService = new FoodServicePorxy();
        foodService.makeChicken();
    }
}
