package kodlamaio;

public class CourseManager {
	public void addToCourse(Member member, Course course) {
		System.out.println(member.fullName+" is added to "+course.courseName);
	}
	
	public void editCourse(Course course, int newCid, String newCname, String newIname, String newCinfo) {
		System.out.println("Before edit : "+ course.courseID+"/"+course.courseName+"/"+course.instructorName+"/"
				+course.courseInfo);
		
		course.courseID = newCid;
		course.courseName = newCname;
		course.instructorName = newIname;
		course.courseInfo = newCinfo;
		
		System.out.println("After edit : "+ course.courseID+"/"+course.courseName+"/"+course.instructorName+"/"
				+course.courseInfo);
	}
}
