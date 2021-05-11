package Section5ControlFlowStatements;
import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birthdate");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + "m and your age is " + age + " years old");
            } else {
                System.out.println("Invalid yerar of bith");
            }
        }


        scanner.close();
    }
}
