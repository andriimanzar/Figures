package com.manzar.printers;

import com.manzar.shapes.Shape;

public class ShapePrinter {

    public static final String SHAPE_INFO = "This is a %s!\n";


    public static void printShapeInfo(Shape shape) {
        System.out.printf(SHAPE_INFO, shape.getShapeTitle());
    }
}
