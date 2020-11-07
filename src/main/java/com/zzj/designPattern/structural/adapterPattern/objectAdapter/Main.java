package com.zzj.designPattern.structural.adapterPattern.objectAdapter;

import com.zzj.designPattern.structural.adapterPattern.objectAdapter.domain.Cock;
import com.zzj.designPattern.structural.adapterPattern.objectAdapter.domain.Duck;
import com.zzj.designPattern.structural.adapterPattern.objectAdapter.domain.WildCock;

/**
 * @author zengzhongjie
 * @date 2020/11/6
 */
public class Main {
    /**
     * 客户端如何使用这个对象适配器
     * @param args
     */
    public static void main(String[] args) {
        // 首先弄一只鸡
        Cock wildCock = new WildCock();

        // 调用适配器，将鸡适配成一致鸭
        Duck duck = new CockAdapter(wildCock);

        // 这里将会打印实际的：鸡的咯咯叫
        duck.quack();
    }
}
