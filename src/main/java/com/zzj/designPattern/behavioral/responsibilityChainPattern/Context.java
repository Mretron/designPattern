package com.zzj.designPattern.behavioral.responsibilityChainPattern;

import com.zzj.designPattern.behavioral.strategyPattern.Strategy;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public abstract class Context {


    /**
     * 判断是否是新用户
     * @return
     */
    public abstract boolean isNewUser();

    /**
     * 返回地址
     * @return
     */
    public abstract String getLocation();

    /**
     * 返回剩余数量
     * @return
     */
    public abstract int getLeftCount();

}
