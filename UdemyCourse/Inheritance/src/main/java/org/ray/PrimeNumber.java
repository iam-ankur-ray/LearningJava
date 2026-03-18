package org.ray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input any number to check if it's prime or not : ");
        int input = scanner.nextInt();
        System.out.println(isPrime(input));

        System.out.print("Please input how many prime numbers up to 10,000 : ");
        int numbers = scanner.nextInt();
        System.out.println(primeNumbers(numbers));
    }


    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> primeNumbers(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 10000; i++) {
            if (isPrime(i)) {
                numbers.add(i);
            }
        }
        return numbers.subList(0, n - 1);
    }
}
