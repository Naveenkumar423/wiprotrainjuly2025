package com.wipro.oops.test;

import com.wipro.oops.Circle;
import com.wipro.oops.Rectangle;
import com.wipro.oops.Square;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 4.5);
        Rectangle rectangle = new Rectangle("Blue", 6.0, 3.5);
        Square square = new Square("Green", 5.0);

        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}

