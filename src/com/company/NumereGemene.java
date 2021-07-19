package com.company;

import java.util.LinkedList;
import java.util.List;



public class NumereGemene {
    public static void main(String[] args) {
        int x = 100;
        numereGemene(x);
    }

    private static void numereGemene(int x) {
        List<Integer> primeNumbers = new LinkedList<>();
        Boolean isPrime = true;
        for (int i = 1; i <= x; i++) {
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

        getTwinnumbers(primeNumbers);
    }
    private static void getTwinnumbers(List<Integer> primes) {
        for (int i = 0; i <= primes.size() - 2; i++) {
            if (primes.get(i + 1) == primes.get(i) + 2) {
                System.out.println(primes.get(i) + " " + primes.get(i + 1));
            }
        }
    }
}
