package com.wipro.oops;

public class Square extends Shape {
    private double side;

    public Square() {}

    public Square(String color, double side) {
        super(color);  // Call parent class constructor
        this.side = side;
    }

    // Getter
    public double getSide() {
        return side;
    }

    // Setter
    public void setSide(double side) {
        this.side = side;
    }

    // toString
    @Override
    public String toString() {
        return "Square [Color=" + getColor() + ", Side=" + side + "]";
    }
}
