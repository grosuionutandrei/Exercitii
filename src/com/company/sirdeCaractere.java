package com.company;

public class sirdeCaractere {
    public static void main(String[] args) {
        int x =4529;
        System.out.println(" \"" + convertToString(x) + "\" ");
    }

    private static String convertToString(int x){
        char[] letters = {'a','b','c','d','e','f','g','h','i','j'};
        StringBuilder str = new StringBuilder();
        while(x!=0){
            int r = x%10;
            str.append(letters[r]);
            x=x/10;

        }
     return   str.toString();
    }
}
