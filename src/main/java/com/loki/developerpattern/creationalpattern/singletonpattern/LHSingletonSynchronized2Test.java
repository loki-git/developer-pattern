package com.loki.developerpattern.creationalpattern.singletonpattern;

/**
 * @Author xujs
 */
public class LHSingletonSynchronized2Test {

    public static void main(String[] args) {
        LHSingletonSynchronized2 singleton = LHSingletonSynchronized2.getInstance();
        singleton.getInfo();

        LHSingletonSynchronized2 singleton1 = LHSingletonSynchronized2.getInstance();
        singleton1.getInfo();

        System.out.println(singleton == singleton1);
    }

}
