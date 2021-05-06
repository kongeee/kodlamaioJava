package kahve;

import kahve.Entities.*;
import kahve.Concrete.*;
import kahve.Abstract.*;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1, "Furkan", "1997", "12345678910"));
	
	}
}
