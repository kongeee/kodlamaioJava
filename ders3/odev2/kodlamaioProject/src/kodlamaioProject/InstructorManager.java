package kodlamaioProject;

public class InstructorManager extends UserManager {
	public void editCV(Instructor instructor, String newCV) {
		System.out.println("before edit cv :"+instructor.getCv());
		instructor.setCv(newCV);
		System.out.println("after edit cv :"+instructor.getCv());
	}
	
	@Override
	public void sendMessage(String message) {
		System.out.println("Send message as instructor :"+message);
	}
	
	
}
