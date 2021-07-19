package com.company;

public class SumaCifrelorMaiMare {
    public static void main(String[] args) {
        int a = 123;
        int b = 234;

        if(isFirstBigger(a,b)){
            print(a);
        }else{
            print(b);
        }
    }

    private static int doSum(int num1) {
        int sum = 0;
        while (num1 > 0) {
            int x = num1 % 10;
            sum+=x;
            num1=num1/10;
        }
      return sum;
    }

    private static boolean isFirstBigger(int num1,int num2){
        int sum1 = doSum(num1);
        int sum2 = doSum(num2);
        return sum1>sum2;
    }
    private static void print(int number){
        System.out.println(" int "+  number + " is bigger ");
    }


}
