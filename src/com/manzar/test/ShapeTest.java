package com.manzar.test;

import com.manzar.shapes.*;

public class ShapeTest {
    public static void main(String[] args) {
        printShape(new Circle());
        printShape(new Rectangle());
        printShape(new Rhombus());
        printShape(new Square());
        printShape(new Triangle());
    }

    private static void printShape(Shape shape) {
        shape.printShapeName();
    }
}
