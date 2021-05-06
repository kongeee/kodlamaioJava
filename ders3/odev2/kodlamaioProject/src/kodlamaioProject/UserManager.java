package kodlamaioProject;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getUserID()+" added");
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			this.add(user);
		}
		
	}
	
	public void sendMessage(String message) {
		//do nothing;
	}
	
	
	
}
