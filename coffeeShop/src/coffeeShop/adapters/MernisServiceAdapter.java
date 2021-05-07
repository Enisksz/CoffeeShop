package coffeeShop.adapters;

import java.rmi.RemoteException;

import coffeeShop.abstracts.CustomerCheckService;
import coffeeShop.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		boolean result = false;

		try {
			KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationality()),
					customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
					customer.getDateOfBirth());
			System.out.println(result);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {

			e.printStackTrace();
		}
		return result;

	}

}
