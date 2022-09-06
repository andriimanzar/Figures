package com.manzar.shapes;

public class Triangle extends Shape {

    public static final String TRIANGLE_INFO = "This is a triangle!";

    @Override
    public void printShapeName() {
        System.out.println(TRIANGLE_INFO);
    }
}
