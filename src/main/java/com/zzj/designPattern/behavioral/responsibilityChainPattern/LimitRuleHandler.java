package com.zzj.designPattern.behavioral.responsibilityChainPattern;



/**
 * 校验奖品是否已领完
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class LimitRuleHandler extends RuleHandler{

    @Override
    public void apply(Context context) {

        if(context.getLeftCount() > 0) {
            // 满足条件
            // 如果有后继节点，传递下去
            if(this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("您来得太晚了，奖品被领完了");
        }
    }
}
