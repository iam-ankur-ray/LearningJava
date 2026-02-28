package org.ray;

import org.ray.DataTypes.Integers;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       Integers name = new Integers();  // Here we created the object of Class Integers which is present in DataTypes
        int salary = name.getSalary(); // Referred the class object in salary
        System.out.println("Salary is :" + salary); // Finally printed the salary by concatenating the string and value
    }

}