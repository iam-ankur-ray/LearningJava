package org.ray;

import org.ray.DataTypes.CharacterType;
import org.ray.DataTypes.IntegersType;
import org.ray.DataTypes.StringType;

public class Main {
    public static void main(String[] args) {
       IntegersType name = new IntegersType();  // Here we created the object of Class Integers which is present in DataTypes
        int salary = name.getSalary(); // Referred the class object in salary
        System.out.println("Salary is :" + salary); // Finally printed the salary by concatenating the string and value
        StringType person = new StringType("Ankur","ankur@ray.com","Delhi");
        System.out.println(person);
        CharacterType characterType = new CharacterType();
        characterType.printAlphabets();
  }

}