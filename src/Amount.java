// "Amount" class to represent transaction amounts.
public class Amount {
    private final double amount;
    private final String transactionType;

    public Amount(double amount, String transactionType) {
        this.amount =amount;
        this.transactionType =transactionType;
}
public double getAmount(){
    return amount;
}
public String getTransactionType() {
    return transactionType;
}



}

