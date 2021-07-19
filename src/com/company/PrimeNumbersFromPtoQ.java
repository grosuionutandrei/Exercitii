package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbersFromPtoQ {
    public static void main(String[] args) {
        int[] startStop = new int[2];

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Insert start index");
            startStop[0] = sc.nextInt();
            System.out.println("Insert  stop index");
            startStop[1] = sc.nextInt();
        }

        intervalPrimes(startStop);

    }

    private static void intervalPrimes(int[] ints) {
        boolean isPrime = true;
        for (int i = ints[0]; i <= ints[1]; i++) {
            isPrime=true;
            for(int j = 2;j<(i/2);j++){ /* aici mi-am adus aminte ca pot sa il imbunatatesc*/
                if(i%j==0){
                    isPrime=false;
                     continue;
                }
            }
            if(isPrime){
                System.out.println(i);
            }

        }

    }
}
