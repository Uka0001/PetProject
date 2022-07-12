package SoftServeJavaCoreTasks.hw1;

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c1, c2, c3;
        int t1, t2, t3;
        c1 = scanner.nextInt();
        c2 = scanner.nextInt();
        c3 = scanner.nextInt();
        t1 = scanner.nextInt();
        t2 = scanner.nextInt();
        t3 = scanner.nextInt();
        int firstCall = c1 * t1;
        int secondCall = c2 * t2;
        int thirdCall = c3 * t3;
        int sum = firstCall + secondCall + thirdCall;
        System.out.println("First call = " + firstCall);
        System.out.println("Second call = " + secondCall);
        System.out.println("Third call = " + thirdCall);
        System.out.println("Sum of calls = " + sum);
        scanner.close();
    }
}
