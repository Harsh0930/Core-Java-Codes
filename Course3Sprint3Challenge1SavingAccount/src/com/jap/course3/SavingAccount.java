package com.jap.course3;

public class SavingAccount {
        private String accountHolderName;
        private long accountNumber;
        private String accountOpeningDate;
        private boolean isAccountStatus;
        private double availableBalance; //Available balance
        private double totalAccountBalance;
        private boolean isInternetBankingEnabled;
        private boolean isMobileBankingEnabled;
        private int interestRate;
        private String modeOfOperation;
        private int age;

        //getters...
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public String getAccountOpeningDate(){
        return accountOpeningDate;
    }
    public boolean getIsAccountStatus(){
        return isAccountStatus;
    }
    public double getTotalAccountBalance(){
        return totalAccountBalance;
    }
    public boolean getIsInternetbankingEnabled(){
        return isInternetBankingEnabled;
    }
    public boolean getIsMobileBankingEnabled(){
        return isMobileBankingEnabled;
    }
    public int getInterestRate(){
        return interestRate;
    }
    public double getAvailableBalance(){
        return availableBalance;//available
    }

    public String getModeOfOperation(){
        return modeOfOperation;
    }

    public int getAge(){
        return age;
    }

    //setters...
    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public void setAccountOpeningDate(String accountOpeningDate){
        this.accountOpeningDate=accountOpeningDate;
    }
    public void setAvailableBalance(double availableBalance){
        this.availableBalance=availableBalance;
    }
    public void setAccountStatus(boolean accountStatus){
        this.isAccountStatus=accountStatus;
    }
    public void setTotalAccountBalance(double totalAccountBalance){
        this.totalAccountBalance=totalAccountBalance;
    }
    public void setInternetBankingEnabled(boolean isInternetBankingEnabled){
        this.isInternetBankingEnabled=isInternetBankingEnabled;
    }
    public void setMobileBankingEnabled(boolean isMobileBankingEnabled){
        this.isMobileBankingEnabled=isMobileBankingEnabled;
    }
    public void setInterestRate(int interestRate){
        this.interestRate=interestRate;
    }
    public void setModeOfOperation(String modeOfOperation){
        this.modeOfOperation=modeOfOperation;
    }
    public void setAge(int age){
        this.age=age;
    }

    //debitAmount Method...
    public double debitAmount(double debitMoney){
        availableBalance=getAvailableBalance()-debitMoney;
//        totalAccountBalance=getTotalAccountBalance()-debitMoney;
        System.out.println("A/c " + getAccountNumber() + " debited INR " + debitMoney + " debit through bank. Thanking you!!!!");
        return getAvailableBalance();
    }

    //creditAmount method...
    public double creditAmount(double creditMoney){
        availableBalance=getAvailableBalance()+creditMoney;
//        totalAccountBalance=getTotalAccountBalance()+creditMoney; //1000+10
        System.out.println("A/c " + getAccountNumber() + " with INR " + creditMoney + " credit through Internet Banking. Thanking you!!!!");
        return getAvailableBalance();
    }

    //retrieveBalance method...
    public double retrieveBalance(){
        totalAccountBalance=getAvailableBalance();
//        availableBalance=getTotalAccountBalance();
        System.out.println("Your total account balance is: "+getTotalAccountBalance());
        return getTotalAccountBalance();
    }

    //displayDetails...
    public void displayDetails(){
        System.out.println("Account Holder Name: "+getAccountHolderName());
        System.out.println("Age is: "+getAge());
        System.out.println("Account Number: "+getAccountNumber());
        System.out.println("Account Opening Date: "+getAccountOpeningDate());
        System.out.println("Account status: "+getIsAccountStatus());
        System.out.println("Internet Banking Enabled: "+getIsInternetbankingEnabled());
        System.out.println("Mobile banking Enabled: "+getIsMobileBankingEnabled());
        System.out.println("Mode of Operation: "+getModeOfOperation());
        System.out.println("Interest Rate: "+getInterestRate());
        System.out.println("Available Balance: "+getAvailableBalance());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
