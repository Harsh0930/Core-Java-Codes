package com.jap.course3;

public class CurrentAccount extends BankAccount{

    private String accountType="Current";
    private String transactionLimit="Unlimited transactions";
    private boolean interestAllot=false;
    private String accountPurpose="Business";
    private String accountSuitableFor="Business People";

    //constructor...
    public CurrentAccount(String accountHoldername,String accountStatus,double totalAccountBalance,int age,long accountNumber){
        super(accountHoldername, accountStatus, totalAccountBalance, age, accountNumber);
    }

    //retrieveBalance Method...
    public double retrieveBalance(){
        setTotalAccountBalance(getTotalAccountBalance());
        return getTotalAccountBalance();
    }

    //debitCash Method...
    public double debitAmount(double debitMoney){
        setTotalAccountBalance(getTotalAccountBalance()-debitMoney);
        System.out.println("A/c " + getAccountNumber() + " debited INR " + debitMoney + " debit through bank. Thanking you!!!!");
        return getTotalAccountBalance();
    }

    //creditCash Method...
    public double creditAmount(double creditMoney){
        setTotalAccountBalance(getTotalAccountBalance()+creditMoney);
        System.out.println("A/c " + getAccountNumber() + " with INR " + creditMoney + " credit through Internet Banking. Thanking you!!!!");
        return getTotalAccountBalance();
    }

    //displayDetails...
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Account Type: "+accountType);
        System.out.println("Transaction limit: "+transactionLimit);
        System.out.println("Interest: "+interestAllot);
        System.out.println("Account Purpose: "+accountPurpose);
        System.out.println("Account Suitable for: "+accountSuitableFor);
    }




}
