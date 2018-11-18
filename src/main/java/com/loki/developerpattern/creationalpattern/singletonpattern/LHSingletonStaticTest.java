package com.loki.developerpattern.creationalpattern.singletonpattern;

/**
 * @Author xujs
 */
public class LHSingletonStaticTest {

    public static void main(String[] args) {
        LHSingletonStatic lhSingletonStatic = LHSingletonStatic.getInstance();
        lhSingletonStatic.setName("懒汉-静态内部类");

        System.out.println(lhSingletonStatic.getName());

        LHSingletonStatic lhSingletonStatic1 = LHSingletonStatic.getInstance();
        lhSingletonStatic1.setName("懒汉-静态内部类");
        System.out.println(lhSingletonStatic1.getName());

        lhSingletonStatic.getInfo();
        lhSingletonStatic1.getInfo();

        if (lhSingletonStatic == lhSingletonStatic1) {
            System.out.println("创建的是同一个实例");
        } else if (lhSingletonStatic != lhSingletonStatic1) {
            System.out.println("创建的不是同一个实例");
        } else {
            System.out.println("application error");
        }

    }

}
