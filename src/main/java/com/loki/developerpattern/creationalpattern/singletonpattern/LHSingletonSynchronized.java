package com.loki.developerpattern.creationalpattern.singletonpattern;

/**
 * @Author xujs
 * 设计模式-单例模式
 * 懒汉式单例在getInstance方法上加同步，解决线程安全问题
 */
public class LHSingletonSynchronized {

    public LHSingletonSynchronized() {}

    private static LHSingletonSynchronized singleton = null;

    public synchronized static LHSingletonSynchronized getInstance() {
        if (singleton == null) {
            System.out.println("多线程---------重新取得单例实例");
            singleton = new LHSingletonSynchronized();
        }
        return singleton;
    }

    public void getInfo() {
        System.out.println("hello 懒汉单例");
    }

}
