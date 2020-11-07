package com.zzj.designPattern.behavioral.responsibilityChainPattern;



/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public abstract class RuleHandler {

    /**
     * 后继节点
     * successor:接班人
     */
    protected RuleHandler successor;

    /**
     * 当前的责任，如检查是否符合当前需要的标准
     * @param context
     */
    public abstract void apply(Context context);

    public void setSuccessor(RuleHandler successor) {
        this.successor = successor;
    }

    public RuleHandler getSuccessor() {
        return successor;
    }
}
