package com.jap.course3;

public abstract class BankAccount {

    private String accountHoldername;
    private String accountStatus;
    private double totalAccountBalance;
    private int age;
    private long accountNumber;


    //constructor...
    public BankAccount(String accountHoldername,String accountStatus,double totalAccountBalance,int age,long accountNumber){
        this.accountHoldername=accountHoldername;
        this.accountStatus=accountStatus;
        this.age=age;
        this.totalAccountBalance=totalAccountBalance;
        this.accountNumber=accountNumber;
    }

    //getters...
    public String getAccountHoldername(){
        return accountHoldername;
    }
    public String getAccountStatus(){
        return accountStatus;
    }
    public double getTotalAccountBalance(){
        return totalAccountBalance;
    }
    public int getAge(){
        return age;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    //setters...
    public void setAccountHoldername(String accountHoldername){
        this.accountHoldername=accountHoldername;
    }
    public void setAccountStatus(String accountStatus){
        this.accountStatus=accountStatus;
    }
    public void setTotalAccountBalance(double totalAccountBalance){
        this.totalAccountBalance=totalAccountBalance;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setAge(int age){
        this.age=age;
    }

    //displayDetails...
    public void displayDetails(){
        System.out.println("Account Holder Name: "+getAccountHoldername());
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Account status: "+getAccountStatus());
        System.out.println("Age: "+getAge());
        System.out.println("Available Bank Balance: "+getTotalAccountBalance());
    }

    //abstract methods...
    public abstract double retrieveBalance();
    public abstract double debitAmount(double debitMoney);
    public abstract double creditAmount(double creditMoney);

}
