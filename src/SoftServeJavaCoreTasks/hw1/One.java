package SoftServeJavaCoreTasks.hw1;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextInt();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
        scanner.close();
        System.out.println("Git lesson almost complete");
    }
}
