package gr.aueb.cf.ch13.bankapp;


import java.util.List;

public class JointAccount {
    private String holder1;
    private String holder2;
    private double balance;

    /**
     * Constructs a JointAccount with the initial balance and holders.
     *
     * @param holder1 the first account holder
     * @param holder2 the second account holder
     * @param balance the initial balance
     */
    public JointAccount(String holder1, String holder2, double balance) {
        this.holder1 = holder1;
        this.holder2 = holder2;
        this.balance = balance;
    }

    /**
     * Withdraws a specified amount from the account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdraw of " + amount + " success.");
    }

    /**
     * Returns the account balance.
     *
     * @return the account balance
     */
    public double getBalance() {
        return balance;
    }
}
