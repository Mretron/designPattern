package com.zzj.designPattern.structural.decorationPattern;

/**
 * BlackTea:红茶
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Coffee extends Beverage{
    @Override
    public String getDescription() {
        return "咖啡";
    }

    @Override
    public double cost() {
        return 15;
    }
}
