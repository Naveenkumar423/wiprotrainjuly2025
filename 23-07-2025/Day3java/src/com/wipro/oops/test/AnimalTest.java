package com.wipro.oops.test;

import com.wipro.oops.Animal;
import com.wipro.oops.Human;
import com.wipro.oops.Bird;
import com.wipro.oops.Dog;

public class AnimalTest {
    public static void main(String[] args) {
        Animal human = new Human("Naveen");
        Animal bird = new Bird("Crow");
        Animal dog = new Dog("Trever");

        human.makeSound();
        human.sleep();

        bird.makeSound();
        bird.sleep();

        dog.makeSound();
        dog.sleep();
    }
}
