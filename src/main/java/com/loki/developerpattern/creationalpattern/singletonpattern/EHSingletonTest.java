package com.loki.developerpattern.creationalpattern.singletonpattern;

/**
 * @Author xujs
 */
public class EHSingletonTest {

    public static void main(String[] args) {
        EHSingleton singleton = EHSingleton.getInstance();
        EHSingleton singleton1 = EHSingleton.getInstance();

        System.out.println(singleton == singleton1);
    }

}
