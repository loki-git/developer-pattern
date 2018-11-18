package com.loki.developerpattern.creationalpattern.singletonpattern;

/**
 * @Author xujs
 * 设计模式-单例模式（饿汉式单例）
 * 饿汉式单例类,在类初始化的时,已经自行实例化
 * 饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的
 */
public class EHSingleton {

    public EHSingleton() {}

    private static final EHSingleton singleton = new EHSingleton();

    public static EHSingleton getInstance() {
        return singleton;
    }

}
