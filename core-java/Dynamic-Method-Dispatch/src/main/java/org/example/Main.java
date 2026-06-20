package org.example;


import org.example2.Animal;
import org.example2.AnimalFactory;


public class Main {
    public static void main(String[] args) {

        System.out.println("----------Covariant Return Types.------------");
        AnimalFactory animalFactory = new AnimalFactory();
        animalFactory.getAnimal();
        animalFactory.getAnimal2();

    }
}