package com.company;

import java.util.*;

public class OrideCrescatoare {
    public static void main(String[] args) {
        int x = 3;
        print(x);
    }


    private static List<Integer> getNumbers(int x){
        List<Integer> numbers = new LinkedList<>();
        for(int i = startCount(x);i<=stopCount(x)-1;i++){
            numbers.add(i);
        }
        return numbers;
    }


    private static Map<Integer,List<Integer>> getDigits(List<Integer> numbers){
        Map<Integer,List<Integer>> digits = new TreeMap<>();
        for(Integer integer:numbers){
            digits.put(integer,digisList(integer));
        }

        return digits;
    }
    private static List<Integer> digisList (int x){
        List<Integer> integers = new LinkedList<>();
        while(x!=0){
            int r = x%10;
            integers.add(r);
            x=x/10;
        }

        return integers;
    }
    private static boolean applyCondition1(List<Integer> integerList){
        boolean isSum = false;

        int sum = 0;
        for(Integer integer:integerList){
            sum = sum+integer;
        }
        if(sum==18){
            isSum=true;
        }
        return isSum;
    }
    private static boolean applyCondition2(List<Integer> integerList){
        boolean areConsecutive = false;
        if((integerList.get(0)>integerList.get(1))&&integerList.get(1)>integerList.get(2)){
            areConsecutive=true;
        }

        return areConsecutive;
    }
    private static void print(int x){
        List<Integer> integers = getNumbers(x);
        Map<Integer,List<Integer>> numDigitsMap = getDigits(integers);
        for(var number:numDigitsMap.entrySet()){
            if(applyCondition1(number.getValue())&&applyCondition2(number.getValue())){
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
