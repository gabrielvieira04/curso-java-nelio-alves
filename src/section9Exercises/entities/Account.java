package section9Exercises.entities;

public class Account {
    
    private int accountNumber;
    private String accountName;
    private double balance;

    //Em caso de deposito inicial
    public Account (int accountNumber, String accountName, double initialDeposit){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        deposit(initialDeposit);
    }

    //Em caso de nao existir deposito inicial
    public Account (int accountNumber, String accountName){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }
    

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }    

    public void withdraw (double amount){
        setBalance(getBalance() - amount - 5);
    }

    public void deposit (double amount){
        setBalance(getBalance() + amount);
    }

    @Override
    public String toString(){
        return "ACCOUNT DATA \n" 
        + String.format("Account %d, Holder %s, Balance: $ %.2f ", getAccountNumber(), getAccountName(), getBalance());
    }



}
