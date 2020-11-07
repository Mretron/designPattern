package com.zzj.designPattern.construct.simpleFactoryPattern.domain;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class HuangMenChicken implements Food{

    private String spicy = null;

    private String condiment = null;

    public void addSpicy(String spicy) {
        this.spicy = spicy;
    }

    public void addCondiment(String condiment) {
        this.condiment  = condiment;
    }
}
