package com.loki.developerpattern.creationalpattern.singletonpattern;

/**
 * @Author xujs
 */
public class DJSingletonTest {

    public static void main(String[] args) {
        DJSingleton singleton = DJSingleton.getInstance(null);
        System.out.println(singleton.about());
    }
}
