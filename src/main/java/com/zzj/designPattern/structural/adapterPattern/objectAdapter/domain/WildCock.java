package com.zzj.designPattern.structural.adapterPattern.objectAdapter.domain;

/**
 * @author zengzhongjie
 * @date 2020/11/6
 */
public class WildCock implements Cock{
    public void gobble() {
        System.out.println("鸡的咯咯叫");
    }

    public void fly() {
        System.out.println("鸡也会飞");
    }
}
