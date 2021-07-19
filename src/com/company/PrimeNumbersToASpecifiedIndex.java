package com.company;

import java.util.*;

public class PrimeNumbersToASpecifiedIndex {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int index = sc.nextInt();
            generateNumbers(index);
        }
    }
    private static void generateNumbers(int x) {
        int w = 0;
        boolean  isPrime = true;
        for (int i = 2; i <= (x*x); i++) {
            isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    continue;
                }
            }
            if (isPrime) {
                System.out.println(i);
                w++;
                if(w>=x){
                    break;
                }
            }
        }
        System.out.println(w);
    }


}
