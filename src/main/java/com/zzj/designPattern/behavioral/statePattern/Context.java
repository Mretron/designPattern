package com.zzj.designPattern.behavioral.statePattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Context {
    /**
     * 当前的状态
     */
    private State state;

    private String name;

    public Context(String name) {
        this.name = name;
    }
    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
