
public class UserManager implements UserService {
	
	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}
	
	@Override
	public void add(User user) {
		
		if(userCheckService.isRealPerson(user)) {
			System.out.println("User added : "+user.getFirstName());
			
		}
		else {
			System.out.println(user.getFirstName()+ " is not a real person");
		}
		
		
		
	}

	@Override
	public void delete(User user) {
		System.out.println("User deleted : "+user.getFirstName());
		
	}

	@Override
	public void update(User user1, User user2) {
		System.out.println(user1.getFirstName()+"is updating...");
		
		user1.setUserID(user2.getUserID());
		user1.setFirstName(user2.getFirstName());
		user1.setLastName(user2.getLastName());
		user1.setDateOfBirth(user2.getDateOfBirth());
		user1.setNationalityID(user2.getNationalityID());
		
		System.out.println("update succesfully!! : "+user1.getFirstName());
		
	}
	
}
