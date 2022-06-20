package Operators_Statements.Prac1;

import java.util.Scanner;

public class DaysMonthNoEnum {
    public static void main(String[] args) {

        System.out.println("Input a month (1-12): ");
        Scanner scanner = new Scanner(System.in);
        int n;
        while (true){
            n = scanner.nextInt();
            if (n>=1 && n<=12){
                break;
            }else {
                System.out.println("Invalid input. Please enter a number between 1-12: ");
            }
        }
        switch (n) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("This month has 31 days.");
            case 4, 6, 9, 11 -> System.out.println("This month has 30 days.");
            case 2 -> System.out.println("This month has 28 days.");
        }
    }
}
