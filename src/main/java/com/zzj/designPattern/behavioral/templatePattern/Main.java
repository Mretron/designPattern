package com.zzj.designPattern.behavioral.templatePattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Main {
    public static void main(String[] args) {
        AbstractTemplate t = new ConcreteTemplate();

        // 调用模板方法
        t.templateMethod();
    }
}
