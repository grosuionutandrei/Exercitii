package com.company;

import java.util.Scanner;

public class CifreNumarTastatura {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Insert a number");
            Integer number  =  sc.nextInt();
            if(number<0){
                System.out.println("Insert a number greater than 0");
                number = sc.nextInt();
            }
            getDigits(number);
        }
    }
    private static void getDigits(int x){
        int counter = 0;
        while(x!=0){
            x=x/10;
            counter++;
        }
        System.out.println("The number of digits is: " + counter);
    }
}
