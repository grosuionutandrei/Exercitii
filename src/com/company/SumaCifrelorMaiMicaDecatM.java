package com.company;

public class SumaCifrelorMaiMicaDecatM {
    public static void main(String[] args) {
        int n = 10;
        int m = 4;
        printNumbers(n,m);
    }

    private static int doSum(int x ){
        int sum = 0;
        while(x!=0){
            int r = x%10;
            x=x/10;
            sum= sum+r;
        }
        return  sum;
    }


    private static void printNumbers(int n, int m){
        int count = 0;
        for(int i = 1; i<=1000;i++){
            int z = doSum(i);
            if(z<=m){
                count++;
                System.out.println(i);
                if(count==n){
                    break;
                }
            }
        }
    }
}
