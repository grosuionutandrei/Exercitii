package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Ex69 {
    public static void main(String[] args) {
        int x=5;

        print(digits(getNumbers(x)));
    }


    private static List<Integer> getNumbers(int x){
        List<Integer> numbers = new LinkedList<>();
        for(int i = startCount(x);i<=stopCount(x)-1;i++){
            numbers.add(i);
        }
        return numbers;
    }

    private static Map<Integer,List<Integer>> digits(List<Integer> integerList){
        Map<Integer,List<Integer>> mapOfdigits = new TreeMap<>();
        for(Integer integer:integerList){
            mapOfdigits.put(integer,getDigits(integer));
        }
        return mapOfdigits;
    }
    private static List<Integer> getDigits(int integer){
        List<Integer> integers = new LinkedList<>();
        while(integer!=0){
            int r = integer %10;
            integers.add(r);
            integer= integer/10;
        }
        return  integers;
    }
    private static boolean fC(List<Integer> digits){
        boolean isCondition = false;
        if(digits.get(1)==(digits.get(0)*digits.get(1))){
                isCondition=true;
            }

        return isCondition;
    }
    private static boolean sC(List<Integer>digits){
        boolean isCondition = false;
        if(digits.get(3)==(Math.pow(digits.get(4),3))) {
            isCondition = true;
        }
        return isCondition;
    }
    private static boolean tC(List<Integer>digits) {
        boolean isCondition = false;
        if(digits.get(0)==digits.get(3)){
            isCondition = true;
        }
        return isCondition;
    }
    private static boolean fiC(List<Integer> digits) {
         boolean isCondition = true;
        if((digits.get(3)==1)&&(digits.get(4)==1)){
            isCondition=false;
        }

        return isCondition;

}


    private static void print(Map<Integer,List<Integer>> numbers){
        for(var number:numbers.entrySet()){
            if((fiC(number.getValue())&&(sC(number.getValue())&&(tC(number.getValue())&&(fC(number.getValue())))))){
                System.out.println(number);
            }
        }
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
