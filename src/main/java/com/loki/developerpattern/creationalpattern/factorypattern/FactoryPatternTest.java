package com.loki.developerpattern.creationalpattern.factorypattern;

/**
 * @Author xujs
 */
public class FactoryPatternTest {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // 获取circle的对象，并调用它的draw()方法
        Shape shapeCircle = shapeFactory.getShape("CIRCLE");
        shapeCircle.draw();

        // 获取Rectangle的对象，并调用它的draw()方法
        Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");
        shapeRectangle.draw();

        // 获取Square的对象，并调用它的draw()方法
        Shape shapeSquare = shapeFactory.getShape("SQUARE");
        shapeSquare.draw();
    }

}
