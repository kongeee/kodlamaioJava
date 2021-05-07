package EcommerceMembership;

import EcommerceMembership.business.abstracts.UserService;
import EcommerceMembership.business.concretes.EmailController;
import EcommerceMembership.business.concretes.UserManager;
import EcommerceMembership.core.concretes.GoogleAdapter;
import EcommerceMembership.dataAccess.concretes.HibernateUserDao;
import EcommerceMembership.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		
		User user1 = new User("eren", "ekici", "ereeen@mail.com", "password123");
		User user2 = new User("furkan", "ekici", "furkan@mail.com", "password");
		UserService userService = new UserManager(new HibernateUserDao(), new EmailController(new HibernateUserDao()), new GoogleAdapter());
		
		//kayit olma simulasyonu
		System.out.println("Kayýt Simülasyonu :");
		userService.signup(user1);
		userService.signup(user2);
		
		System.out.println("\nGiriþ Simülasyonu :");
		//giris simulasyonu
		userService.login(user1.getE_mail(), user1.getPassword());
		userService.login(user2.getE_mail(), user2.getPassword());
		
		
		

	}

}
