package Operators_Statements.Prac1;

import java.util.Scanner;

public class DaysMonth {
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
            case 1 -> {
                System.out.println("January: " + Month.JANUARY.getNumOfDays() + " days.");
            }
            case 2 -> {
                System.out.println("February: " + Month.FEBRUARY.getNumOfDays() + " days.");
            }
            case 3 -> {
                System.out.println("March: " + Month.MARCH.getNumOfDays() + " days.");
            }
            case 4 -> {
                System.out.println("April: " + Month.APRIL.getNumOfDays() + " days.");
            }
            case 5 -> {
                System.out.println("May: " + Month.MAY.getNumOfDays() + " days.");
            }
            case 6 -> {
                System.out.println("June: " + Month.JUNE.getNumOfDays() + " days.");
            }
            case 7 -> {
                System.out.println("July: " + Month.JULY.getNumOfDays() + " days.");
            }
            case 8 -> {
                System.out.println("August: " + Month.AUGUST.getNumOfDays() + " days.");
            }
            case 9 -> {
                System.out.println("September: " + Month.SEPTEMBER.getNumOfDays() + " days.");
            }
            case 10 -> {
                System.out.println("October: " + Month.OCTOBER.getNumOfDays() + " days.");
            }
            case 11 -> {
                System.out.println("November: " + Month.NOVEMBER.getNumOfDays() + " days.");
            }
            case 12 -> {
                System.out.println("December: " + Month.DECEMBER.getNumOfDays() + " days.");
            }
        }
    }
}
