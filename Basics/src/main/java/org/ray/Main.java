package org.ray;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<String> students = List.of("Name1", "Name2", "Name3", "Name4", "Name5", "Name6");
        getListStudents(students);
        System.out.println("-".repeat(75));
        getStudents();

    }

    private static void getStudents() {
        for (int i = 1; i <= 5; i++) {
            Student students = new Student(
                    switch (i) {
                        case 1 -> "Name1";
                        case 2 -> "Name2";
                        case 3 -> "Name3";
                        case 4 -> "Name4";
                        case 5 -> "Name5";
                        default -> "Anonymous";
                    }, "00" + i, "Java Master Class", "2" + i

            );
            System.out.println(students);
        }
    }

    private static void getListStudents(List<String> names) {
        for (int i = 0; i < names.toArray().length; i++) {
            Student students = new Student(names.get(i), "SBN00" + (i + 1), "Java Master Class", "2" + i);
            System.out.println(students);
        }
    }
}