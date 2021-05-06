package kodlamaioProject;

public class StudentManager extends UserManager {
	
	@Override
	public void sendMessage(String message) {
		System.out.println("Send message as student :"+message);
	}
	
}
