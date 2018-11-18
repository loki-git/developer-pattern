package com.loki.developerpattern.creationalpattern.singletonpattern;

/**
 * @Author xujs
 */
public class LHSingletonSynchronizedTest {

    public static void main(String[] args) {
        /*LHSingletonSynchronized singleton = LHSingletonSynchronized.getInstance();
        singleton.getInfo();

        LHSingletonSynchronized singleton1 = LHSingletonSynchronized.getInstance();
        singleton1.getInfo();

        System.out.println(singleton == singleton1);*/

        MultiThread multiThread = new MultiThread();
        for (int i = 0; i < 10; i++) {
            new Thread(multiThread).start();
        }
    }

    static class MultiThread implements Runnable {
        @Override
        public void run() {
            LHSingletonSynchronized singleton = LHSingletonSynchronized.getInstance();
        }
    }

}
