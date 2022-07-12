package ShildtBookTasks;

public class InchesToMetersTable {
    public static void main(String[] args) {
        double meters, inches;
        int counter = 0;
        for (meters = 1; meters <= 100; meters++) {
            inches = meters * 39.37;
            System.out.println(meters + " meters " + " are " + inches + " inches ");
            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}

