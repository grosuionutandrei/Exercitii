package com.company;

import java.util.LinkedList;
import java.util.List;

public class PerechiABdivizibilecu9 {
    public static void main(String[] args) {
        int x= 4;
        int y = 1;
        int[] ints={0,1,2,3,4,5,6,7,8,9};
        List<Integer> pairs = getNumbers(ints,x,y);
        for(int i = 2;i<=pairs.size();i+=2){
          //  System.out.println(pairs.get(i-2)+" " + pairs.get(i-1));
            System.out.println("A=" +(pairs.get(i-2))+" " + "B=" + (pairs.get(i-1)));
        }



    }
    private static List<Integer> getNumbers(int[] ints, int x, int y){
        List<Integer>missingNumbers = new LinkedList<>();

        for(int i = 0;i<=ints.length-1;i++){
            for(int j =0;j<=ints.length-1;j++){
               if(((x+ints[i]+y+ints[j])%9)==0){
                   missingNumbers.add(ints[i]);
                   missingNumbers.add(ints[j]);
               }

            }

        }
        return missingNumbers;
    }


}
