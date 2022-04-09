package homework;

public class Student extends User {

	private int courseCompletionPercentange;
	private String instructorName;

	public Student(int id, String firstName, String lastName, String eMail, String password,
			int courseCompletionPercentange, String instructorName) {
		super(id, firstName, lastName, eMail, password);

	}

	public int getCourseCompletionPercentange() {
		return courseCompletionPercentange;
	}

	public void setCourseCompletionPercentange(int courseCompletionPercentange) {
		this.courseCompletionPercentange = courseCompletionPercentange;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

}
