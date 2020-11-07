package com.zzj.designPattern.construct.factoryPattern;

import com.zzj.designPattern.construct.factoryPattern.domain.ChineseFoodA;
import com.zzj.designPattern.construct.factoryPattern.domain.ChineseFoodB;
import com.zzj.designPattern.construct.factoryPattern.domain.Food;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class ChineseFoodFactory implements FoodFactory{

    public Food makeFood(String name) {
        if(name.equals("A")) {
            Food chineseFoodA = new ChineseFoodA();
            return chineseFoodA;
        } else if(name.equals("B")) {
            Food chineseFoodB = new ChineseFoodB();
            return chineseFoodB;
        } else {
            return null;
        }
    }
}
