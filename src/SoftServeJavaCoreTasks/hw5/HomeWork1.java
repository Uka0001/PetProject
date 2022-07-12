package SoftServeJavaCoreTasks.hw5;

import java.util.Scanner;

/*Ask user to enter the number of month. Read the value and write the number of
        days in this month (create array with amount days of each month).*/

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the month do discover the amount of days in it");
        int [] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int i;
        switch (scanner.nextInt()){
            case 1:
                System.out.println("Your month is January and it has " + daysInMonth[0] + " days");
                break;
            case 2:
                System.out.println("Your month is February and it has " + daysInMonth[1] + " days");
                break;
            case 3:
                System.out.println("Your month is March and it has " + daysInMonth[2] + " days");
                break;
            case 4:
                System.out.println("Your month is April and it has " + daysInMonth[3] + " days");
                break;
            case 5:
                System.out.println("Your month is May and it has " + daysInMonth[4] + " days");
                break;
            case 6:
                System.out.println("Your month is June and it has " + daysInMonth[5] + " days");
                break;
            case 7:
                System.out.println("Your month is July and it has " + daysInMonth[6] + " days");
                break;
            case 8:
                System.out.println("Your month is August and it has " + daysInMonth[7] + " days");
                break;
            case 9:
                System.out.println("Your month is September and it has " + daysInMonth[8] + " days");
                break;
            case 10:
                System.out.println("Your month is October and it has " + daysInMonth[9] + " days");
                break;
            case 11:
                System.out.println("Your month is November and it has " + daysInMonth[10] + " days");
                break;
            case 12:
                System.out.println("Your month is December and it has " + daysInMonth[11] + " days");
                break;
            default:
                System.out.println("Wrong number is entered! Try again!");
                break;
        }
        scanner.close();
    }
}
