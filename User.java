package day3HW;

public class User {
	
	private String firstName;
	private String lastName;
	private String department;
	private String gender;
	
	public User(String firstName, String lastName, String gender,String department) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.department=department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
