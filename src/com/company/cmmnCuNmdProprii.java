package com.company;

import javax.swing.*;
import java.util.*;

public class cmmnCuNmdProprii {


    public static void main(String[] args) {
        int n = 20;
        getNumber(n);
    }

    private static void getNumber(int x) {
        Map<Integer, List<Integer>> getDivizors = new HashMap<>();
        List<Integer> integerList = new LinkedList<>();
        boolean isDivisor = true;
        for (int i = 2; i <= x; i++) {
            integerList = new LinkedList<>();
            isDivisor = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isDivisor = true;
                    integerList.add(j);
                }
                if (isDivisor) {
                    getDivizors.put(i, integerList);
                }
            }
        }
        deleteSmallValues(getDivizors);
        for (var vara : getDivizors.entrySet()) {
            System.out.println(vara);
        }
        getMinimumNumber(getDivizors);
    }

    private static void deleteSmallValues(Map<Integer, List<Integer>> numbers) {
        int max = 0;
        for (var map : numbers.entrySet()) {

            if ((map.getValue().size()) > max) {
                max = map.getValue().size();
            }
        }

        Iterator<Map.Entry<Integer, List<Integer>>> entryIterator = numbers.entrySet().iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<Integer, List<Integer>> entry = entryIterator.next();
            if (entry.getValue().size() < max) {
                entryIterator.remove();
            }
        }
    }

    private static void getMinimumNumber(Map<Integer, List<Integer>> numbers) {
        Set<Integer> keyValues = numbers.keySet();

        Object min = Collections.min(keyValues);
        System.out.println("This is the number: " + min);
    }
}
