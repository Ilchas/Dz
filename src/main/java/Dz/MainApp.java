package Dz;

import Dz.Animals.Animals;
import Dz.Animals.Cat;
import Dz.Animals.Dog;
import Dz.Animals.Tiger;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik ", " White", 2, 300, 0);
        Cat cat1 = new Cat("Murzik ", " White", 2, 200, 10);
        Dog dog = new Dog("Bob ", "Black", 5, 560, 10);
        Dog dog1 = new Dog("Bob ", "Black", 5, 500, 15);
        Tiger tiger = new Tiger("Far", "Orange", 10, 1000, 100);
        cat.info();
        dog.info();
        tiger.info();
        cat.voice();
        dog.voice();
        tiger.voice();
        cat.rundis();
        dog.rundis();
        tiger.rundis();
        cat.swimdis();
        dog.swimdis();
        tiger.swimdis();
        System.out.println( " Общее колличество животных : " + Animals.getCountAnimal());
        System.out.println( " Колличество кошек : " + Cat.getCountCat());
        System.out.println( " Колличество собак : "  + Dog.getCountDog());
        System.out.println( " Колличество тигров : " + Tiger.getCountTiger());

        Animals[] Animal = {
                new Cat("Murzik ", " White", 2, 400 ,11),
                new Cat("Murzik1 ", " White", 7, 200,10),
                new Dog("Bob ", "Black", 5, 560, 150),
                new Dog("Bob1 ", "Black", 7, 199, 9),
        };
        for (Animals o : Animal){
            o.swimdis(100);
            o.rundis(400);
            o.swimdis(10);
            o.rundis(201);
        }
    }
}