package EcommerceMembership.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import EcommerceMembership.business.abstracts.EmailControllerService;
import EcommerceMembership.dataAccess.abstracts.UserDao;

public class EmailController implements EmailControllerService {
	private UserDao userDao;
	
	
	public EmailController(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public boolean validMail(String email) {
		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
		Matcher matcher = pattern.matcher(email);

		return matcher.find(); // true or false
	}
	
	public boolean isMailUsedBefore(String email) {
		
		for(String DBmail: userDao.getAllEmails()) {
			if(DBmail == email) {
				return true;
			}
		}
		return false;
		
	}
}
