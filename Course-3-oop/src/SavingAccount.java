import java.util.Scanner;

public class SavingAccount {
    String name;
    long accountNumber;
    int age;

    double amount;


    public void showDetails(){
            System.out.println("---------------You are eligible---------------");
            System.out.println("Customer Name: "+name);
            System.out.println("Customer Age: "+age);
            System.out.println("Customer account number: "+accountNumber);
            System.out.println("Bank account Balance: "+amount);
    }

    public double withdrawMoney(double withdrawAmt){
        amount=amount-withdrawAmt;
        System.out.println("A/c "+accountNumber+ " debited INR "+amount+" withdraw through bank. Thanking you!!!!");
        return amount;
    }

    public double depositMoney(double depositAmt){
        amount=amount+depositAmt;
        System.out.println("A/c "+accountNumber+" with INR "+ amount+ " deposited through Internet Banking. Thanking you!!!!");
        return amount;
    }

    public double checkBalance(){
        System.out.println("Your Bank Balance is: "+amount);
        return amount;

    }

    public static void main(String[] args) {
        SavingAccount savingaccount=new SavingAccount();
        Scanner sc=new Scanner(System.in);

        int num;

        System.out.println("----------------Thank you for visiting---------------");
        System.out.println("Enter your age for eligibility check: ");
        savingaccount.age=sc.nextInt();

        if(savingaccount.age>=18){
            System.out.println("Enter your Name: ");
            savingaccount.name=sc.next();
            System.out.println("Enter your 12 Digits Account number: ");
            savingaccount.accountNumber=sc.nextLong();


        do{
            System.out.println("Choose an option to continue: ");
            System.out.println("1. Withdraw Money from the Bank.");
            System.out.println("2. Deposit Money to the Bank.");
            System.out.println("3. Check Balance");

            int choice;
            choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter the amount that you want to withdraw from bank: ");
                    double withdrawAmt=sc.nextDouble();
                    savingaccount.amount= savingaccount.withdrawMoney(withdrawAmt);
                    break;

                case 2:
                    System.out.println("Enter the amount that you want to deposit into your Bank: ");
                    double depositAmt=sc.nextDouble();
                    savingaccount.amount=savingaccount.depositMoney(depositAmt);
                    break;

                case 3:
                    savingaccount.amount=savingaccount.checkBalance();
                    break;

                default:
                    System.out.println("Invalid choice entered.");
            }
            System.out.println("Press 1 for Continue & 0 for Exit");
            num= sc.nextInt();

        }while (num!=0);
        savingaccount.showDetails();
    }else {
            System.out.println("Not eligible for Banking Services.");
        }
    }
}
