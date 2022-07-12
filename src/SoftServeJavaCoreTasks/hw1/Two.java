package SoftServeJavaCoreTasks.hw1;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String address;
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("Where are you live, "+name+"?");
        address = scanner.nextLine();
        System.out.println(address);
        scanner.close();
    }
}
