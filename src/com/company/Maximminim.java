package com.company;

public class Maximminim {


    public static void main(String[] args) {
        Integer[] numbers = {34, 12, 43};
        System.out.println(minim(numbers));
        System.out.println(maxim(numbers));
    }

    private static int minim(Integer[] numbers) {
        int minim = numbers[0];
        for (int i = 0; i <= numbers.length - 1; i++) {

            if (numbers[i] < minim) {
                minim = numbers[i];
            }
        }
        return minim;
    }

    private static int maxim(Integer[] numbers) {
        int maxim = numbers[0];
        for (int i = 0;i<=numbers.length-1;i++){

            if(numbers[i]>maxim){
                maxim=numbers[i];
            }
        }
        return maxim;
    }
}
