package Operators_Statements.Prac3;

import static java.lang.Math.sqrt;

public class SumPrimeNumber {

    public static boolean checkPrimeNUmber(int num){
        for (int i = 2; i <= sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static long sumFor(int n){
        long result = 0;
        for (int num = 1; num <= n; ++num) {
            if (checkPrimeNUmber(num) && num > 1) {
                result += num;
            }
        }
        return result;
    }

    public static long sumWhile(int n){
        long result = 0;
        int num = 1;
        while (num <= n){
            if (checkPrimeNUmber(num) && num > 1){
                result += num;
            }
            num++;
        }
        return result;
    }

    public static long sumDoWhile(int n){
        long result = 0;
        int num = 1;
        do {
            if (checkPrimeNUmber(num) && num > 1){
                result += num;
            }
            num++;
        }while (num <= n);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumFor(10000));
        System.out.println(sumWhile(10000));
        System.out.println(sumDoWhile(10000));
    }
}
