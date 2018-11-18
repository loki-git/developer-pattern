package com.loki.developerpattern.behaviorpattern.strategypattern;

/**
 * @Author xujs
 */
public class StrategyPatternTest {

    public static void main(String[] args) {
        Context contextAdd = new Context(new OperationAdd());
        System.out.println(contextAdd.executeStrategy(8, 9));

        Context contextSub = new Context(new OperationSubstract());
        System.out.println(contextSub.executeStrategy(19, 3));

        Context contextMul = new Context(new OperationMultiply());
        System.out.println(contextMul.executeStrategy(6, 9));
    }

}
