
public class Person {
	private String name;
	private String address;
	private String phone;
	private String email;
	
	//constructor
	public Person() {
		this("Unknown", "Unknown","Unknown","Unknown");
	}

	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = phone;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	//toString
	public String toString() {
		return "--" + "\nName: " + name + "\nAddress: " + address + "\nPhone number: "
				+ phone + "\nEmail Address: " + email;
	}
}
