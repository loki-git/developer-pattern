package com.loki.developerpattern.creationalpattern.singletonpattern;

/**
 * @Author xujs
 * 设计模式-单例模式
 * 懒汉式单例-在第一次调用的时候实例化自己
 * 注意：懒汉式单例是线程不安全的，并发环境下很可能出现多个Sington实例。
 */
public class LHSingleton {

    public LHSingleton() {}

    private static LHSingleton lhSingleton = null;

    public static LHSingleton getInstance() {
        if (lhSingleton == null) {
            System.out.println("多线程--------重新取得新实例");
            lhSingleton = new LHSingleton();
        }

        return lhSingleton;
    }

    public void getName() {
        System.out.println("I am LHSingleton");
    }

}
