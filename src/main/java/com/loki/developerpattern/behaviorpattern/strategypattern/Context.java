package com.loki.developerpattern.behaviorpattern.strategypattern;

/**
 * @Author xujs
 * 类似工程模式中的工厂
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

}
