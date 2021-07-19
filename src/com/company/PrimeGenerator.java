package com.company;

import java.util.*;

public class PrimeGenerator {
    public static void main(String[] args) {
        try (var sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            generateNumbers(x);
        }



    }

    private static void generateNumbers(int x) {
        Map<Integer, Integer> dizizori = new TreeMap<>();
        List<Integer> primeNumbers = new LinkedList<>();
        int e = 0;
        for (int i = 2; i <= x; i++) {
            e = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    e = 1;
                    if (dizizori.keySet().contains(i)) {
                        int w = dizizori.get(i);
                        w++;
                        dizizori.put(i, w);
                    } else {
                        dizizori.put(i, 1);
                    }
                    continue;
                }
            }
            if (e == 0) {
                primeNumbers.add(i);
            }
        }
        for (var vara : dizizori.entrySet()) {
            System.out.println(vara.getKey() + " non prim" + " " + " are " + vara.getValue() + " divizori ");
        }
        for (var vara : primeNumbers) {
            System.out.println(vara + " numar prim ");
        }
    }

}
