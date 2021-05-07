package coffeeShop;

import coffeeShop.abstracts.BaseCustomerManager;
import coffeeShop.adapters.MernisServiceAdapter;
import coffeeShop.concretes.NeroCustomerManager;
import coffeeShop.concretes.StarbucksCustomerManager;
import coffeeShop.entities.Customer;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer(1,"Enis","Öksüz",2000,"11234902664");
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);
		System.out.println();
	
	}

}
