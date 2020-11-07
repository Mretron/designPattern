package com.zzj.designPattern.behavioral.strategyPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeDraw(int radius, int x, int y) {
         strategy.draw(radius, x, y);
    }
}
