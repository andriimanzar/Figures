package com.manzar.shapes;

public class Square extends Shape {

    public static final String SQUARE_INFO = "This is a square!";

    @Override
    public void printShapeName() {
        System.out.println(SQUARE_INFO);
    }
}
