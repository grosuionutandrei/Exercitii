package com.company;

import java.util.Scanner;

public class CMMDC {
    public static void main(String[] args) {
        System.out.println("Insert first number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        checkNumber(x);
        System.out.println("Insert second number");
        int y = sc.nextInt();
        checkNumber(y);
        sc.close();
        CMMDC(x,y);





    }
    private static int CMMDC(int x, int y) {
        int r = x % y;
        while (r != 0) {
            r = x % y;
            x = y;
            if (r == 0) {
                System.out.println("CMMDC = " +y);
                return y;
            }
            y = r;
        }
        return 0;
    }
private static void checkNumber(int x){
        if(x<1){
            System.out.println("Insert a number bigger than 1");
        }
}

}
