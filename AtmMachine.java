import java.util.Scanner;
public class AtmMachine {
    private int balance = 0;
    private int withdrawal_amount;
    private int new_transaction;
    private int deposit;
    
    
    public void displayBalance() {
        System.out.println("Current Balance is : " + balance);
        //BankTransaction transact_again = new BankTransaction();
       // transact_again.newTransaction();
                       
    }
    
    public int withdrawAmount() {
        Scanner input = new Scanner(System.in);
        withdrawal_amount = input.nextInt();

        if (withdrawal_amount > balance || withdrawal_amount == 0) {
           // balance = balance - withdrawal_amount;
           // System.out.println("You've withdrawn shillings, " + withdrawal_amount);
           // displayBalance(balance);
            System.out.println("Sorry, you have got insufficient funds \n\n");
            BankTransaction transact_again = new BankTransaction();
            transact_again.newTransaction();
        }
        else {
            // System.out.println("Sorry, you have got insufficient funds \n\n");
            balance = withdrawal_amount - balance;
            System.out.println("You've withdrawn shillings, " + withdrawal_amount);
            displayBalance();
            BankTransaction transact_again = new BankTransaction();
            transact_again.newTransaction();
        }
        return balance;
    }
    
    public int depositAmount() {
        Scanner input = new Scanner(System.in);
        deposit = input.nextInt();
        
        balance = deposit + balance;
        System.out.println("You've deposited shillings " + deposit + " successfully");
        displayBalance();
        BankTransaction transact_again = new BankTransaction();
        transact_again.newTransaction();    
        // balance = balance + deposit;
       // displayBalance(balance);
        //BankTransaction transact_again = new BankTransaction();
        //transact_again.newTransaction();

        return balance;
                
    }
}   


         
