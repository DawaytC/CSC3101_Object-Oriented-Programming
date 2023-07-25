
public class Faculty extends Employee {
	private String hours;
	private String rank;
	
	//constructors
	public Faculty() {
	}
	
	public Faculty(String name, String address, String phone, String email, int office,
			double salary, String hours, String rank, myDate dateHired) {
		super(name, address, phone, email, office, salary, dateHired);
		this.hours = hours;
		this.rank = rank;
	}
	
	//setters
	public void setHours(String hours) {
		this.hours = hours;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	//getters
	public String getHours() {
		return hours;
	}
	
	public String getRank() {
		return rank;
	}
	
	//toString
	public String toString() {
		return super.toString() + "\nOffice hours: " + hours +
				"\rank: " + rank;
	}
}
