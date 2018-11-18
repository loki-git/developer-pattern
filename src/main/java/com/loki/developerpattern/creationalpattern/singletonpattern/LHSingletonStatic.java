package com.loki.developerpattern.creationalpattern.singletonpattern;

/**
 * @Author xujs
 * 设计模式-单例模式
 * 懒汉式单例静态内部类，解决线程安全问题
 * 该方式既实现了线程安全，又避免了同步带来的性能影响
 */
public class LHSingletonStatic {

    private String name;

    private static class LazyHolder {
        private static final LHSingletonStatic INSTANCE = new LHSingletonStatic();
    }

    public LHSingletonStatic() {}

    public static final LHSingletonStatic getInstance() {
        return LazyHolder.INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("output message:" + name);
    }

}
