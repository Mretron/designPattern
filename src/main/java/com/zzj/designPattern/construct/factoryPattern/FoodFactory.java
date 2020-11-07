package com.zzj.designPattern.construct.factoryPattern;

import com.zzj.designPattern.construct.factoryPattern.domain.Food;

/**
 * 工厂模式：
 * 之所以引入工厂模式
 * 是因为我们往往需要两个以上的工厂
 * 1.首先选择合适的工厂
 * 2.之后就和简单工厂模式一样
 * 3.之后调用简单工厂的方法
 * 4.得到派生同一父类的不同子类实例对象
 * @author zengzhongjie
 * @date 2020/11/1
 */
public interface FoodFactory {

    /**
     * 这里定义的是所有工厂都有的
     * 共同的方法
     * 这里可能用到简单工厂模式
     * @param name
     * @return
     */
    Food makeFood(String name);
}
