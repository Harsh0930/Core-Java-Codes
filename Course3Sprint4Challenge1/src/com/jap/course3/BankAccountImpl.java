package com.jap.course3;

public class BankAccountImpl {
    public static void main(String[] args) {

        CurrentAccount currentAccount=new CurrentAccount("Harsh","Active",20000.0,20,20652413000258l);
        currentAccount.displayDetails();
        currentAccount.creditAmount(1000.0);
        System.out.println("Your total Saving Account Balance is: "+currentAccount.retrieveBalance());
        currentAccount.debitAmount(10000.0);
        System.out.println("Your total Current Account Balance is: "+currentAccount.retrieveBalance());

        System.out.println("--------------------------------------------------------------------------------------");

        SavingAccount savingAccount=new SavingAccount("Harsh Malik","Active",10000.0,18,20652416325l);
        savingAccount.displayDetails();
        savingAccount.creditAmount(200.0);
        System.out.println("Your total Saving Account Balance is: "+savingAccount.retrieveBalance());
        savingAccount.debitAmount(500.0);
        System.out.println("Your total Saving Account Balance is: "+savingAccount.retrieveBalance());







    }
}
