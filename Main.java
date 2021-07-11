package day3HW;

public class Main {

	public static void main(String[] args) {
		
		User user1=new User("melisa","diken","female","computer");
		Student özkan=new Student(1, "özkan", "inönlü", "male", "computer");
		Instructor engin=new Instructor(101,"engin","demirog","male","computer");
		Instructor derya=new Instructor(102,"derya","bulut","female","computer");
		
		Student mete=new Student(1, "mete", "kemal", "male", "computer");
		
		UserManager userManager=new UserManager();
		userManager.register(özkan);
		userManager.register(engin);
		userManager.register(derya);
		
		userManager.logIn(özkan);
		userManager.logIn(engin);
		userManager.logIn(derya);
		
		StudentManager studentManager=new StudentManager();
		studentManager.addCourse(özkan);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.assignInstructorIntoCourse(engin, "java");
		
		studentManager.addCourse(mete);
		studentManager.removeCourse(mete);
		
		studentManager.getInfo(özkan);
		
		instructorManager.getInfo(engin);
		
		instructorManager.getInfo(derya);
		instructorManager.assignInstructorIntoCourse(derya, "python");
		
		userManager.logOut(özkan);
		userManager.logOut(engin);
		userManager.logOut(derya);
	}	

}
