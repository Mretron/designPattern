package com.zzj.designPattern.behavioral.strategyPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Main {
    public static void main(String[] args) {
        // 使用绿色画
        Context context = new Context(new GreenPen());
        context.executeDraw(10, 1, 1);
    }
}
