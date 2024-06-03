package gr.aueb.cf.ch13;

import gr.aueb.cf.ch13.bankapp.JointAccount;
import gr.aueb.cf.ch13.bankapp.OverdraftAccount;

import java.util.Arrays;

public class BankMain {
    public static void main(String[] args) {
        OverdraftAccount overdraftAccount = new OverdraftAccount(1000);
        System.out.println("Overdraft Account Balance: " + overdraftAccount.getBalance());
        overdraftAccount.withdraw(1200);
        System.out.println("Overdraft Account Balance after withdrawal: " + overdraftAccount.getBalance());

        // Test JointAccount
        JointAccount jointAccount = new JointAccount("John", "Jane", 2000);
        System.out.println("Initial Balance: " + jointAccount.getBalance());
        jointAccount.withdraw(500);
        System.out.println("Remaining Balance: " + jointAccount.getBalance());
    }
}

