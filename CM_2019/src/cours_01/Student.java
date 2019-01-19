package cours_01;

public class Student {
	private String lastName;
	private String firstName;
	private int number;
	
	public Student(String lastName, String firstName, int number) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.number = number;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Student [lastName=" + lastName + ", firstName=" + firstName + ", number=" + number + "]";
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Student() {
		
		// TODO Auto-generated constructor stub
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		student1.lastName = "Castiaux";
		student1.firstName = "Julien";
		student1.number = 42;
		
		Student student2 = new Student();
		student2.lastName = "Dupont";
		student2.firstName = "Jeremy";
		student2.number = 3;
	}

}
