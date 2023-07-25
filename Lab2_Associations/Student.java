
public class Student {
	private String name;
	private Course[] courseList = new Course[100];
	private int numberOfCourses;

	//default constructor
	public Student() {
	}
	
	//constructor
	public Student(String name) {
		this.name = name;
	}
	
	public int getNumberOfCourses() {
	    return numberOfCourses;
	  }  
	
	public void addCourse(Course course) {
		    // Check whether course has already been added
			  for (int i = 0; i < numberOfCourses; i++) {
				  if (courseList[i].getName().equals(course.getName())) {
					  return;
		      }
		    }
		    
		    // Add course to student
		    courseList[numberOfCourses] = course;
		    numberOfCourses++;
		    
		    // Add student to course
		    course.addStudent(this);
		    
		    return;
		  }
		  
	
	public String getName() {
		return name;
	}
	
	public Course[] getCourses() {
		return courseList;
	}
	
}


