
import java.util.ArrayList;

class BankAccount{
    public int accountNumber;
    public String name;
    private float balance;

    // constructors

    BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
        name = "";
        balance = 0;
        
        System.out.println("Account created with account number: " + accountNumber);
        System.out.println("Account Name:    " + name);
        System.out.println("Account Balance: " + balance + "\n");
    }

    BankAccount(int accountNumber, String name, float balance){
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;

        System.out.println("Account created with account number: " + accountNumber);
        System.out.println("Account Name:    " + name);
        System.out.println("Account Balance: " + balance + "\n");
    }

    // adds money to balance. Put check to see if amt is positive.

    float getBalance(){
        return balance;
    }

    void deposit(float amt){
        if(amt < 0){
            System.out.println("Amount transfer cannot be negative. Cancel operation.");
            return;
        }

        balance += amt;
        
        System.out.println("Deposit " + amt + " to account number " + accountNumber + ". New balance: " + balance);
    }

    /* 
     * removes money from balance. Should ignore when this
     * operation when balance is going lesser than 0.
     */

    void withdraw(float amt){
        if(balance - amt < 0){
            System.out.println("Attempted to withdraw too much money. Cancel operation.");
            return;
        }

        if(amt < 0){
            System.out.println("Amount withdraw cannot be negative. Cancel operation.");
            return;
        }
        
        balance -= amt;

        System.out.println("Withdraw " + amt + " from account number " + accountNumber + ". New balance: " + balance);
    }

    /* withdraw money from calling
     * object (this) and deposit money to the passing object (parameter). Leverage
     * the use of withdraw and deposit methods. If after withdrawing balance is
     * negative cancel the whole operation. If the amt is negative, cancel the whole
     * operation.
     */

    void transfer(BankAccount account, float amt){
        if(amt < 0){
            System.out.println("Amount transfer cannot be negative. Cancel operation.");
            return;
        }

        if(balance - amt < 0){
            System.out.println("Attempted to transfer too much money. Cancel operation.");
            return;
        }

        withdraw(amt);
        account.deposit(amt);

        System.out.println("Transfer " + amt + " from account number " + accountNumber + " to account number " + account.accountNumber + "\n");
    }
}

class AccountManager{
    ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();

    void create(){
        bankAccounts.add(new BankAccount(bankAccounts.size()));
    }

    void create(String name, float balance){
        bankAccounts.add(new BankAccount(bankAccounts.size(), name, balance));
    }

    void deposit(BankAccount account, float amt){
        account.deposit(amt);
    }

    void withdraw(BankAccount account, float amt){
        account.withdraw(amt);
    }
}

class Bank{
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        
        // Creating 5 accounts

        accountManager.create();
        accountManager.create("Account1", 10);
        accountManager.create("Account1", 0);
        accountManager.create("Account3", 2);
        accountManager.create();

        // Deposit operations

        accountManager.deposit(accountManager.bankAccounts.get(0), 5); // Deposit to default account
        accountManager.deposit(accountManager.bankAccounts.get(1), 10); // Deposit to normal account
        accountManager.deposit(accountManager.bankAccounts.get(3), 0); // Deposit 0 to account
        accountManager.deposit(accountManager.bankAccounts.get(3), -5); // Deposit negative number to account
        System.out.println("\n");

        // Withdraw operations

        accountManager.withdraw(accountManager.bankAccounts.get(0), 5); // withdraw to default account
        accountManager.withdraw(accountManager.bankAccounts.get(1), 10); // withdraw to normal account
        accountManager.withdraw(accountManager.bankAccounts.get(3), 0); // withdraw 0 to account
        accountManager.withdraw(accountManager.bankAccounts.get(3), -5); // withdraw negative number to account
        accountManager.withdraw(accountManager.bankAccounts.get(3), 9999); // withdraw more than balance
        System.out.println("\n");

        // Transfer operations

        accountManager.bankAccounts.get(1).transfer(accountManager.bankAccounts.get(0), 5); // transfer from account number "1" to account number "0"
        accountManager.bankAccounts.get(3).transfer(accountManager.bankAccounts.get(3), 2); // transfer from account number "3" to account number "3"
        accountManager.bankAccounts.get(0).transfer(accountManager.bankAccounts.get(1), 0); // transfer 0 as amount
        accountManager.bankAccounts.get(0).transfer(accountManager.bankAccounts.get(1), 9999); // transfer more than account's balance
        accountManager.bankAccounts.get(3).transfer(accountManager.bankAccounts.get(1), -5); // transfer negative money from account

        // Printing result of all accounts in bank

        for(BankAccount bankAccount: accountManager.bankAccounts){
            System.out.println("\nAccount information with account number: " + bankAccount.accountNumber);
            System.out.println("Account Name:    " + bankAccount.name);
            System.out.println("Account Balance: " + bankAccount.getBalance() + "\n"); // get balance using "getBalance()"
        }
    }
}