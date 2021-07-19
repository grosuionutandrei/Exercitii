package com.company;

import java.util.*;

public class Cifrecomune {
    public static void main(String[] args) {
        int x = 21348;
        int y = 14513;
        List<List<Integer>> lists = getDigits(x,y);
        getIntersection(lists);

    }

    private static List<List<Integer>> getDigits(int x, int y) {
        List<Integer> xDigits = new LinkedList<>();
        List<Integer> yDigits = new LinkedList<>();

        while((x!=0)&& (y!=0)){
            int r = x%10;
            int s = y%10;
            x=x/10;
            y=y/10;
            xDigits.add(r);
            yDigits.add(s);
        }
        List<List<Integer>> lists = new LinkedList<>();
        lists.add(xDigits);
        lists.add(yDigits);
        return  lists;
    }
    private static void getIntersection(List<List<Integer>> lists){
        List<Integer> list1 = lists.get(0);
        List<Integer> list2  = lists.get(1);
        List<Integer> list3 = new LinkedList<>();
        for(Integer integer:list1){
            list3.add(integer);
        }

        list3.retainAll(list2);

        System.out.println("There are "+ list3.size() +" common digits");
        System.out.println("They are " + list3);
     }
}
