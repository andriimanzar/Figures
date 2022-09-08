package com.manzar.test;

import com.manzar.shapes.*;

import static com.manzar.printers.ShapePrinter.printShapeInfo;

public class ShapeTest {
    public static void main(String[] args) {
        printShapeInfo(new Circle());
        printShapeInfo(new Rectangle());
        printShapeInfo(new Rhombus());
        printShapeInfo(new Square());
        printShapeInfo(new Triangle());
    }
}


