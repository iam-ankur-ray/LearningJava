package org.ray;

public class Animal {
    private String type;
    private String size;
    private double weight;

    public Animal(String type, String speed, double weight) {
        this.type = type;
        this.size = speed;
        this.weight = weight;
    }

    public Animal (){}

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", speed='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void makeSound() {
        System.out.println(type + " is making some sound");
    }

    public void running(String speed) {
        System.out.println(type + " is running " + speed);
    }
}
