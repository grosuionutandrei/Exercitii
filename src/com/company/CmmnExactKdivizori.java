package com.company;

public class CmmnExactKdivizori {
    public static void main(String[] args) {
        int  a = 10;

        calculatecmmnExactKdivizori(a);

    }
    private static void calculatecmmnExactKdivizori(int x){
        int b = 0;
        int c = 0;
        for(int i = 0;i<=1000;i++){
            b=0;
            //c=0;
            for(int j = 1;j<=i;j++){
               // if(c==j){
               //     b++;   /*rezultatul % egal cu 0 este divizorul numarului respectiv*/
               //     continue;
               // }
                if(i%j==0){
                   // c=i/j;

                    b++;

                }
            }
            if(b==x){
                System.out.println(i);
                break;
            }
        }
    }
}
