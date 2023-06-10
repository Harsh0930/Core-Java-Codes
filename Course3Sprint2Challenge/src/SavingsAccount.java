import java.util.Scanner;

public class SavingsAccount {
    String name;
    String accountStatus;
    long accountNumber;
    int age;

    double amount;


    //Constructor..
    public SavingsAccount(String name,String accountStatus,long accountNumber,int age){
        this.name=name;
        this.accountNumber=accountNumber;
        this.accountStatus=accountStatus;
        this.age=age;
    }


    public void showDetails() {
        System.out.println("---------------You are eligible---------------");
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Age: " + age);
        System.out.println("Customer account number: " + accountNumber);
        System.out.println("Bank account Balance: " + amount);
        System.out.println("Account status: "+accountStatus);
    }
    public double debitCash(double withdrawAmt) {
        if(amount>0){
            amount = amount - withdrawAmt;
            System.out.println("A/c " + accountNumber + " debited INR " + amount + " withdraw through bank. Thanking you!!!!");
            return amount;
        }else {
            return 0;
        }

    }

    public double creditCash(double depositAmt) {
        amount = amount + depositAmt;
        System.out.println("A/c " + accountNumber + " with INR " + amount + " deposited through Internet Banking. Thanking you!!!!");
        return amount;
    }

    public double checkBalance() {
        System.out.println("Your Bank Balance is: " + amount);
        return amount;

    }
}
