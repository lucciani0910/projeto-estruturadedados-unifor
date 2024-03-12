import java.util.HashMap;

public class CustomerDatabase {
    
    private HashMap<String, Customer> Database;

    public CustomerDatabase() {
        Database = new HashMap<>();
    }

    public void addCustomer(Customer customer) {
      // Adicionar o cliente ao hash usando o CPF como chave
        Database.put(customer.getCpf(),customer);
    }

    public Customer getCustomerByCpf(String cpf) {
     // Retornar o cliente correspondente ao CPF informado
        return Database.get(cpf);

    }
}