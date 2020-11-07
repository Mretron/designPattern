package com.zzj.designPattern.behavioral.responsibilityChainPattern;



/**
 * 校验用户是否是新用户
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class NewUserRuleHandler extends RuleHandler{

    @Override
    public void apply(Context context) {
        if(context.isNewUser()) {
            // 满足条件
            // 如果有后继节点，传递下去
            if(this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("该活动仅限新用户参与");
        }
    }
}
