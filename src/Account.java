public class Account {
    private String accountId;
    private double balance;
    private Customer customer;

    public Account(String accountId, double balance, Customer customer) {
        this.accountId = accountId;
        this.balance = balance;
        this.customer = customer;
    }

    // Métodos para operações na conta
    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Getters
    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }
}
