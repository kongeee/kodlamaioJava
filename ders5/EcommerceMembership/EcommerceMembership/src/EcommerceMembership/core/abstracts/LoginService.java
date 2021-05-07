package EcommerceMembership.core.abstracts;

import EcommerceMembership.entities.concretes.User;

public interface LoginService {
	void loginToSystem(User user);
}
