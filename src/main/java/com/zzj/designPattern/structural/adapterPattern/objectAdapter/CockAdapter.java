package com.zzj.designPattern.structural.adapterPattern.objectAdapter;

import com.zzj.designPattern.structural.adapterPattern.objectAdapter.domain.Cock;
import com.zzj.designPattern.structural.adapterPattern.objectAdapter.domain.Duck;

/**
 * 如果我们需要将鸡适配成鸭来用怎么办
 *
 * 自然需要一个 给 对象鸡 的适配器
 *
 * 这个适配器自然就要实现鸭子的接口
 *
 *
 * @author zengzhongjie
 * @date 2020/11/6
 */
public class CockAdapter implements Duck {

    private Cock cock;

    /**
     * 构造方法中需要一个鸡的实例，此类就是将这只鸡适配成鸭来用
     * @param cock
     */
    public CockAdapter(Cock cock) {
        this.cock = cock;
    }

    /**
     * 实现鸭子的嘎嘎叫
     */
    @Override
    public void quack() {
        // 内部实际上是一只鸡的咯咯叫
        cock.gobble();
    }

    @Override
    public void fly() {
        cock.fly();
    }
}
