package Section6OOPPart1;

import java.util.Scanner;

public class BankClassTester {



    public static void main(String[] args) {
        BankAccount user = new BankAccount("12345", 0.0, "Bob Brown", "testingemail@cosa.com",
                "809-858-7569");
        Scanner scanner = new Scanner(System.in);

//        user.setAccountNumber("123132");
//        user.setBalance(35);
//        user.setCustomerName("Juan12");
//        user.setPhoneNumber("11111");
//        user.setEmail("arielh.m24@gmail.com");
//        System.out.println("Account number: " + user.getAccountNumber() + '\n'+
//                "Account balance: " + user.getBalance() + '\n' +
//                "Customer phone: " + user.getPhoneNumber() + '\n' +
//                "Customer email: " + user.getEmail() + '\n' +
//                "Customer name: " + user.getCustomerName());


//        System.out.println("The balance in the account before deposit is: " + user.getBalance());
//        System.out.println("Enter the amount to be deposit");
//        int amount = scanner.nextInt();
//        deposit(amount, user);
        System.out.println("The balance in the account after deposit is: " + user.getBalance());
        System.out.println("Enter the amount to be retired from the account");
       int  amount = scanner.nextInt();
//        scanner.nextLine();
        withdraw(amount, user);
        System.out.println("The balance in the account after withdraw is: " + user.getBalance());
        scanner.close();
    }

    public static double deposit(double amount, BankAccount user) {

        double currentValue = user.getBalance();
        if (amount >= 0 && amount<= currentValue) {
            amount += currentValue;
            user.setBalance(amount);
        } else
            System.out.println("Amount is not valid");

        return amount;
    }

    public static double withdraw(double amount, BankAccount user) {

        double currentValue = user.getBalance();
        if (amount > 0 ) {
            amount = currentValue - amount;
            user.setBalance(amount);
        } else {
            System.out.println("Not a valid amount");
        }
        return amount;
    }
}
