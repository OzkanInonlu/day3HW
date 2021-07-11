package day3HW;

public class Instructor extends User{
	
	private int instructorId;

	public Instructor(int instructorId,String firstName, String lastName, String gender,
			String department) {
		super(firstName, lastName, gender, department);
		this.instructorId = instructorId;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	

}
