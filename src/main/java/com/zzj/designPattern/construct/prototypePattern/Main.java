package com.zzj.designPattern.construct.prototypePattern;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person jack = new Person();
        jack.setName("jack");
        Person jack_son = new Person();
        jack_son.setName("jsck_son");

        Person clone_jack = (Person) jack.clone();
        System.out.println(jack == clone_jack);
        System.out.println(jack.getName() == clone_jack.getName());
        // 默认浅克隆，所以会是同一个儿子
        System.out.println(jack.getSon() == clone_jack.getSon());
    }
}
