
public class Course {
	  private String name;
	  private Student[] classList = new Student[100];
	  private int numberOfStudents;
	    
	  public Course(String name) {
	    this.name = name;
	  }

	  public int getNumberOfStudents() {
	    return numberOfStudents;
	  }  
	  
	  public void addStudent(Student student) {
			// Check whether student has already been added
			for (int i = 0; i < numberOfStudents; i++) {
				if (classList[i].getName().equals(student.getName())) {
					return;
				}
			}  
			// Add student to course
			classList[numberOfStudents] = student;
			numberOfStudents++;
			
			// Add course to student
			student.addCourse(this);	
			
	  }

    public Student[] getStudents() {
    	return classList;
    }
    
	public String getName() {
		return name;
	}
}
