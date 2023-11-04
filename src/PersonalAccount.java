import java.util.ArrayList;
// "PersonalAccount" class to represent a personal bank account
public class PersonalAccount {
    private final int accountNumber;
    private String accountHolder;
    private double balance;
    ArrayList<Amount> transactions;

    /**
     * A new "PersonalAccount" with the account number and account holder.
     * Initializes the balance to 0.0
     *
     * @param accountNumber The unique identifier for the account.
     * @param accountHolder The name of the account holder.
     */



    public PersonalAccount (int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();

    }
    /**
     * Deposit money into the account.
     *
     * @param amount The amount to be deposited.
     */

    public void deposit (double amount) {
        if (amount > 0) {
            this.balance += amount;
            Amount depositTransaction = new Amount(amount, "Deposit");
            transactions.add(depositTransaction);
        } else {
            System.out.println("Invalid deposit amount! ");
        }
    }

    /**
     * Withdraw funds from the account.
     *
     * @param amount The amount to withdraw.
     */
    void withdraw (double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            Amount transaction = new Amount(amount, "Withdraw");
            this.transactions.add(transaction);
            transactions.add(transaction);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    /**
     * Print all transactions history of the account.
     * Iterates through the "transactions" array and displays each transaction, including the transaction type and amount.
     */
       void printTransactionHistory() {

               for (Amount transaction : transactions) {
                   System.out.println("Account Name: " + accountHolder);
                   System.out.println("Account Number: " + accountNumber);
                   System.out.println("Transaction type: " + transaction.getTransactionType());
                   System.out.println("Transaction amount: " + transaction.getAmount());


               }
           }

    /**
     * Get the current balance of the account.
     *
     * @return The current balance.
     */
        String getAccountHolder(){
            return this.accountHolder;
        }
        int getAccountNumber() {
            return this.accountNumber;
        }
        double getBalance(){
            return this.balance;
        }
   }
