public class App {
    public static void main(String[]args) {
    // Exemplo de utilização
        CustomerDatabase customerDatabase = new CustomerDatabase();
    // Adicionar clientes ao banco de dados
        Customer customer1 = new Customer("12345678901","João");
        customerDatabase.addCustomer(customer1);
        Customer customer2 = new Customer("98765432109","Maria");
        customerDatabase.addCustomer(customer2);


    // Buscar cliente pelo CPF
        String cpf="12345678901";
        Customer customer = customerDatabase.getCustomerByCpf(cpf);
  
        if (customer != null) {
            System.out.println("Cliente encontrado:" + customer.getName());
        } else {
            System.out.println("Cliente não encontrado");
        }
    }
}