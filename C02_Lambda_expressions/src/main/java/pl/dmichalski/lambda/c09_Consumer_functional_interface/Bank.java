package pl.dmichalski.lambda.c09_Consumer_functional_interface;

import java.util.function.Consumer;

/**
 * Author: Daniel
 */
public class Bank {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer = new Customer("039-55-1743", 15000.0);
        bank.updateBalance(customer, c -> c.setBalance(c.getBalance() + 2000.0));
        System.out.println("------------------------------------");
        bank.updateBalance(customer, c -> c.setBalance(c.getBalance() - 500.0));
    }

    public void updateBalance(Customer customer, Consumer<Customer> consumer) {
        System.out.println("Social Security Number: " + customer.getSsn());
        System.out.println("Balance before transaction: " + customer.getBalance());
        consumer.accept(customer);
        System.out.println("Balance after transaction: " + customer.getBalance());
    }

}
