package kodlamaioProject;

public class MessageManager {
	public void publishMessage(UserManager userManager, String message) {
		userManager.sendMessage(message);
	} 
}
