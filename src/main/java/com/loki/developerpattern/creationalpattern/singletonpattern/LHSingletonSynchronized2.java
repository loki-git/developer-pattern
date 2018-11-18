package com.loki.developerpattern.creationalpattern.singletonpattern;

/**
 * @Author xujs
 * 设计模式-单例模式
 * 懒汉式单例双重检查锁定，解决线程安全问题
 */
public class LHSingletonSynchronized2 {

    public LHSingletonSynchronized2() {}

    private static LHSingletonSynchronized2 singleton = null;

    public static LHSingletonSynchronized2 getInstance() {
        if (singleton == null) {
            synchronized (LHSingletonSynchronized2.class) {
                if (singleton == null) {
                    singleton = new LHSingletonSynchronized2();
                }
            }
        }
        return singleton;
    }

    public void getInfo() {
        System.out.println("懒汉模式之双重检查锁定");
    }

}
