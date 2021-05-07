package EcommerceMembership.business.concretes;


import EcommerceMembership.business.abstracts.EmailControllerService;
import EcommerceMembership.business.abstracts.UserService;
import EcommerceMembership.core.abstracts.LoginService;
import EcommerceMembership.dataAccess.abstracts.UserDao;
import EcommerceMembership.entities.concretes.User;

public class UserManager implements UserService {
	//injection
	private UserDao userDao;
	private EmailControllerService emailService;
	private LoginService loginService;
	
	
	public UserManager(UserDao userDao, EmailControllerService emailService, LoginService loginService) {
		this.userDao = userDao;
		this.emailService = emailService;
		this.loginService = loginService;
	}

	
	@Override
	public void signup(User user) {
		
		if(user.getPassword().length()<6 && user.getName().length()<2 && user.getSurname().length()<2) {
			System.out.println("Bir hata olustu. Lütfen istenen uzunluklara dikkat ediniz");
			return;
		}
		
		if(!emailService.validMail(user.getE_mail())) {
			System.out.println("Geçersiz mail");
			return;
		}
		
		if(emailService.isMailUsedBefore(user.getE_mail())) {
			System.out.println("Mail zaten kullanýlýyor : "+user.getE_mail());
			return;
		}
		
		//Yukaridaki kosullardan gecenler eklenir
		
		userDao.add(user);
		System.out.println("Ekleme basarili : "+user.getName());
		
		
		
	}
	
	
	
	@Override
	public void login(String email, String password) {
		User user = userDao.get(email, password);
		if(user.getName() != "0") {
			System.out.println("Giris yapildi : "+user.getE_mail());
			loginService.loginToSystem(user);
			
		}
		else {
			System.out.println("Giris bigileri hatalý!!");
		}
		
	}
	
	
	
	
	
	

}
