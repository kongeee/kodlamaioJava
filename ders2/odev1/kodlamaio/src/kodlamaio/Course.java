package kodlamaio;

public class Course {
	//attributes
	int courseID;
	String courseName;
	
	String instructorName;
	String courseInfo;
	
	//constructor
	public Course(int cid, String cname, String iname, String cinfo) {
		this.courseID 			= cid;
		this.courseName 		= cname;
		this.instructorName 	= iname;
		this.courseInfo			= cinfo;
		
		System.out.println("Course is created: "+this.courseName);
	}
}
