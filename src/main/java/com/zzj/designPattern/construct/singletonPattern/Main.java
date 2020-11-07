package com.zzj.designPattern.construct.singletonPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class Main {
    public static void main(String[] args) {

        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        FullSingleton fullSingleton = FullSingleton.getInstance();

        HangerSingleton hangerSingleton = HangerSingleton.getSingleton();

        NestedSingleton nestedSingleton = NestedSingleton.getInstance();

    }
}
