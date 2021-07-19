package com.company;



public class DiferentaGarde {
    public static void main(String[] args) {
        String latitude = "30°50'45''";
        String longitude = "10°20'53''";

        String[] strings = latitude.split("\\D+");
        String[] strings1 = longitude.split("\\D");

        int[] latitudeDigits = new int[strings.length];
        int[] longitudeDigits = new int[strings1.length];
        addToArray(strings, latitudeDigits);
        addToArray(strings1, longitudeDigits);
        printResult(insertSpecialCharacters(resultString(latitudeDigits, longitudeDigits)));


    }

    private static void addToArray(String[] strings, int[] ints) {
        for (int i = 0; i <= strings.length - 1; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
    }

    private static void prepareForOperation(int[] ints, int[] ints1) {
        for (int i = ints.length - 1; i >= 0; i--) {
            if (ints[i] - ints1[i] < 0) {
                ints[i - 1] = ints[i - 1] - 1;
                ints[i] = ints[i] + 60;
            }
        }
    }

    private static int[] doDifference(int[] ints, int[] ints1) {
        int[] tempInts = new int[ints.length];
        prepareForOperation(ints, ints1);
        for (int i = ints.length - 1; i >= 0; i--) {
            tempInts[i] = ints[i] - ints1[i];
        }
        return tempInts;
    }

    private static String resultString(int[] ints, int[] ints1) {
        StringBuilder str = new StringBuilder();
        for (Integer integ : doDifference(ints, ints1)) {
            str.append(integ).append(" ");
        }
        return str.toString();
    }

    private static String insertSpecialCharacters(String string) {
        String[] strings = string.split(" ");
        String[] strSpecial = {"°", "'", "''"};
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= strings.length - 1; i++) {
            str.append(strings[i]).append(strSpecial[i]);
        }
        return str.toString();

    }

    private static void printResult(String string) {
        System.out.println("this is the result " + string);
    }


}
