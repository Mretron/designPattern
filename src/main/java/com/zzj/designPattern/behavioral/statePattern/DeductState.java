package com.zzj.designPattern.behavioral.statePattern;

/**
 * Deduct:扣除
 * 扣除状态
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class DeductState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("商品卖出，准备减库存");
        context.setState(this);

        //... 执行减库存的具体操作
    }

    @Override
    public String toString() {
        return "Deduct State";
    }
}
