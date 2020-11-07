package com.zzj.designPattern.behavioral.statePattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public interface State {
    /**
     * 当前状态的反应
     * @param context
     */
    void doAction(Context context);
}
