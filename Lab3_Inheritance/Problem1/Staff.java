
public class Staff extends Employee {
	private String title;
	
	//constructor
	public Staff() {
	}
	
	public Staff(String name, String address, String phone, String email, 
			int office, double salary, String title, myDate dateHired) {
		super(name, address, phone, email, office, salary, dateHired);
		this.title = title;
	}
	
	//setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	//getters
	public String getTitle() {
		return title;
	}
	
	//toString
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
}
