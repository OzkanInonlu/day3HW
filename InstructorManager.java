package day3HW;

public class InstructorManager extends UserManager{
	
	public void assignInstructorIntoCourse(Instructor instructor,String course) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() 
		+ " has been assigned into " + course);
		
	}
	public void removeInstructorFromCourse(Instructor instructor,String course) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() 
		+ " has been removed from " + course);
		
	}
	public void addStudentIntoCourse(Student student,String course) {
		System.out.println(student.getFirstName() + " " + student.getLastName() 
		+ " has been added into " + course);
	}
	public void removeStudentFromCourse(Student student,String course) {
		System.out.println(student.getFirstName() + " " + student.getLastName() 
		+ " has been removed from " + course);
	}


}
