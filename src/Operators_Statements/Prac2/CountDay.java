package Operators_Statements.Prac2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CountDay {
    public static void main(String[] args) {
        System.out.println("Input values of Date (y1 m1 d1 y2 m2 d2): ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        // Tách input ra thành các số riêng
        String[] parts = s.split(" ");
        String y1 = parts[0];
        String m1 = parts[1];
        String d1 = parts[2];
        String y2 = parts[3];
        String m2 = parts[4];
        String d2 = parts[5];

        // Ghép các số thành ngày
        String date1 = y1 + " " + m1 + " " + d1;
        String date2 = y2 + " " + m2 + " " + d2;

        // Mapping vào kiểu Date
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy MM dd");
        try {
            Date start = simpleDateFormat.parse(date2);
            Date end = simpleDateFormat.parse(date1);
            if (end.after(start)){
                long sub =  end.getTime() - start.getTime();
                // Chuyển time từ ms sang ngày
                long result = sub / (24 * 60 * 60 * 1000);
                System.out.println("Numbers of days between two date: " + result);
            }
        }
        catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
