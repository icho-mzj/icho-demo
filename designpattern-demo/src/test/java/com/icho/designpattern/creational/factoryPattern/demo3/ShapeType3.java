package com.icho.designpattern.creational.factoryPattern.demo3;

import lombok.Getter;

/**
 * @Author: icho
 * @Date: 2022/7/18 20:02
 * @Describe:
 */
public enum ShapeType3 {
    CIRCLE("com.icho.designpattern.creational.factoryPattern.demo3.Circle3"),
    RECTANGLE("com.icho.designpattern.creational.factoryPattern.demo3.Rectangle3"),
    SQUARE("com.icho.designpattern.creational.factoryPattern.demo3.Square3");

    @Getter
    private String className;

    ShapeType3(String className) {
        this.className = className;
    }
}
