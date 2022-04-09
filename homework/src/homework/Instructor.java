package homework;

public class Instructor extends User {

	String instructorNumber;

	public Instructor(int id, String firstName, String lastName, String eMail, String password,
			String instructorNumber) {
		super(id, firstName, lastName, eMail, password);
		this.instructorNumber = instructorNumber;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

}
