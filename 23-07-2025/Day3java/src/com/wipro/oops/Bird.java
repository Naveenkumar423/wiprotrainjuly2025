package com.wipro.oops;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(name + " chirps: craww crawww!");
    }
}
