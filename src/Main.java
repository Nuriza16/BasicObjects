// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PersonalAccount account=new PersonalAccount(160802, "N.Kalbaeva");
        account.deposit(350.00);
        account.withdraw(40.00);
        account.withdraw(100.00);
        account.deposit(30.00);
        System.out.println("Account Name: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance " + account.getBalance());

        account.printTransactionHistory();
    }
}
