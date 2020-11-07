package com.zzj.designPattern.construct.simpleFactoryPattern.domain;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public interface Food {

    /**
     * 加辣
     * @param spicy
     */
    void addSpicy(String spicy);


    /**
     * 加调味品
     * @param condiment
     */
    void addCondiment(String condiment);

}
