import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankId;
    private String name;
    private List<Customer> customers;

    public Bank(String bankId, String name) {
        this.bankId = bankId;
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Métodos para operações no banco
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    // Getters
    public String getBankId() {
        return bankId;
    }

    public String getName() {
        return name;
    }
}
