package Section6OOPPart1;

public class VIPCustomer {

   private String name;
   private double creditLimit;
   private String email;

    public VIPCustomer() {

    }

    public VIPCustomer(String name, int creditLimit) {
        this("Ariel",  14.44, "arielh.m@hotmail.com");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public  VIPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
