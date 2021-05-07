package EcommerceMembership.entities.concretes;

import EcommerceMembership.entities.abstracts.Entitiy;

public class User implements Entitiy {
	
	private String name;
	private String surname;
	private String e_mail;
	private String password;
	
	public User() {}

	public User(String name, String surname, String e_mail, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.e_mail = e_mail;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
