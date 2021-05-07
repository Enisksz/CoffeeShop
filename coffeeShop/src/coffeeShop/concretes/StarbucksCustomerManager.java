package coffeeShop.concretes;

import coffeeShop.abstracts.BaseCustomerManager;
import coffeeShop.abstracts.CustomerCheckService;
import coffeeShop.abstracts.CustomerService;
import coffeeShop.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerService, CustomerCheckService{

	private CustomerCheckService customerCheckservice;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckservice = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		CheckIfRealPerson(customer);
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		if (customerCheckservice.CheckIfRealPerson(customer)) {
			
			System.out.println("A valid person");
			return true;
		}else {
			System.out.println("Not a valid person");
			return false;
		}
		
		
		
		
	}
	

}
