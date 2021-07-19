package com.company;

public class CatulSapte {
    public static void main(String[] args) {
        int x = 2000;
        int[] operanzi = {24, 30, 18};




        doOperation(x, operanzi);
        print();
        findWithSum(x,operanzi);
        print();
        CMMMC(x,operanzi);
    }

    //first try
    private static void doOperation(int x, int[] operanzi) {
        for (int i = 2; i <= x; i++) {
            if (i % operanzi[0] == 7) {
                if (i % operanzi[1] == 7) {
                    if (i % operanzi[2] == 7) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
    //secondtry

    private static int CMMDC1(int[] ints) {

        int a = ints[0];
        int b = ints[1];
        int r = a % b;
        while (r!=0){
            r = a%b;
            a=b;
            if(r==0){
               return b;
            }
            b=r;

        }

return 0;
    }
    private static int CMMDC2(int[]ints){
        int a = CMMDC1(ints);
        int b = ints[2];

        int r = a % b;
        while (r!=0){
            r = a%b;
            a=b;
            if(r==0){
                return b;
            }
            b=r;

        }
        return 0;
    }
    private static void CMMMC(int x, int[] ints){
        int y = 0;
        y=(ints[0]*ints[1])/CMMDC2(ints);
        y=(y*ints[2])/CMMDC2(ints);
        for(int i = 2;i<=x;i++){
            if(i%y==7){
                System.out.println(i);
            }
        }

    }
    //third try

    private static void findWithSum(int x,int[]ints){
        int sum = 0;
        for(int i = 0;i<=ints.length-1;i++){
            sum=sum+ints[i];
        }

        for(int i = 0; i<=x;i++){
            if(i%10==7){
               if(i%sum==7){
                   System.out.println(i);
               }
            }
        }

    }
    private static  void print(){
        System.out.println("With another function " );
        System.out.println();
    }


}
