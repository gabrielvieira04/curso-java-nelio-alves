package section9Exercises.application;

import java.util.Locale;
import java.util.Scanner;
import section9Exercises.entities.Account;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;
        sc.useLocale(Locale.US);

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account Holder: ");
        String accountHolder = sc.nextLine();
        
        String option;
        do {
            System.out.println("Is there a initial deposit ? (y/n)");
            option = sc.nextLine().trim();
            if (!option.equalsIgnoreCase("y") && !option.equalsIgnoreCase("n")) {
                System.out.println("Invalid option, try again: ");
            }
        }  while (!option.equalsIgnoreCase("y") && !option.equalsIgnoreCase("n"));
        
       
        if (option.equalsIgnoreCase("y")){
            System.out.println("Enter the initial deposit");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        } else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println(account);
        System.out.println("Enter a deposit value: ");
        account.deposit(sc.nextDouble());

        System.out.println(account);
       
        System.out.println("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        
        System.out.println(account);

        sc.close();
    }

}
