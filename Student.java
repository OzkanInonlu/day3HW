package day3HW;

public class Student extends User{
	
	private int studentId;
	
	public Student(int studentId,String firstName,String lastName,String gender,
			String department) {
		
		super(firstName,lastName,gender,department);
		this.studentId=studentId;
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

}