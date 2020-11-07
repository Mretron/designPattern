package com.zzj.designPattern.structural.decorationPattern;

/**
 * BlackTea:红茶
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class BlackTea extends Beverage{
    @Override
    public String getDescription() {
        return "红茶";
    }

    @Override
    public double cost() {
        return 10;
    }
}
