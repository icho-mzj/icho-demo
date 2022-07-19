package com.icho.designpattern.creational.factoryPattern.demo3;

import static com.icho.designpattern.creational.factoryPattern.demo3.ShapeType3.*;

/**
 * @Author: icho
 * @Date: 2022/7/18 20:08
 * @Describe:
 */
public class ShapeFactoryDemo3 {

    public static void main(String[] args) {
        ShapeFactory3 shapeFactory = new ShapeFactory3();

        Shape3 shape1 = shapeFactory.getShape(CIRCLE);
        shape1.draw();

        Shape3 shape2 = shapeFactory.getShape(RECTANGLE);
        shape2.draw();

        Shape3 shape3 = shapeFactory.getShape(SQUARE);
        shape3.draw();
    }
}
