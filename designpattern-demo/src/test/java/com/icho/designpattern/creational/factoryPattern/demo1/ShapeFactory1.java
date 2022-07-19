package com.icho.designpattern.creational.factoryPattern.demo1;

/**
 * @Author: icho
 * @Date: 2022/7/18 19:26
 * @Describe:
 */
public class ShapeFactory1 {

    // 使用getShape方法来获取形状类型的对象
    public Shape1 getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if ("CIRCLE".equals(shapeType)) {
            return new Circle1();
        } else if ("RECTANGLE".equals(shapeType)) {
            return new Rectangle1();
        } else if ("SQUARE".equals(shapeType)) {
            return new Square1();
        }
        return null;
    }
}
