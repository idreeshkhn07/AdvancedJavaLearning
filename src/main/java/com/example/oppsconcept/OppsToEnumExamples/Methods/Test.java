package com.example.oppsconcept.OppsToEnumExamples.Methods;

public class Test {

    public static void main(String[] args){

//        int[] a = {1,2,3,4,5,6,7,8};
//        int z = sumOfArray(a);
//        System.out.println(z);
//
//        String res = toUpper("idreesh");
//        System.out.println(res);
//
//        int a = 10;
//        int b = 20;
//        int sumRes = sum(a,b);
//        System.out.println(sumRes);
//
//        // Another way of calling method directly to print statement.
//        System.out.println(sum(5 , 7));

        System.out.println(isPrime(13));
        System.out.println(isPrime(91));
        System.out.println(isPrime(1004));
        System.out.println(isPrime(79));

    }

//    public static int sumOfArray(int[] arr){
//        int res = 0;
//        for(int i : arr){
//            res += i;
//        }
//        return res;
//    }
//
//    private static String toUpper(String str){
//        return str.trim().toUpperCase();
//    }
//
//    private static int sum(int a, int b){
//        return a+b;
//    }

    public static boolean isPrime(int x){
        int result = 0;

        for(int i = 1; i < x/2; i++ ){
            if( x % i == 0){
                result ++;
            }
        }
        return result == 1;
    }
}
