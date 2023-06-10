package com.jap.course3;

public class SavingAccountImpl {

    public static void main(String[] args) {
        SavingAccount savingaccount=new SavingAccount();

            //accessing the setters using class object...
            System.out.println("You are eligible for opening a Bank Account. Thanking You!!!");
            System.out.println("----------------------------------------------------------------");
            savingaccount.setAccountHolderName("John Wick");
            savingaccount.setAge(20);
            savingaccount.setAccountNumber(20652413222585l);
            savingaccount.setAccountOpeningDate("14/01/2023");
            savingaccount.setAccountStatus(true);
            savingaccount.setInternetBankingEnabled(true);
            savingaccount.setMobileBankingEnabled(false);
            savingaccount.setModeOfOperation("Joint");
            savingaccount.setInterestRate(18);
            savingaccount.setAvailableBalance(12500.0);

            //accessing the getter methods calling the displayDetails method...
            savingaccount.displayDetails();

            //calling methods-> debit, credit and retrieveBalance
            savingaccount.creditAmount(10.0);
            savingaccount.retrieveBalance();
            savingaccount.debitAmount(2000.0);
            savingaccount.retrieveBalance();
    }
}
