package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) 
	{
		
		//KPSPublicSoapProxy merniss = new KPSPublicSoapProxy():
		//boolean result = true;
		//result = merniss.TCKimlikNoDogrula(Long.parselLong(tc),firstName, lastName,birtDate):
		return true;
	}

}
