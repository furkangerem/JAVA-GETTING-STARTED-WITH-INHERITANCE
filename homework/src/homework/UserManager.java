package homework;

public class UserManager {
	
	public void login(User user) {
		System.out.println("Welcome, " + user.getFirstName() + " " + user.getLastName());
	}

	public void signOut(User user) {
		System.out.println("See you again, " + user.getFirstName() + " " + user.getLastName());
	}
}
