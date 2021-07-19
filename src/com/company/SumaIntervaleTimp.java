package com.company;

import java.util.*;

public class SumaIntervaleTimp {
    public static void main(String[] args) {
        Integer[] firstInterval = {6,80,369,222};
               // "5ore,45min,36sec,20zecimi";
        Integer[] secondInterval = {1,30,29,90};
                //"1ora,30min,29sec,90zecimi";
        Arrays.stream(doSum(firstInterval,secondInterval)).forEach(System.out::println);
        Integer[] sum = doSum(firstInterval,secondInterval);
        transform(sum);
        Arrays.stream(sum).forEach(System.out::println);







    }

    private static Integer[] doSum(Integer[] ints,Integer[]ints1){
        Integer[] intsInter = new Integer[ints.length];
        for(int i = 0;i<=ints.length-1;i++){
            intsInter[i]=ints[i]+ints1[i];
        }
        return intsInter;
    }
    private static void transform(Integer[] ints){
        int z = 0;
        for(int i = ints.length-1;i>=0;i--){
            while(ints[i]>60){
                z++;
                ints[i]=ints[i]-60;
            }
            if(i==0){
                break;
            }
            ints[i-1]=ints[i-1]+z;
            z=0;


        }


    }





//    private static Map<Integer[],Integer[]> getIntegers (String string,String strings1) {
//        Map<Integer[],Integer[]>integers = new HashMap<>();
//
//        List<String> stringsIntermediate = Arrays.asList(string.split("\\D"));
//        List<String> stringsIntermediate1 = Arrays.asList(strings1.split("\\D"));
//        //split(stringsIntermediate,stringsIntermediate1);
//        StringBuilder str = new StringBuilder();
//        stringsIntermediate.stream().forEach(n->str.append(n).append(" "));
//        List<String> stringList = Arrays.asList(str.toString().split(" "));
//        stringList.forEach(System.out::print);
//
//
//
//
//
//
//
//
//        Integer[] ints = new Integer[stringsIntermediate.size()];
//        for (int x = 0; x < stringsIntermediate.size()- 1; x++) {
//            ints[x]=Integer.parseInt(stringsIntermediate.get(x));
//        }
//        Integer[] ints1 = new Integer[stringsIntermediate1.size()];
//        for(int x=0;x<stringsIntermediate1.size()-1;x++){
//            ints1[x] =Integer.parseInt(stringsIntermediate1.get(x));
//        }
//        integers.put(ints,ints1);
//        return integers;
//    }
//
////    private  static void split(List<String> strings,List<String> strings1){
////        Iterator<String>stringIterator = strings.iterator();
////        Iterator<String>stringIterator1 = strings1.iterator();
////        while(stringIterator.hasNext()){
////            if(stringIterator.next().toString().matches(" ")){
////                System.out.println("mama");
////
////            }
////            System.out.println("tata");
////        }





}
