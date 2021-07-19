package com.company;

public class CMMDCScadere {


    public static void main(String[] args) {
        int x = 123;
        int y = 650;
        CMMDC(x,y);
    }
    private static void CMMDC(int x, int y){
        while(x!=y){
            if(x>y){
                x=x-y;

            }else{
                y=y-x;
            }
        }
        System.out.println(x);
    }
}
