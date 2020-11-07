package com.zzj.designPattern.structural.proxyPattern;

import com.zzj.designPattern.structural.proxyPattern.domain.Food;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public interface FoodService {

    /**
     * 制作鸡
     * @return
     */
    Food makeChicken();

    /**
     * 制作面条
     * @return
     */
    Food makeNoodle();
}
