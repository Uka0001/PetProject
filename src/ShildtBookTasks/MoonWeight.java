package ShildtBookTasks;

import java.util.Scanner;

public class MoonWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight");
        int weightEarth = scanner.nextInt();
        scanner.close();
        double moonWeight = weightEarth * 0.17;
        System.out.println("Your moon weight :" + moonWeight + " kg");
    }
}
