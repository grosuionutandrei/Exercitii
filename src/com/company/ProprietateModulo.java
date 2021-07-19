package com.company;

public class ProprietateModulo {
    public static void main(String[] args) {
        int x = 80;
        int y = 134;
        int z = 152;
        getNumbers(x,y,z);


    }

    private static void getNumbers(int x, int y, int z) {
        for (int w = 1; w <= 100; w++) {
            int q = x % w;
            int e = y % w;
            int r = z % w;
            if (q == e && q == r) {
                System.out.println(w);

            }
        }
    }


}
