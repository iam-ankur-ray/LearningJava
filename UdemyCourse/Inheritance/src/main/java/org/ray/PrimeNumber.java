package org.ray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PrimeNumber {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please input any number to check if it's prime or not : ");
//        int input = scanner.nextInt();
//        System.out.println(isPrime(input));
//
//        System.out.print("Please input how many prime numbers you want to check : ");
//        int numbers = scanner.nextInt();
//        System.out.println(getPrimesNumbers(numbers));
        System.out.println(getUptoNthPrimes(4));


    }


    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * TODO: Get first nth prime numbers by checking only prime factors
     *
     * @param n
     * @return List of 0-n prime numbers as a list
     */
    public static List<Integer> getPrimesNumbers(int n) {
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);

        if (n > 2) {
            for (int i = 5; primes.size() <= n; i += 2) {
                boolean prime = true;
                for (int j : primes) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    primes.add(i);
                }
            }
        }

        return primes.subList(0, n);

    }

    /**
     * 1. Ek pehle optimization kiya tha jo ab missing h..
     * 2. And isko is tarah socho ki ye method multiple times call hoga with different values of n
     * to aisa kya change kre ki processing repeat na ho..
     */

    private static List<Integer> getUptoNthPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        if(n==1){
            return null;
        }
        primes.add(2);

        if (n==2){
            return primes;
        }

        if (n==3 ) {
            primes.add(3);
            return primes;
        }


        if (n > 3) {
            for (int i = 5; i < n; i += 2) {
                if (isPrime(i)) {
                    primes.add(i);
                }

            }
        }
        return primes;
    }


}
