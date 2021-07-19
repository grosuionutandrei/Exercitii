package com.company;

import java.util.*;

public class Numerele4CifreDivizibile15 {
    public static void main(String[] args) {
        int x = 9999;
        findNumbers(x);
    }

    private static void findNumbers(int x) {
        int z = 0;
        int w = 0;
        for (int i = x - 4; i >= 1000; i -= 5) {
            if (i % 15 == 0) {
                if (doSum(i)) {
                    System.out.println(i);
                    z++;
                    if(distinctNumbers(i)){
                        System.out.println(i +" " + "distinct");
                        w++;
                    }
                }

            }
        }
        System.out.println(z);
        System.out.println(w);
    }

    private static boolean doSum(int x) {
        int y = 0;
        int sum = 0;
        while (x > 0) {
            int z = x % 10;
            x = x / 10;
            if (y >= 2) {
                sum = sum + z;
            }
            y++;
        }
        return sum == 12;
    }


    private static boolean distinctNumbers(int x){
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();
                int y = 0;

        while (x > 0) {
            int z = x % 10;
            if (y >= 2) {
                str.append(z);
            }else if(y <=2){
                str1.append(z);
            }

            x = x / 10;

            y++;

        }
        if(str.reverse().toString().hashCode()==str1.reverse().toString().hashCode()){
            return false;
        }
        return  true;


//    private static boolean distinctNumbers(int x) {
//        Map<Integer[], Integer[]> areDistinct = new HashMap<>();
//        Integer[] firstNumbers = new Integer[2];
//        Integer[] lastNumbers = new Integer[2];
//        int y = 0;
//
//        while (x > 0) {
//            int z = x % 10;
//            if (y >= 2) {
//                y=0;
//                firstNumbers[y]=z;
//            }
//            lastNumbers[y]=z;
//            x = x / 10;
//
//            y++;
//        }
//        areDistinct.put(firstNumbers,lastNumbers);
//        if(areDistinct.get(firstNumbers).hashCode()!=areDistinct.hashCode()){
//            Arrays.stream(areDistinct.get(firstNumbers)).forEach(System.out::println);
//            return  true;
//    }

//  return false;
}



}
