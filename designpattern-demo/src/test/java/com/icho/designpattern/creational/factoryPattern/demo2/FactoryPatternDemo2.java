package com.icho.designpattern.creational.factoryPattern.demo2;

import static com.icho.designpattern.creational.factoryPattern.demo2.ShapeType2.*;

/**
 * @Author: icho
 * @Date: 2022/7/18 19:40
 * @Describe:
 */
public class FactoryPatternDemo2 {

    public static void main(String[] args) {
        ShapeFactory2 shapeFactory = new ShapeFactory2();
        Shape2 shape1 = shapeFactory.getShape(CIRCLE);
        shape1.draw();

        Shape2 shape2 = shapeFactory.getShape(RECTANGLE);
        shape2.draw();

        Shape2 shape3 = shapeFactory.getShape(SQUARE);
        shape3.draw();
    }
}
