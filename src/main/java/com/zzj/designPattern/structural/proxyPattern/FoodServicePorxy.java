package com.zzj.designPattern.structural.proxyPattern;

import com.zzj.designPattern.structural.proxyPattern.domain.Food;

/**
 * 代理要表现得"就像是"真实实现类，所以要实现FoodService
 * @author zengzhongjie
 * @date 2020/11/6
 */
public class FoodServicePorxy implements FoodService{

    /**
     * 内部一定要有一个真实的实现类，当然也可以构造器注入
     */
    private FoodService foodService = new FoodServiceImpl();

    public Food makeChicken() {
        System.out.println("我们马上要制作鸡肉了");

        // 核心代码是真实实现类做的
        // 代理无非在核心代码前后做些"无足轻重"的事情
        Food food = foodService.makeChicken();

        // 这里决定做一点方法增强 注：pepper 胡椒
        System.out.println("鸡肉制作完成，决定再加点胡椒粉");
        food.setCondiment("pepper");

        return food;
    }

    public Food makeNoodle() {
        System.out.println("我们马上要制作面条了");
        Food food = foodService.makeNoodle();
        System.out.println("面条制作完成");
        return food;
    }
}
