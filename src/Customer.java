import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private List<Account> accounts;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    // Métodos para manipular contas do cliente
    public void addAccount(Account account) {
        this.accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    // Getters
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
