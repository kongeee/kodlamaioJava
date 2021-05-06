package kahve.Concrete;

import kahve.Abstract.PersonCheckService;
import kahve.Entities.Customer;

public class CustomerCheckManager implements PersonCheckService {

	@Override
	public boolean isRealPerson(Customer customer) {
		//gerekli dogrulama islemleri .... (Burada musterinin kontrolden gecip onaylandigini varsayiyoruz)
		return true;
	}

}
