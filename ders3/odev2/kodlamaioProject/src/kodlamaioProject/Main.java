package kodlamaioProject;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.setUserID(1);
		instructor.setEmail("engindemirog@xxx.com");
		instructor.setFullName("Engin Demiroğ");
		instructor.setCv("Üniversite hayatıma ÖSS 2003 Türkiye derecesiyle başladım."
				+ " Sırasıyla Başkent ve ODTÜ'de Yönetim Bilişim Sistemleri (Lisans-Burslu) ve Tıp Bilişimi(Yüksek Lisans) okudum."
				+ " Profesyonel iş hayatıma ise henüz üniversite birinci sınıftayken başladım.");
		
		Student student1 = new Student();
		student1.setUserID(2);
		student1.setEmail("furkanekici@yyy.com");
		student1.setFullName("Furkan Ekici");
		student1.setAddress("Adana");
		
		Student student2 = new Student();
		student2.setUserID(3);
		student2.setEmail("busra@fff.com");
		student2.setFullName("Büşra");
		student2.setAddress("İstanbul");
		
		Student[] students = {student1, student2};
		
		UserManager userManager = new UserManager();
		MessageManager messageManager = new MessageManager();
		
		
		userManager.add(instructor);
		userManager.addMultiple(students);
		
		messageManager.publishMessage(new InstructorManager(), "Hello world");
		messageManager.publishMessage(new StudentManager(), "Hello java");
		
		

	}

}
