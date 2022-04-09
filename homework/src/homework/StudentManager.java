package homework;

public class StudentManager {
	
	public void register(Student student) {
		System.out.println("Welcome, " + student.getFirstName() + " " + student.getLastName() + " your account has been created.");
	}

	public void enrollCourse(Student student) {
		System.out.println(student.getFirstName() + " is registered to the course.");
	}
}
