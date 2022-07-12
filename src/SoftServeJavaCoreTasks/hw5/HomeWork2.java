package SoftServeJavaCoreTasks.hw5;

public class HomeWork2 {
    public static void main(String[] args) {
        /* Enter 10 integer numbers. Calculate the sum of first 5 elements
         if they are positive or product of last 5 element in the other case.*/

        int [] numbers = {3, -3, 5, -6, -7, 8, 5, -3, 2, 10};
        int sum = 0;
        int sumL = 0;
        for (int a : numbers){
            if(a > 0){
                for (int i = 0; i < 5; i++) { sum += numbers[i];}
                System.out.println("Sum of the first 5 numbers are = " + sum);
            } else {
                for (int j = 5; j < 10; j++) { sumL += numbers[j];}
                System.out.println("Sum of the last 5 numbers are = " + sumL);
            }
        }
    }
}
