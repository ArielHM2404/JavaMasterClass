package Section6OOPPart1;

public class BankAccount {
    String accountNumber;
    double balance;
    String customerName;
    String email;
    String phoneNumber;

    public BankAccount() {
        this("12345", 0.0, "Bob Brown", "testingemail@cosa.com",
                "809-858-7569");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("BankAccount construstor with parameters");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        if(customerName != null && !customerName.equals("")) {
            this.customerName = customerName;
        }
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            this.email = "invalid email format";
        }
    }
    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
