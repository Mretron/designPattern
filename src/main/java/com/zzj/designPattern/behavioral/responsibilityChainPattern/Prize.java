package com.zzj.designPattern.behavioral.responsibilityChainPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Prize extends Context{
    @Override
    public boolean isNewUser() {
        return true;
    }

    @Override
    public String getLocation() {
        return "四川省";
    }

    @Override
    public int getLeftCount() {
        return 10;
    }
}
