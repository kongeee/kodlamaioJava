package kahve.Entities;

import kahve.Abstract.Entity;

public class Customer implements Entity {
	private int id;
	private String name;
	private String dateOfBirth;
	private String nationalityID;
	
	public Customer(int id, String name, String dateOfBirth, String nationalityID) {
		
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.nationalityID = nationalityID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationalityID() {
		return nationalityID;
	}
	public void setNationalityID(String nationalityID) {
		this.nationalityID = nationalityID;
	}
	
	
}
