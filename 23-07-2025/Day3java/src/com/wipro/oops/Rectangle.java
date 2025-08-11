package com.wipro.oops;

public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle() {}

    public Rectangle(String color, double length, double breadth) {
        super(color);  // Call constructor of Shape
        this.length = length;
        this.breadth = breadth;
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    // Setters
    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    // toString
    @Override
    public String toString() {
        return "Rectangle [Color=" + getColor() + ", Length=" + length + ", Breadth=" + breadth + "]";
    }
}
