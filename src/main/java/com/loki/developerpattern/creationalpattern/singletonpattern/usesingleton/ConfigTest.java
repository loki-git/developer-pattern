package com.loki.developerpattern.creationalpattern.singletonpattern.usesingleton;

/**
 * @Author xujs
 */
public class ConfigTest {

    public static void main(String[] args) {
        Config singleton = Config.getInstance();
        singleton.init();

        System.out.println(singleton.getInfo());
    }

}
