import java.util.Scanner;

public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingaccount=new SavingsAccount("Harsh","Active",7418529630L,20);
        Scanner sc=new Scanner(System.in);

        int num;

        System.out.println("----------------Thank you for visiting---------------");


        if(savingaccount.age>=18){
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
                        savingaccount.amount= savingaccount.debitCash(withdrawAmt);
                        break;

                    case 2:
                        System.out.println("Enter the amount that you want to deposit into your Bank: ");
                        double depositAmt=sc.nextDouble();
                        savingaccount.amount=savingaccount.creditCash(depositAmt);
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

