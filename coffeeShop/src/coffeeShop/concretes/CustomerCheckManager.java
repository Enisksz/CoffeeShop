package coffeeShop.concretes;

import coffeeShop.abstracts.CustomerCheckService;
import coffeeShop.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
