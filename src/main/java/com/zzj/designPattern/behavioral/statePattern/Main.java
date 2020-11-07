package com.zzj.designPattern.behavioral.statePattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context("iPhone X");

        // 进行补库存操作
        State revertState = new RevertState();
        revertState.doAction(context);

        // 进行减库存操作
        State deductState = new DeductState();
        deductState.doAction(context);

        // 如果需要我们可以获取当前的状态
        // context.getState().toString();

    }
}
