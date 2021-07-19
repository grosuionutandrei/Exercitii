package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number= 153;
        int number1=200;
        int[] numbers = new int[1000];
        for(int z=0;z<=numbers.length-1;z++){
            numbers[z]=z;
            if(isArmstrong(numbers[z])){
                printTrue(numbers[z]);
            }

        }

        if(isArmstrong(number1)){
            printTrue(number1);
        }else{
            printFalse(number1);
        }
        if(isArmstrong(number)){
            printTrue(number);
        }else{
            printFalse(number);
        }
    }
    private static int numberOfDigit(int number) {
        int count = 0;
        while (number > 0) {
            number = number/10;
            count ++;
        }
        return  count;
    }
    private static List<Integer> digitsOfNumber(int number){
        List<Integer> digitsToMultiply = new ArrayList<>();
        while(number>0){
            int x = number%10;
            number = number/10;
            digitsToMultiply.add(x);
        }
        return digitsToMultiply;
    }
    private static List<Integer> doProduct(int number){
        int x = numberOfDigit(number);
        digitsOfNumber(number);
        List<Integer>listOfProducts = new ArrayList<>();
        for(Integer digit:digitsOfNumber(number)){
            int w = digit;
            for(int z=2;z<=x;z++){
                w=w*digit;
            }
            listOfProducts.add(w);
        }
        return listOfProducts;
    }

    private static int doSum(int number){
        int sum = 0;
        for(Integer product: doProduct(number) ){
            sum+=product;
        }

        return  sum;
    }
    private static boolean isArmstrong(int number){
       return doSum(number)==number;
    }
    private static void printTrue(int number){
        System.out.println(number + " this number is armstrong");
    }
    private static void printFalse(int number){
        System.out.println(number + " this is not an armstrong number");
    }
}
