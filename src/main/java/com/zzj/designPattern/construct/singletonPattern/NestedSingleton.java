package com.zzj.designPattern.construct.singletonPattern;

/**
 * 嵌套类最经典，建议常用它
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class NestedSingleton {

    /**
     * 首先避免公开
     */
    private NestedSingleton(){};

    /**
     * 私有的内部static嵌套类
     * 这个嵌套类内部有 私有静态 的单例对象instance
     */
    private static class Holder {
        private static NestedSingleton instance = new NestedSingleton();
    }

    /**
     * 通过公开静态方法返回这个 嵌套类的内部私有单例对象
     * @return
     */
    public static NestedSingleton getInstance() {
        return Holder.instance;
    }

}
