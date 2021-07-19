package com.company;

import java.util.*;

public class DistinctDigitsOfnumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Insert a number");
            int number = sc.nextInt();
            int numberOfDigits = numberOfDigits(number);
            if (numberOfDigits > 9) {
                System.out.println("Insert a number lower than 100000000");
                number = sc.nextInt();
            }
            print(setOfDigits(number));
        }
    }

    private static int numberOfDigits(int x) {
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }


    private static Set<Integer> setOfDigits(int x) {
        Set<Integer> distincts = new HashSet<>();
        while (x != 0) {
            int r = x % 10;
            x = x / 10;
            distincts.add(r);
        }
        return distincts;
    }

    private static void print(Set<Integer> distincts){
        System.out.println("this number have "+distincts.size()+" distinct digits");
    }
}
