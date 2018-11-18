package com.loki.developerpattern.behaviorpattern.strategypattern;

/**
 * @Author xujs
 */
public class OperationAdd implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }

}
