package com.zzj.designPattern.construct.simpleFactoryPattern;

import com.zzj.designPattern.construct.simpleFactoryPattern.domain.Food;
import com.zzj.designPattern.construct.simpleFactoryPattern.domain.HuangMenChicken;
import com.zzj.designPattern.construct.simpleFactoryPattern.domain.LanZhouNoodle;

/**
 * 简单工程模式：
 * 1.主要遵循职责单一原则
 * 2.一个类只提供一种功能
 * 3.比如FoodFactory就是只要负责生产各种Food
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class FoodFactory {

    /**
     * 一个工厂类XXXFactory
     * 里面一个静态方法
     * 根据我们传入的不同参数
     * 返回派生自同一父类的不同实例对象
     * @param name
     * @return
     */
    public static Food makeFood(String name) {
        if(name.equals("noodles")) {
            Food noodle = new LanZhouNoodle();
            noodle.addSpicy("more");
            return noodle;
        } else if(name.equals("condiment")) {
            Food chicken = new HuangMenChicken();
            chicken.addCondiment("potato");
            return chicken;
        } else {
            return null;
        }
    }
}
