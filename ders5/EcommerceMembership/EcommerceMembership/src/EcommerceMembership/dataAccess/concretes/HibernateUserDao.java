package EcommerceMembership.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import EcommerceMembership.dataAccess.abstracts.UserDao;
import EcommerceMembership.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void add(User user) {
		
		System.out.println("DB'ye kaydedildi"+user.getName());
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getAllEmails() {
		//simulasyon icin birkac tane mail giriyorum
		
		List<String> emails = new ArrayList<String>();
		emails.add("furkan@mail.com");
		emails.add("busra@mail.com");
		
		return emails;
	}

	@Override
	public User get(String email, String password) {
		//deneme icin birkac kullanici ekliyorum
		
		User user1 = new User("furkan", "ekici", "furkan@mail.com", "password");
		User user2 = new User("busra", "oran", "busra@mail.com", "deneme");
		
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		
		for(User user : users) {
			if(user.getE_mail() == email && user.getPassword() == password) {
				return user;
			}
		}
		return new User("0","0","0","0");
		
	}

}
