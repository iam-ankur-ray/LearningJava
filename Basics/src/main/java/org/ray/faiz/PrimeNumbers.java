package org.ray.faiz;

import java.util.*;

import static java.lang.Math.sqrt;

public class PrimeNumbers {

    private static TreeSet<Integer> primeNumbers = new TreeSet<>();

    static {
        primeNumbers.add(2);
        primeNumbers.add(3);
    }

    /**
     * Program to get the n number of prime numbers, if users input is 10,
     * we have to return the list of prime numbers between 1-10
     * To check prime number we can check it via loop.
     */

    public static void getPrimeNumbersList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of test cases : ");
        int counter = sc.nextInt();
        while (counter > 0) {
            System.out.print("Enter the digit up-to which you want to find the prime numbers : ");
            int n = sc.nextInt();
            Set<Integer> integers = getIntegers(n);

            System.out.println("Prime numbers up to " + n + ": " + integers);
            counter--;
        }
    }

    private static Set<Integer> getIntegers(int n) {

        int highestPrime = primeNumbers.last();

        if(highestPrime >= n) {
            return primeNumbers.headSet(n, true);
        }


        for (int num = highestPrime + 2; num <= n; num+=2) {
            boolean isPrime = true;
            for (int i = 2; i <= sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumbers.add(num);
            }
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        getPrimeNumbersList();
    }

    /**
     * Now the task is to generate prime numbers without doing any calculation in the loop
     * Step 1. Assume that 2 is a prime number and all multiple of two are not
     * Step 2: Increment the original number and check if it is multiple of previous any number and if not then assume it is also prime
     * i.e., 3 is prime, after increment 4 is not as multiple of 2 then 5 is prime and so on....
     */

    public static Set<Integer> listOfUniquePrimes(int n) {
        return null;
    }
}
