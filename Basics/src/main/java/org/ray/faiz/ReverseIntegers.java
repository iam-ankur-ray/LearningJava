package org.ray.faiz;

import java.util.ArrayList;
import java.util.List;

public class ReverseIntegers {
    public static void main(String[] args) {
    System.out.println(getReverseNumber(8963));

    }

    /**
     * if input is number = 56471
     * output should be = 17465, reverse the number do it first
     */
    public static int getReverseNumber(int number){
        if(number < 10){
            return number;
        }
        int digits = getDigits(number);
        int reverseNumber = 0;
        List<Integer> remainders = new ArrayList<>(digits - 1);
        for(int i = 0; number > 0; i++) {
            int remainder = number % 10;
                remainders.add(remainder);
            number = number / 10;


        }
        int multiple = remainders.size()-1;
        for(int j = 0; j < remainders.size()-1; j++){
            int remainderNumber = (int) (remainders.get(j) * Math.pow(10,multiple));
            multiple--;
            reverseNumber = reverseNumber + remainderNumber;
        }
        return reverseNumber + remainders.get(remainders.size()-1);
    }

    /**
     * To get the reverse will find out the number of digits in a number
     */
    public static int getDigits(int number) {
        int digits = 0;
        while (number > 0){
            number = number / 10;
            digits++;
        }
        return digits;
    }

}
