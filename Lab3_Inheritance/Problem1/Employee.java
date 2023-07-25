
public class Employee extends Person {
	private int office;
	private double salary;
	private myDate dateHired;
	
	//constructor
	public Employee() {
	}
	
	public Employee(String name, String address, String phone, String email,
	int office, double salary, myDate dateHired) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	//setters
	public void setOffice(int office) {
		this.office = office;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setDateHired() {
		dateHired = new myDate();
	}
	
	//getters
	public int getOffice() {
		return office;
	}
	
	public String getSalary() {
		return String.format("%.2f", salary);
	}
	
	public String getDateHired() {
		return dateHired.getMonth() + "/" + dateHired.getDay() + "/" 
				+ dateHired.getYear();
	}
	
	public String toString() {
		return super.toString() + "Employee" + "\nOffice: " + office + 
				 "\nSalary: RM" + getSalary() + "\nDate hired: " + getDateHired();
 	}
}
