package day3HW;

public class UserManager {
	
	public void getInfo(User user) {
		System.out.println("firstName : " + user.getFirstName() + 
				"\n lastName: " + user.getLastName());
		
	}
	public void register(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
		+ " has been registered into system");
	}
	public void logIn(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
		+ " has been logged in into system");
	}
	public void logOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
		+ " has been logged out from the system");
	}
	public void updateUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
		+  " has been updated");
	}
	public void removeUser(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() 
		+  " has been removed");
	}

	

}
