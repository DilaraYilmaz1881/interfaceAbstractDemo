package interfaceAbstractDemo;


import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Dilara");
		customer.setLastName("Yýlmaz");
		customer.setDateOfBirth(2000, 8, 24);
		customer.setNationalityId("12345678910");
		
		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.Save(customer);
		

	}

}
