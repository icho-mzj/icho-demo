package com.icho.designpattern.creational.factoryPattern.demo1;

/**
 * @Author: icho
 * @Date: 2022/7/18 19:29
 * @Describe:
 */
public class FactoryPatternDemo1 {

    public static void main(String[] args) {
        ShapeFactory1 shapeFactory = new ShapeFactory1();
        Shape1 shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape1 shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape1 shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
