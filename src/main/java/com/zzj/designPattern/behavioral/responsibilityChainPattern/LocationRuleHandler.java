package com.zzj.designPattern.behavioral.responsibilityChainPattern;



/**
 * 校验用户所在地区是否可以参与
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class LocationRuleHandler extends RuleHandler{

    @Override
    public void apply(Context context) {

        if(context.getLocation() != null && (!context.getLocation().equals(""))) {
            // 满足条件
            // 如果有后继节点，传递下去
            if(this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("非常抱歉，您所在的地区无法参与本次活动");
        }
    }
}
