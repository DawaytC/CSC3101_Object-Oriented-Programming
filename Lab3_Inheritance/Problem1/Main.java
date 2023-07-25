
public class Main {

	public static void main(String[] args) {
		//Objects
		
		//person
		Person p = new Person("Dwight", "Seri Kembangan", "1234", "citaddwight@gmail.com");
			System.out.println(p.toString());
				
		//student
		Student s = new Student("Zac", "Selangor", "1234", "zac@gmail.com", Student.freshman);
			System.out.println(s.toString());
				
		
		//faculty
		Faculty f = new Faculty("Denden", "Qatar", "1234", "syakir@gmail.com", 9, 2000, "two", "Professor", new myDate(2006, 12, 12));
		System.out.println(f.toString());
			
		//employee
		Employee e = new Employee("Dwight", "Qatar", "1234", "syakir@gmail.com", 9, 2000, new myDate(2003, 12, 12));
			System.out.println(e.toString());
			
		//staff
		Staff st = new Staff("Izzul", "Kuala Lumpur", "1234", "izzul@gmail.com", 2, 2500, "Doctor", new myDate(2004, 12, 12));
			System.out.println(st.toString());
	}
				
}
