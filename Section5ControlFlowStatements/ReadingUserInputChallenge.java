package Section5ControlFlowStatements;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int total = 0;

        System.out.println("Introduce a number until you reach 10 numbers");

        while (count < 11) {
            System.out.println("Enter number# "+ count);
            boolean isAndInt = scanner.hasNextInt();
            if (isAndInt) {
                int number = scanner.nextInt();
                scanner.nextLine();
                count++;
                total += number;

            } else {
                System.out.println("Invalid number");
                scanner.nextLine();
            }

        }
        scanner.close();
        System.out.println("The sum of the entered numbers is: " +total);
    }
}
