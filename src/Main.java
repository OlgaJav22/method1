import java.util.Scanner;

public class Main {
    //Задача 1
    public static int calculateYear(int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println(leapYear + "- високосный год.");
        } else {
            System.out.println(leapYear + "- не високосный год.");
        }
        return leapYear;
    }

    public static void main(String[] args) {
        System.out.println("Задача № 1" + "\n");
        int year = 2000;
        calculateYear(year);

        // Задача 2
        System.out.println("\n" + "Задача № 2" + "\n");

        int clientOS = 1;
        int clientDeviceYear = 2014;
        getClientOS(clientOS, clientDeviceYear);


        //Задача 3
        System.out.println("\n" + "Задача № 3" + "\n");

        int deliveryDistance = 95;
        int deliveryDay=1;
        int sumTotalDay = getTotalDistance(deliveryDistance, deliveryDay);
        System.out.println(sumTotalDay);

    }

        public static int getClientOS(int a, int b) {
            if (a ==0 && b>=2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
                return 0;
            } else if (a==1 && b>=2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
                return 1;
            } else if (a == 0 && b< 2015) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
                return 0;
            } else if (a ==1 && b< 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } return 1;

        }

        public static int getTotalDistance(int interval, int day) {
            if (interval<=20) {
                return day;
            } else if (interval>20 && interval<60) {
                return day+1;
            } else if (interval>=60 && interval<100) {
                return day+2;
            }
            return 0;
        }
}
