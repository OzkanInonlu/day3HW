package day3HW;

public class StudentManager extends UserManager{
	
	public void addCourse(Student student) {
		
		System.out.println(student.getFirstName() + " " +student.getLastName()+
				" has been added into course");
	}
	public void removeCourse(Student student) {
		
		System.out.println(student.getFirstName() + " " +student.getLastName()+
				" has been removed from the course");
	}
	public void getInfo(Student student) {
		System.out.println("firstName : " +student.getFirstName()+
				"\nlastName : " + student.getLastName() + "\ndepartment : "
				+ student.getDepartment() + "\nStudent ID : " + student.getStudentId());
		
	}

}
