package com.company;

public class VitezaNava {
    public static void main(String[] args) {
        int weeks = 10;
        int days = 5;
        int km = 1000;
        System.out.println(metresPerSecond(weeks,days,km));
    }

    private static double hours(int weeks, int days) {
        return (((weeks * 7) + days) * 24);
    }

    private static double kmPerHour(int weeks,int days,int km){
        return km/hours(weeks,days);
    }

    private static double kmToMetres(int weeks, int days, int km){
        return kmPerHour(weeks,days,km)*1000;
    }
    private static double metresPerSecond(int weeks,int days,int km){
        return kmToMetres(weeks,days,km)/3600;
    }


}
