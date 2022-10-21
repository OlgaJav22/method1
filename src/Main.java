import java.util.Scanner;

public class Main {
    //Задача 1
    public static int calculateYear(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println(leapYear + "- високосный год");
        } else {
            System.out.println(leapYear + "- не високосный год");
        }
        return leapYear;
    }

    public static void main(String[] args) {
        int year = 2000;
        calculateYear(year);

    }
}
