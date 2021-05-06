
public class User {
	private int userID;
	private String firstName;
	private String lastName;
	private String nationalityID;
	private String dateOfBirth;
	
	public User() {}

	public User(int userID, String firstName, String lastName, String nationalityID, String dateOfBirth) {
		
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityID = nationalityID;
		this.dateOfBirth = dateOfBirth;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityID() {
		return nationalityID;
	}

	public void setNationalityID(String nationalityID) {
		this.nationalityID = nationalityID;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}	
