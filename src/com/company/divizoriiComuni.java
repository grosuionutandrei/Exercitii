package com.company;

public class divizoriiComuni {
    public static void main(String[] args) {
        int x = 60;
        int y = 350;

        printDivizors(CMMDC(x, y));
    }

    private static int CMMDC(int x, int y) {
        int r = x % y;
        while (r != 0) {
            r = x % y;
            x = y;
            if (r == 0) {
                System.out.println(y + " CMMDC");
                return y;
            }
            y = r;
        }
        return 0;
    }

    private static void printDivizors(int cmmmdc) {
        for (int i = 1; i <= cmmmdc; i++) {
            if (cmmmdc % i == 0){
                System.out.println(i + " divizor comun");
            }
        }
    }

}
