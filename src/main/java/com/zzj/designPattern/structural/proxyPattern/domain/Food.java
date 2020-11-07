package com.zzj.designPattern.structural.proxyPattern.domain;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public abstract class Food {

    private String chicken;
    private String spicy;
    private String salt;
    private String noodle;
    private String condiment;

    public void setSalt(String salt) {
        this.salt = salt;
    }
    public void setSpicy(String spicy) {
        this.spicy = spicy;
    }
    public void setChicken(String chicken) {
        this.chicken = chicken;
    }
    public void setNoodle(String noodle) {
        this.noodle = noodle;
    }

    public void setCondiment(String condiment) {
        this.condiment = condiment;
    }
}
