package com.icho.designpattern.creational.factoryPattern.demo2;

import com.icho.designpattern.creational.factoryPattern.demo1.Shape1;

/**
 * @Author: icho
 * @Date: 2022/7/18 19:26
 * @Describe:
 */
public class Circle2 implements Shape2 {

    @Override
    public void draw() {
        System.out.println("Circle is drawing...");
    }
}
