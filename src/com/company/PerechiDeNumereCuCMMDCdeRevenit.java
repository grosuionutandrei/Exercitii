package com.company;

import java.util.LinkedList;
import java.util.List;

public class PerechiDeNumereCuCMMDCdeRevenit {
    public static void main(String[] args) {
        int x = 20;
        int cmmdc = 5;
        perechiDeNumere(20, 5);
    }
    private static int CMMDC1(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;

            } else {
                y = y - x;
            }
        }
        return x;
    }
    private static void perechiDeNumere(int x, int cmmdc) {
        List<Integer> firstNumber = new LinkedList<>();
        List<Integer> secondnumber = new LinkedList<>();
        for (int i = cmmdc; i <= x; i+=cmmdc) {
            for (int j = cmmdc; j <= x; j+=cmmdc) {
                if (CMMDC1(i, j) == cmmdc) {
                    firstNumber.add(i);
                    secondnumber.add(j);
                }
            }
        }
        for(int i = 0;i<firstNumber.size();i++){
            System.out.println(firstNumber.get(i)+ "=" +secondnumber.get(i));
        }
    }
}
