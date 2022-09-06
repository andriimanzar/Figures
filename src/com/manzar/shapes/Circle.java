package com.manzar.shapes;

public class Circle extends Shape {

    public static final String CIRCLE_INFO = "This is a circle!";

    @Override
    public void printShapeName() {
        System.out.println(CIRCLE_INFO);
    }
}
