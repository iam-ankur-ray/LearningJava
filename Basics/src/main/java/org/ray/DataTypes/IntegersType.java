package org.ray.DataTypes;



public class IntegersType {
    //We can define integers and related data type by this line of
    // DataType ReferenceName = Value

    //For example

    int salary = 85000;




    // Now to get this value in our main app we can create the object of this class by get method we can
    // call this reference to print the value of salary

    public int getSalary() {
        return this.salary; //Here the keyword this refer to the line 9 where we first defined the salary
    }
}
