package com.zzj.designPattern.construct.builderPattern;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class Main {
    public static void main(String[] args) {
        User d = User.builder().name("zzj").password("zzj").nickname("zzj").age(1).build();
        Person person = Person.builder().name("dsa").password("dssa").build();
    }
}
