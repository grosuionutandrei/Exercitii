package com.company;

import java.util.LinkedList;
import java.util.List;

public class PerechiDeNumereGemene {
    public static void main(String[] args) {
        int x = 5;
        numereGemene(x);

    }

    private static void numereGemene(int x) {

        List<Integer> primeNumbers = new LinkedList<>();
        Boolean isPrime = true;
        for (int i = 1; i <= 100; i++) {
            isPrime = true;
            for (int j = i-1; j >=2; j--) {
                if (i % j == 0) {
                    isPrime = false;

                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }

        }

        getTwinnumbers(primeNumbers,x);
    }
    private static void getTwinnumbers(List<Integer> primes,int x) {
        int count = 0;
        for (int i = 0; i <= primes.size() - 2; i++) {
            if (primes.get(i + 1) == primes.get(i) + 2) {
                count++;
                System.out.println(primes.get(i) + " " + primes.get(i + 1));
                if(count==x){
                    break;
                }
            }
        }
    }
}
