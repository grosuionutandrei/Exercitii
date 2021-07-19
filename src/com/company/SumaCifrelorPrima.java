package com.company;

public class SumaCifrelorPrima {
    public static void main(String[] args) {
        int digitNumber = 2;
        printNumbers(digitNumber);
    }

    private static boolean isPrime(int x) {
        boolean isPrime = true;
        for (int j = x - 1; j >= 2; j--) {
            if (x % j == 0) {
                isPrime = false;
            }
        }

        return isPrime;

    }

    private static int doSum(int x) {
        int sum = 0;
        while (x != 0) {
            int r = x % 10;
            x = x / 10;
            sum = sum + r;
        }
        return sum;
    }

    private static void printNumbers(int digitNumber) {
        for (int i = startCount(digitNumber) + 1; i <= stopCount(digitNumber) - 1; i++) {
            if (isPrime(i - 1) && isPrime(i + 1)) {
                int sum = doSum(i);
                if (isPrime(sum)) {
                   String str = "Number: " + i +"->";
                   String str1 =  "(" + (i - 1) + "," + (i + 1) + "," + sum + ")";
                    System.out.println(str+str1);
                }
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
