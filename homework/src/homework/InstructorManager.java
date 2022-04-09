package homework;

public class InstructorManager {
	
	public void createCourse(Instructor instructor) {
		System.out.println("The course has been created by " + instructor.getFirstName() + " " + instructor.getLastName());
	}
}
