package com.zzj.designPattern.structural.proxyPattern;

import com.zzj.designPattern.structural.proxyPattern.domain.Chicken;
import com.zzj.designPattern.structural.proxyPattern.domain.Food;
import com.zzj.designPattern.structural.proxyPattern.domain.Noodle;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class FoodServiceImpl implements FoodService{
    public Food makeChicken() {
        Food chicken = new Chicken();
        chicken.setChicken("1KG");
        chicken.setSalt("1g");
        chicken.setSpicy("3g");
        return chicken;
    }

    public Food makeNoodle() {
        Food noodle = new Noodle();
        noodle.setNoodle("500g");
        noodle.setSalt("5g");
        return noodle;
    }
}
