package com.zzj.designPattern.construct.factoryPattern;

import com.zzj.designPattern.construct.factoryPattern.domain.AmericanFoodA;
import com.zzj.designPattern.construct.factoryPattern.domain.AmericanFoodB;
import com.zzj.designPattern.construct.factoryPattern.domain.Food;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class AmericanFoodFactory implements FoodFactory{
    public Food makeFood(String name) {
        if(name.equals("A")) {
            Food americanFoodA = new AmericanFoodA();
            return americanFoodA;
        } else if(name.equals("B")) {
            Food americanFoodB = new AmericanFoodB();
            return americanFoodB;
        } else {
            return null;
        }
    }
}
