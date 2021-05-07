package EcommerceMembership.business.abstracts;

public interface EmailControllerService {
	boolean validMail(String mail);
	boolean isMailUsedBefore(String mail);
	
}
