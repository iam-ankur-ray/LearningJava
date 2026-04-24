package org.ray.faiz;


import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class NumericalQuestions {

    public static void main(String[] args) {
//        while(true) {
//            System.out.println(countDigitsInAnInteger());
//        }
        printTable(52);
    }

    /**
     * count the number of digits in a number;
     */
    public static int countDigitsInAnInteger() {


            Scanner sc = new Scanner(System.in);
            System.out.print("Please input any digit below " + MAX_VALUE + " : ");
            int n = sc.nextInt();
            while (n > MAX_VALUE) {
                System.out.println("Please input less than " + MAX_VALUE);
            }

            int counter = 0;
            int Tenth = 10;
            for (int i = 0; i < n; ) {
                n = n / Tenth;
                counter++;
            }
            return counter;
    }


    /**
     * if input is n = 56471
     * output should be = 17465, reverse the number do it first
     */


    /**
     * Multiplication of any number n from 1-10
     */
    public static void printTable(int n) {
        int k = n;
        for(int i = 1; i < 11;  i++){
            System.out.println(n + " X " + i + " = " + k);
            k += n;
            //Read more about string builder, string format(String concatenation methods)
        }
    }

    // JDK, JRE and JVM

}
