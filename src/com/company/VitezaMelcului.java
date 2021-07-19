package com.company;

import java.util.HashMap;
import java.util.Map;

public class VitezaMelcului {


    public static void main(String[] args) {
        double vitezaPeSaptamana = 3;
        double distantaMetri = 5;
        System.out.println("time = " + time(distantaMetri,vitezaPeSaptamana));


    }


    private static double transforKmtoM(double speed){
        return speed*1000;
    }
    private static double getHours(){
        return 24*7;
    }
    private static  double time(double distanta,double speed){
        return getHours()*distanta/transforKmtoM(speed);
    }

}
