package com.chinmaya.dsa.math;

public class CountDigits {

    public static void main(String[] args) {
        //1234 -> 4

        int n = 123232;
        System.out.println("Count => " + countDigits(n));
        System.out.println("Recursive way to count digits -> " + recurCountDigits(n));
        System.out.println("String way to find the digit count -> " + strDigitCount(n));
        System.out.println("Log way to find the digit count => " + logDigitCount(n));
    }

    private static int logDigitCount(int n) {
        if ( n == 0 ) {
            return 1;
        }
        return (int) (Math.floor(Math.log10(n)) + 1);
    }

    private static int strDigitCount(int n) {
        return String.valueOf(n).length();
    } // time and space complexity is O(n)

    private static int recurCountDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + recurCountDigits(n / 10);

//        if ( n == 0 ) {
//            return count;
//        }
//
//        return recurCountDigits(n/10, ++count);
    } // time and space complexity is O(logN) and O(logN) respectively

    private static int countDigits(int n) {
        int count = 0;
        while (n !=0 ) {
            n = n / 10; // take the quotient which will give the digit in next place
            count++;
        }
        return count;
    }



}
