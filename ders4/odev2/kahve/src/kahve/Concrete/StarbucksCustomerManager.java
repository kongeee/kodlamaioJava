package kahve.Concrete;

import kahve.Abstract.BaseCustomerManager;
import kahve.Abstract.PersonCheckService;
import kahve.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	//dependency injection
	private PersonCheckService personCheckService;
	
	public StarbucksCustomerManager(PersonCheckService personCheckService) {
		this.personCheckService = personCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(personCheckService.isRealPerson(customer)) {
			super.save(customer);//ust classtaki save metodunu kullan
		}
		
	}

	

}
