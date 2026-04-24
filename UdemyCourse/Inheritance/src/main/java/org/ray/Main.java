package org.ray;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Rhino","slow",152.65);
        doAnimalStuff(animal,"slow");
        int[] nums = {2,4,6,4,7,5,7,3};
        twoSum(nums,8);
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeSound();
        animal.running(speed);
        System.out.println(animal);
    }

    public static List<Integer> twoSum(int[] nums, int target) {

        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < numbers.toArray().length; i++){
            if(numbers.get(i) + numbers.get(i+1) == target) {
                numbers.add(i);
                numbers.add(i+1);
            }
        }
        return numbers;
    }
}