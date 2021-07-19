package com.company;

import java.util.*;

public class NumerePrieteneDeRevenitPeste {
    public static void main(String[] args) {
        int x = 25;
        int y = 10;
       List<?> srf4 = findDivizors(x);

       doSum(getDivizors(x,y
       ));
       findfriends(doSum(getDivizors(x,y)));

    }
    private static List<? extends Number> findDivizors(int x){
        List<Integer> divizors = new ArrayList<>();

       for(int i = 1;i<=x;i++){
           if(x%i==0){
               divizors.add(i);
           }
       }

       return divizors;
    }
    private static Map<Integer,List<Integer>> getDivizors(int x, int y ){
        List<Integer> listOfDivizors = new LinkedList<>();
        Map<Integer,List<Integer>> divizors = new HashMap<>();
      if(!smallerNumber(x,y)){
          x=x+y;
          y=x-y;
          x=x-y;
      }
      for(int i = x;i<=y;i++ ){
          listOfDivizors=new LinkedList<Integer>();
          for(int j = 1;j<=i;j++) {
              if (i % j == 0) {
                  listOfDivizors.add(j);
              }
          }
          divizors.put(i,listOfDivizors);
      }
return divizors;
    }
    private static boolean smallerNumber(int x, int y){
        return x<y;
    }
    private static Map<Integer,Integer> doSum(Map<Integer,List<Integer>> divizors) {
        Iterator<Map.Entry<Integer, List<Integer>>> mapIt = divizors.entrySet().iterator();
        Map<Integer, Integer> primesSum = new HashMap<>();
        Integer doSum = 0;
        while (mapIt.hasNext()) {
            doSum=0;
            Map.Entry<Integer, List<Integer>> entry = mapIt.next();
            for (int i = 0; i < entry.getValue().size() ; i++) {

                doSum += entry.getValue().get(i);
            }
            primesSum.put(entry.getKey(),doSum );

        }

    return primesSum;
    }

    private static void findfriends(Map<Integer,Integer> primesSum){
         List<Integer> primeSumKeys = mapKeys(primesSum);
         List<Integer> primesSumValues = mapValues(primesSum.values());
         List<Integer> key = new LinkedList<>();
         List<Integer> value = new LinkedList<>();
         for(int i = 0;i<=primesSum.size()-1;i++){
             for(int j = 0; j<=primesSumValues.size()-1;j++){
                 if(primesSum.get(primeSumKeys.get(i))== primesSumValues.get(j)&&(primeSumKeys.get(i)!=primeSumKeys.get(j))){
                      if((!key.contains(primeSumKeys.get(i)))){
                         key.add(primeSumKeys.get(i));
                         value.add(primeSumKeys.get(j));
                      }
                 }
             }
         }
         print(key,value);
    }
    private static List<Integer> mapKeys(Map<Integer,Integer> primesSum){
        Set<Integer> primesSumKeys1 =  primesSum.keySet();
        List<Integer> keysList = new LinkedList<>();

        for(Integer key:primesSumKeys1){
            keysList.add(key);
            if(keysList.size()==primesSumKeys1.size()){
                break;
            }
        }
        return keysList;
    }
    private static List<Integer> mapValues(Collection<Integer> mapValues1) {
        List<Integer> mapValues = new LinkedList<>();
        for (Integer value : mapValues1) {
            mapValues.add(value);
            if (mapValues.size() == mapValues1.size()) {
                break;
            }
        }

        return mapValues;
    }
    private static void print(List<Integer> key,List<Integer> value){
        for(int i = 0 ; i<=key.size()-1;i++){
            System.out.println(key.get(i)+"="+ value.get(i));
        }

    }
}
