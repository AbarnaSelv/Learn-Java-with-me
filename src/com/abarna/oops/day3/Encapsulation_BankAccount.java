package com.abarna.oops.day3;

public class Encapsulation_BankAccount {
	private String accountHolder;
    private double balance;

    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setBalance(double amount) {
        if (amount > 0) {
            this.balance = amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
    	Encapsulation_BankAccount acc = new Encapsulation_BankAccount();
        acc.setAccountHolder("Abarna");
        acc.setBalance(10000);
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: " + acc.getBalance());
    }

}
