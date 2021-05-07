package coffeeShop.concretes;

import coffeeShop.abstracts.BaseCustomerManager;
import coffeeShop.abstracts.CustomerCheckService;
import coffeeShop.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	private CustomerCheckService customerCheckService;
	
	@Override
	public void save(Customer customer) {
		super.save(customer);
	}
	

}
