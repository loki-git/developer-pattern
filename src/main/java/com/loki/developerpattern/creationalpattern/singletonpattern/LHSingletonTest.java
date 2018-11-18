package com.loki.developerpattern.creationalpattern.singletonpattern;

/**
 * @Author xujs
 */
public class LHSingletonTest {

    public static void main(String[] args) {
        /*LHSingleton lhSingleton = LHSingleton.getInstance();
        lhSingleton.getName();

        LHSingleton lhSingleton1 = LHSingleton.getInstance();
        lhSingleton1.getName();

        System.out.println(lhSingleton == lhSingleton1);*/

        MultiThread multiThread = new MultiThread();
        for (int i = 0; i < 10; i++) {
            new Thread(multiThread).start();
        }
    }

    static class MultiThread implements Runnable {
        @Override
        public void run() {
            LHSingleton lhSingleton = LHSingleton.getInstance();
        }
    }

}
