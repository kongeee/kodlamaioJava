package EcommerceMembership.dataAccess.abstracts;

import java.util.List;

import EcommerceMembership.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	User get(String email, String password);
	List<String> getAllEmails();
	
}
