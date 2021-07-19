package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PrefixePrime {
    public static void main(String[] args) {
        int n = 3;
       List<Integer> prime = primeNumbers(n);
       printNumbers(primesDigits(prime));
    }

    private static List<Integer> digits(int x) {
        List<Integer> prefixes = new LinkedList<>();
        while (x != 0) {
            prefixes.add(x);
            x = x / 10;
        }
        return prefixes;
    }

    private static List<Integer> primeNumbers(int x) {
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = startCount(x); i < stopCount(x); i++) {
            if(isPrime1(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }



    private static Map<Integer,List<Integer>> primesDigits(List<Integer>primes){
        Map<Integer,List<Integer>> primeDigits = new HashMap<>();
        for(Integer integer:primes){

            primeDigits.put(integer,digits(integer));

        }

        return primeDigits;
    }
    private static void printNumbers(Map<Integer,List<Integer>> primes){
        for(var prime:primes.entrySet()){
          if(arePrefixesPrime(prime.getValue())){
              System.out.println(prime);
          }
        }
    }
    private static boolean arePrefixesPrime (List<Integer> integers){
        boolean isPrime = true;
        for(int i = 0;i<=integers.size()-1;i++){
            for(int j = integers.get(i)-1;j>=2;j--){
                if(integers.get(i)%j==0){
                    isPrime=false;
                }
            }
        }
        return isPrime;
    }

    private static boolean isPrime1(int x) {
        boolean isPrime = true;
        for (int j = x - 1; j >= 2; j--) {
            if (x % j == 0) {
                isPrime = false;
            }
        }

        return isPrime;

    }




    private static int stopCount(int digitNumber) {
        int prod = 10;
        while (digitNumber != 1) {
            prod = prod * 10;
            digitNumber--;
        }

        return prod;
    }

    private static int startCount(int digitNumber) {
        int prod = 10;
        int x = digitNumber - 1;
        while (x != 1) {
            prod = prod * 10;
            x--;
        }
        return prod;
    }
}

