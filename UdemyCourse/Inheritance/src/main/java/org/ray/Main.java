package org.ray;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Rhino","slow",152.65);
        doAnimalStuff(animal,"slow");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeSound();
        animal.running(speed);
        System.out.println(animal);
    }
}