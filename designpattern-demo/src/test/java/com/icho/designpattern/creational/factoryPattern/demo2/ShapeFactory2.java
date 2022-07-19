package com.icho.designpattern.creational.factoryPattern.demo2;

/**
 * @Author: icho
 * @Date: 2022/7/18 19:43
 * @Describe:
 */
public class ShapeFactory2 {

    public Shape2 getShape(ShapeType2 shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle2();
            case RECTANGLE:
                return new Rectangle2();
            case SQUARE:
                return new Square2();
            default :
                throw new UnsupportedOperationException();
        }
    }
}
