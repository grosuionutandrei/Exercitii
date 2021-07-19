package com.company;

public class RasturnatulPatratului {
    public static void main(String[] args) {
        calculate();
    }

    private static void calculate() {
        for (int i = 10; i <= 99; i++) {
            int z = getNumber(i);
//            if((z*z)==(i*i)){
//                System.out.println("Number : "+ i + " number squared : "+(i*i));
//                System.out.println("Reversed number " + z +" reversed squared " + (z*z));
//            }
            int c = i * i;
            int x = z * z;
            int y = getNumber(x);
            if (c == y) {
                System.out.println("Number: " + i + " number squared " + c);
                System.out.println("Reversed number " + z + " reversed squared " + y);
                System.out.println();
            }

//            System.out.println(i);
//            System.out.println();
//            System.out.println(z);
        }
    }

    private static int getNumber(int x) {
        int z = 0;
        while (x != 0) {
            int r = x % 10;
            x = x / 10;
            z = (z * 10) + r;
        }

        return z;
    }
}
