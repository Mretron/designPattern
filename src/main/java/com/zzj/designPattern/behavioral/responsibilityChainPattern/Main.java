package com.zzj.designPattern.behavioral.responsibilityChainPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/7
 */
public class Main {
    public static void main(String[] args) {

        Context prize = new Prize();

        RuleHandler newUserRuleHandler = new NewUserRuleHandler();
        RuleHandler locationRuleHandler = new LocationRuleHandler();
        RuleHandler limitRuleHandler = new LimitRuleHandler();

        newUserRuleHandler.setSuccessor(locationRuleHandler);
        locationRuleHandler.setSuccessor(limitRuleHandler);

        newUserRuleHandler.apply(prize);
    }
}
