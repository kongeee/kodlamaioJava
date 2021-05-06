
public class UserCheckManager implements UserCheckService{

	@Override
	public boolean isRealPerson(User user) {
		//burada e-devlet kontrolu simule edildi.
		if(user.getNationalityID().length() == 11) {//yalnizca tcnin 11 haneli oldup olmadigi kontrol ettim(gelistirilebilir)
			return true;
		}
		return false;
		
	}
	
}
