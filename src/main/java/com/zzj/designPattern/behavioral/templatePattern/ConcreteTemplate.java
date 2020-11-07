package com.zzj.designPattern.behavioral.templatePattern;

/**
 * Concrete:具体，实际
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class ConcreteTemplate extends AbstractTemplate{
    @Override
    protected void apply() {
        System.out.println("子类实现抽象方法 apply");
    }

    @Override
    protected void end() {
        System.out.println("我们可以把 method3 当做钩子方法来使用，需要的时候覆写就可以了");
    }
}
