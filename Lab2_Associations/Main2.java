
public class Main2 {
	public static void main(String[] args) {
	    Course structures = new Course ("Data Structures");
	    Course systems = new Course("Database Systems");
	    
	    Student peter = new Student("Peter Jones");
	    Student kim = new Student("Kim Smith");

	    structures.addStudent(peter);
	    structures.addStudent(kim);
	    systems.addStudent(kim);

	    //objective a
	    System.out.println("Courses Taken by " + kim.getName() + ":");
	    Course[] courses = kim.getCourses();
	    for (int i = 0 ; i < kim.getNumberOfCourses(); i++)
	    System.out.print(courses[i].getName() + ", ");
	    
	    System.out.println("\n");
	    
	    System.out.println("Courses Taken by " + peter.getName() + ":");
	    courses = peter.getCourses();
	    for (int i = 0 ; i < peter.getNumberOfCourses(); i++)
	    System.out.print(courses[i].getName() + ", ");
	    
	    System.out.println("\n");
	   
	    //objective b
	    System.out.println("Number of students in Data Structures: " + structures.getNumberOfStudents());
	    Student[] students = structures.getStudents();
	    for (int i = 0; i < structures.getNumberOfStudents(); i++)
	      System.out.print(students[i].getName() + ", ");
	    
	    System.out.println("\n");
	    
	    System.out.print("Number of students in Database Systems: " + systems.getNumberOfStudents());
	    
	    students = systems.getStudents();
	    for (int i = 0; i < systems.getNumberOfStudents(); i++)
	      System.out.print("\n" + students[i].getName() + ", ");
	  }

}
