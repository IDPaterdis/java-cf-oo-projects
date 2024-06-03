package gr.aueb.cf.ch13.bankapp;

public class OverdraftAccount {
    private double balance;

    /**
     * Constructs an OverdraftAccount with the initial balance.
     *
     * @param balance the initial balance
     */
    public OverdraftAccount(double balance) {
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
