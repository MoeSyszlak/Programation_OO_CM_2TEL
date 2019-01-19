package cours_01;

public class Date {
	private int day;
	private int month;
	private int year;
	
	

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}



	public Date() {
		
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date myBirthday = new Date();
		myBirthday.day = 25;
		myBirthday.month = 03;
		myBirthday.year = 1990;

	}

}
