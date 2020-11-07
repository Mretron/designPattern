package com.zzj.designPattern.construct.prototypePattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 原型模式，无非使用clone接口
 * java 默认浅克隆
 * 可以去重写方法
 * 或者序列化
 * @author zengzhongjie
 * @date 2020/11/1
 */
@Getter
@Setter
@ToString
public class Person implements Cloneable{
    private String name;
    private Person son;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
