package com.company;

public class OglindireaUnuiNumar {
    public static void main(String[] args) {
        int x = 10758;
        getNumber(x);
        getNumber2(x);
    }
    private static void getNumber(int x){
        StringBuilder strb = new StringBuilder();
        while(x!=0){
            int c = x%10;
            x=x/10;
           strb.append(c);
        }
        Integer mirror = Integer.parseInt(strb.toString());
        System.out.println(mirror);
    }
    private static void getNumber2(int x){
        int reversed = 0;
        while(x!=0){
            int r  = x%10;
            x=x/10;
            reversed = (reversed*10)+r;
        }
        System.out.println(reversed);
    }
}

