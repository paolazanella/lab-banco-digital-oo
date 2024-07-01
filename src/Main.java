public class Main {

    public static void main(String[] args) {
        // Exemplo de operações com contas
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // Criando um banco
        Bank bank = new Bank("B001", "Meu Banco");

        // Criando clientes
        Customer customer1 = new Customer("C001", "João", "joao@email.com");
        Customer customer2 = new Customer("C002", "Maria", "maria@email.com");

        // Adicionando clientes ao banco
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Criando contas para os clientes
        Account account1 = new Account("ACC001", 1000.0, customer1);
        Account account2 = new Account("ACC002", 500.0, customer2);

        // Adicionando contas aos clientes
        customer1.addAccount(account1);
        customer2.addAccount(account2);

        // Realizando operações nas contas
        account1.deposit(500.0);
        account2.withdraw(200.0);

        // Exibindo informações
        System.out.println("Clientes do banco " + bank.getName() + ":");
        for (Customer customer : bank.getCustomers()) {
            System.out.println(" - " + customer.getName());
            System.out.println("   Contas:");
            for (Account account : customer.getAccounts()) {
                System.out.println("     [" + account.getAccountId() + "] Saldo: " + account.getBalance());
            }
        }
    }
}
