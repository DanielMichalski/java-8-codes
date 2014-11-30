package pl.dmichalski.lambda.c09_Consumer_functional_interface;

/**
 * Author: Daniel
 */
public class Customer {

    private String ssn;

    private double balance = 0.0;

    public Customer(String ssn, double balance) {
        this.ssn = ssn;
        this.setBalance(balance);
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
