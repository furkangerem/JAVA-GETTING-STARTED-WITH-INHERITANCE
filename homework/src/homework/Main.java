package homework;

public class Main {

	public static void main(String[] args) {

		User user = new User(1, "Furkan", "Gerem", "furkangerem@hotmail.com", "furkangerem");
		Student student = new Student(2, "Muhammed", "Gerem", "mfurkangerem@hotmail.com", "mfurkangerem", 40, "Java Course");
		Instructor instructor = new Instructor(3, "Engin", "Demirog", "engindemirog@hotmail.com", "engindemirog", "101");

		UserManager userManager = new UserManager();
		userManager.login(user);
		userManager.signOut(user);

		StudentManager studentManager = new StudentManager();
		studentManager.register(student);
		studentManager.enrollCourse(student);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.createCourse(instructor);

	}
}
