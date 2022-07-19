package com.icho.designpattern.creational.factoryPattern.demo3;

/**
 * @Author: icho
 * @Date: 2022/7/18 20:05
 * @Describe:
 */
public class ShapeFactory3 {

    public Shape3 getShape(ShapeType3 shapeType) {
        String className = shapeType.getClassName();
        Shape3 shape;
        try {
            Class<?> clazz = Class.forName(className);
            shape = (Shape3) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return shape;
    }
}
