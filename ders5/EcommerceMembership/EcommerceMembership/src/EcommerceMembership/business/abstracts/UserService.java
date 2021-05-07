package EcommerceMembership.business.abstracts;

import EcommerceMembership.entities.concretes.User;

public interface UserService {
	

	void signup(User user);

	void login(String email, String password);
	
}
