package SoftServeJavaCoreTasks.hw1;

import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println("How are you?");
        String answer = scanner.nextLine();
        scanner.close();
        System.out.println("You are " + answer);
        scanner.close();
    }
}
