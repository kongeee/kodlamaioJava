package kahve.Abstract;
import kahve.Entities.*;

public interface PersonCheckService {
	//suanlik sadece starbucksta var ama daha sonra bu sistemi diger kahveciler de kullanmka isteyebilir
	//bu yuzden interface icine yazip moduler hale getiriyoruz
	
	boolean isRealPerson(Customer customer);

}
