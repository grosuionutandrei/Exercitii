package com.company;

public class CatPatrat {
    public static void main(String[] args) {
        System.out.println(34%15);
        System.out.println(34/15);
        int x = 99;
        findnumbers(x);
    }
    private static void findnumbers(int x){
        int w = 0;
        for(int i = 0; i<=x;i++){
            if(i%15==0){
                continue;
            }
            int z = i%15;
            int y = i/15;
            if(z==(y*y)){
                System.out.println(i);
                w++;
            }
        }
        System.out.println("Are " + w + "numbers");
    }

}
