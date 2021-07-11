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
	public void getInfo(Instructor instructor) {
		System.out.println("firstName : " +instructor.getFirstName()+
				"\nlastName : " + instructor.getLastName() + "\ndepartment : "
				+ instructor.getDepartment() + "\nInstructor ID : " + instructor.getInstructorId());
		
	}

}
