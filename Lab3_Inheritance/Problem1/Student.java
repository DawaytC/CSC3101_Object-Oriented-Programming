
public class Student extends Person {
	final static int freshman = 1;
	final static int sophomore = 2;
	final static int junior = 3;
	final static int senior = 4;
	private int status;
	
	//constructor
	public Student() {
	}
	
	public Student(String name, String address, String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}
	
	//setters
	public void setStatus(int status) {
		this.status = status;
	}
	
	//getters
	public String getStatus() {
		switch (status) {
			case 1 : return "Freshman";
			case 2 : return "Sophomore";
			case 3 : return "Junior";
			case 4 : return "Senior";
			default : return "error";
		}
	}
	
	//toString
	public String toString() {
		return super.toString() + "\nStatus: " + getStatus();
	}
}
