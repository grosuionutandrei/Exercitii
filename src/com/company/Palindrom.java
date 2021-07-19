package com.company;

public class Palindrom {
    public static void main(String[] args) {
        int x = 101;
        if (isPalindrome(x)) {
            System.out.println("This number is palindrome ");
        }
    }

    private static boolean isPalindrome(int x) {
        int reversed = 0;
        int toReverse = x;
        while (toReverse != 0) {
            int r = toReverse % 10;
            toReverse = toReverse / 10;
            reversed = (reversed * 10) + r;
        }

        return reversed == x;
    }
}
