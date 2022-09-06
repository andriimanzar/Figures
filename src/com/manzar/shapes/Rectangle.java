package com.manzar.shapes;

public class Rectangle extends Shape {

    public static final String RECTANGLE_INFO = "This is a rectangle!";

    @Override
    public void printShapeName() {
        System.out.println(RECTANGLE_INFO);
    }
}
