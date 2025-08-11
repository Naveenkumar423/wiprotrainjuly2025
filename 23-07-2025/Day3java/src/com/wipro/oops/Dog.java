package com.wipro.oops;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println(name + " barks: Woof woof!");
    }
}
