package com.zzj.designPattern.structural.decorationPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Main {
    public static void main(String[] args) {
        // 首先我们需要一个基础饮料, 比如绿茶
        Beverage beverage = new GreenTea();

        // 开始装饰
        // 这里加了一份柠檬
        beverage = new Lemon(beverage);
        // 再加一份芒果
        beverage = new Mango(beverage);

        // 所以将会得到加了柠檬，芒果的绿茶
        System.out.println(beverage.getDescription() + " 价格: ¥" + beverage.cost());

        // 如果我们需要 芒果-珍珠-双份柠檬-红茶 还可以如下编写
        Beverage beverage1 = new Mango(new Pearl(new Lemon(new Lemon(new BlackTea()))));


    }
}
