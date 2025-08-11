package com.wipro.oops;

public class Circle extends Shape {
    private double radius;

    public Circle() {}

    public Circle(String color, double radius) {
        super(color);  // Call parent constructor from Shape
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // toString
    @Override
    public String toString() {
        return "Circle [Color=" + getColor() + ", Radius=" + radius + "]";
    }
}
