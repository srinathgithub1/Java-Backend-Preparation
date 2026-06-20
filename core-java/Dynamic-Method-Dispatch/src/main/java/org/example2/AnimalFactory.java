package org.example2;

public class AnimalFactory {

    public Animal getAnimal()
        {
            Dog d = new Dog();
            d.display();
            return new Dog();
        }

    public Dog getAnimal2()
        {
            Dog d = new Dog();
            d.display();
//            return new Animal();// it is not possible
            /**
             * Java sees this ---> Dog d=new Animal();
             * which is not possible because all Animal is not Dog.
             */
            return new Dog();//it is valid.
        }
}
