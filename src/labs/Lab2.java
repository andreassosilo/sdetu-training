package labs;

public class Lab2 {

	public static void main(String[] args) {
		Student student1 = new Student("Susan", "74223798");

		student1.enroll("Math151");
		student1.enroll("Elec312");
		student1.enroll("Mech234");
		student1.checkBalance();
		student1.payTuition(600);
		student1.checkBalance();
		
		student1.setPhone("+62 7668725");
		student1.setCity("Bandung");
		student1.setState("West Java");
		System.out.println(student1.toString());
		student1.showCourses();
		student1.checkBalance();
	}
}
	
class Student {
	// Properties of student
	private static int ID = 1000;
	private String name;
	private String ssn;
	private String email;
	private String userID; // Combination of Static ID + random 4 digit (1000-9000) + last 4 digit SSN
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance;
	private String phone;
	private String city;
	private String state;
	
	// Constructor
	public Student(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
		ID++;
		setEmail();		
		setUserID();
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "." + ID + "@university.com";
	}
	
	private String getEmail() {
		return email;
	}
	
	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int randnum = (int) (Math.random() * (max-min) + min);
		int length = ssn.length();
		userID = ID + " " + randnum + " " + ssn.substring(length-4, length);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + " " + course;
		System.out.println("Congrats " + name + "! You are enrolled in "+ course + " class!");
		balance = balance + costOfCourse;
	}
	
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println(name + " pays tuition fee: $" + amount);
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[UserID: " + userID + "]\n[E-mail: " + getEmail() + "]\n[Telephone: " + getPhone() + "]\n[City: " + getCity()+ "]\n[State: " + getState() + "]";
		
	}
	
	public void showCourses() {
		System.out.println(name + "'s courses\n" + courses);
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}