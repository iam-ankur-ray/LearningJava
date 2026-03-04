package org.ray.DataTypes;

public class DoubleType {

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double salary;

    public DoubleType(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        DoubleType doubleType = new DoubleType(5236.54);
        System.out.println(doubleType.getSalary());
    }
}
