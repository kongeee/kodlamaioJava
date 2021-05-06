package kodlamaioProject;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setUserID(1);
		instructor.setEmail("engindemirog@xxx.com");
		instructor.setFullName("Engin Demiro�");
		instructor.setCv("�niversite hayat�ma �SS 2003 T�rkiye derecesiyle ba�lad�m."
				+ " S�ras�yla Ba�kent ve ODT�'de Y�netim Bili�im Sistemleri (Lisans-Burslu) ve T�p Bili�imi(Y�ksek Lisans) okudum."
				+ " Profesyonel i� hayat�ma ise hen�z �niversite birinci s�n�ftayken ba�lad�m.");
		
		Student student1 = new Student();
		student1.setUserID(2);
		student1.setEmail("furkanekici@yyy.com");
		student1.setFullName("Furkan Ekici");
		student1.setAddress("Adana");
		
		Student student2 = new Student();
		student2.setUserID(3);
		student2.setEmail("busra@fff.com");
		student2.setFullName("B��ra");
		student2.setAddress("�stanbul");
		
		Student[] students = {student1, student2};
		
		UserManager userManager = new UserManager();
		MessageManager messageManager = new MessageManager();
		
		
		userManager.add(instructor);
		userManager.addMultiple(students);
		
		messageManager.publishMessage(new InstructorManager(), "Hello world");
		messageManager.publishMessage(new StudentManager(), "Hello java");
		
		

	}

}
