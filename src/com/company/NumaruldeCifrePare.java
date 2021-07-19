package com.company;

public class NumaruldeCifrePare {
    public static void main(String[] args) {
        int x  = 236461;
        getEven(x);
    }
    private static void getEven(int x){
        int c = 0;
        while(x!=0){
           int r=x%10;
            x=x/10;
            if(r%2==0){
                c++;
            }
        }
        System.out.println(c);
    }
}
