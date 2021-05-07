package EcommerceMembership.core.concretes;

import EcommerceMembership.core.abstracts.LoginService;
import EcommerceMembership.entities.concretes.User;
import EcommerceMembership.googleAccount.Google;

public class GoogleAdapter implements LoginService{

	@Override
	public void loginToSystem(User user) {
		Google google = new Google();
		google.loginWithGoogle(user);
		
		
	}

}
