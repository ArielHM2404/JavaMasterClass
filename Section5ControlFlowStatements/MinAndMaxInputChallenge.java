package Section5ControlFlowStatements;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxValue = 0;
        int minValue = 0;

        while (true) {

        System.out.println("Enter number:");
        boolean isAndInt = scanner.hasNextInt();
        if (isAndInt) {
            int number = scanner.nextInt();
            scanner.nextLine();

            if (number >= maxValue ) {
                maxValue = number;
            } else {
                minValue = number;
            }

        } else {
            break;
        }

        }
        scanner.close();
        System.out.println("Maximun value is: "+maxValue+" and minimun value is: "+minValue);
    }
}
