package com.company;

import java.util.LinkedList;
import java.util.List;

public class ProdusulNumerelorPrime {
    public static void main(String[] args) {
        int x = 9;


        List<Integer> primeNumbers = numerePrime(x);
        System.out.println(primeNumbers);
        print(primeNumbers,x);

    }

    private static List<Integer> numerePrime(int x) {
        List<Integer> primeNumbers = new LinkedList<>();
        Boolean isPrime = true;
        for (int i = 100; i <= 1000; i++) {
            isPrime = true;
            for (int j = i - 1; j >= 2; j--) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;

    }

    private static boolean product(int x,int y){

        int prod = 1;
        while(x!=0){
            int r = x%10;
            x=x/10;
            prod = prod*r;
        }
        return prod==y;
    }
    private static void print(List<Integer> primeNumbers,int x){
        for(Integer prime:primeNumbers){
            if(product(prime,x)){
                System.out.println( "Numerele sunt: " + prime);
            }
        }
    }




}
