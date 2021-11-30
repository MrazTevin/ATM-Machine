import java.util.Scanner;
public class BankTransaction {
    private int new_transaction;
    private int choice;

    public void transaction() {
        Scanner input = new Scanner(System.in);
        
        int choice;

        System.out.println("Please select an option: ");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check balance");
        System.out.println("4.View details");
        
        choice = input.nextInt();

        switch(choice) {
            case 1 :
                   System.out.println("Please enter the amount to withdraw: ");
                   AtmMachine draw_money = new AtmMachine();
                  // newTransaction();
                   draw_money.withdrawAmount();
                   //newTransaction();
             break;
            
            case 2 :
                   System.out.println("Please enter the amount to deposit");
                   //AtmMachine put_money = new AtmMachine();
                   //put_money.depositAmount();
                   AtmMachine put_money = new AtmMachine();
                   //newTransaction();
                   put_money.depositAmount();
                   //newTransaction(); 
            break;
        
            case 3 :
                   AtmMachine balance_one = new AtmMachine();
                   //newTransaction();
                   balance_one.displayBalance();
                   newTransaction();
            break;
            case 4: 
                   System.out.println("Your Account Details are as follows :");
                   AccountOwner owner_one = new AccountOwner("Victor");
                   owner_one.userAge(30);
                   owner_one.userJobDescription("Software Developer");
                   owner_one.printAccountDetails();
                   newTransaction();
            break;
            default:
                    System.out.println("Invalid Option : \n\n");
                    newTransaction();
        }
    }

    public void newTransaction() {
        System.out.println("Do you want to transact again. \n\n Press 1 to transact or press 2 to exit");
        Scanner input = new Scanner(System.in);
        new_transaction = input.nextInt();
        
        if (new_transaction == 1) {
            transaction();        
        } else if(new_transaction == 2) {
            System.out.println("Thank you for using our service");
            System.exit(0);
        } else {
            System.out.println("Invalid Option \n");
            newTransaction();
        }
    }    

}
