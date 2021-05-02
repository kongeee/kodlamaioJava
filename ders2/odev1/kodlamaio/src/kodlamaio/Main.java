package kodlamaio;

public class Main {

	public static void main(String[] args) {
		//courses
		Course course1 = new Course(1, "Java kursu", "Engin Demiroğ", "kurs detay");
		Course course2 = new Course(2, "C# kursu", "Engin Demiroğ", "kurs detay222");
		
		//members
		Member member1 = new Member(1, "Furkan Ekici", "furkanekici@xxx.com");
		Member member2 = new Member(4, "Eren Ekici", "eren@yyyy.com");
		Member member3 = new Member(5, "Büşra", "busra@kkkk.com");
		
		Course[] courses = {course1, course2};
		Member[] members = {member1, member2, member3};
		
		//print all courses
		System.out.println("\nAll Courses :");
		for(Course course : courses) {
			System.out.println(course.courseName);
		}
		
		//print all members
		System.out.println("\nAll Members :");
		for(Member member : members) {
			System.out.println(member.fullName);
		}
		System.out.println("\n\n");
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(member1, course1);
		courseManager.addToCourse(member2, course1);
		courseManager.addToCourse(member3, course1);
		
		courseManager.addToCourse(member3, course2);
		
		System.out.println("\n");
		
		courseManager.editCourse(course2, 7, "Python Kursu", "Engin Demiroğ", "Python kurs detayları");
		
	}

}
