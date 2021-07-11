package day3HW;

public class Main {

	public static void main(String[] args) {
		
		User user1=new User("melisa","diken","female","computer");
		Student �zkan=new Student(1, "�zkan", "in�nl�", "male", "computer");
		Instructor engin=new Instructor(101,"engin","demirog","male","computer");
		Instructor derya=new Instructor(102,"derya","bulut","female","computer");
		
		Student mete=new Student(1, "mete", "kemal", "male", "computer");
		
		UserManager userManager=new UserManager();
		userManager.register(�zkan);
		userManager.register(engin);
		userManager.register(derya);
		
		userManager.logIn(�zkan);
		userManager.logIn(engin);
		userManager.logIn(derya);
		
		StudentManager studentManager=new StudentManager();
		studentManager.addCourse(�zkan);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.assignInstructorIntoCourse(engin, "java");
		
		studentManager.addCourse(mete);
		studentManager.removeCourse(mete);
		
		studentManager.getInfo(�zkan);
		
		instructorManager.getInfo(engin);
		
		instructorManager.getInfo(derya);
		instructorManager.assignInstructorIntoCourse(derya, "python");
		
		userManager.logOut(�zkan);
		userManager.logOut(engin);
		userManager.logOut(derya);
	}	

}
