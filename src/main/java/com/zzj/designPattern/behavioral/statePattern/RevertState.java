package com.zzj.designPattern.behavioral.statePattern;

/**
 * Revert：归还
 * 归还状态
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class RevertState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("给此商品补库存");
        context.setState(this);

        //... 执行加库存的具体操作
    }

    @Override
    public String toString() {
        return "Revert State";
    }
}
