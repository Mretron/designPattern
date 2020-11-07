package com.zzj.designPattern.structural.decorationPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Lemon extends Condiment{

    /**
     * 需要装饰的饮料
     */
    private Beverage beverage;

    /**
     * 这里很关键，需要传入具体的饮料，如需要传入没有被装饰的红茶或绿茶，
     * 当然也可以传入已经装饰好的芒果绿茶，这样可以做芒果柠檬绿茶
     * @param beverage
     */
    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        // 装饰
        return beverage.getDescription() + "，加柠檬";
    }

    @Override
    public double cost() {
        // 装饰
        return beverage.cost() + 2;
    }
}
