//Class modified to include clone method
//Modified by Natasha Ramos-Gomez
//COP2513 USF
//2/13/2019


public class Course implements Cloneable {
  private String courseName;
  private String[] students = new String[5];
  private int numberOfStudents;
    
  public Course(String courseName) {
    this.courseName = courseName;
  }
  
  public void addStudent(String student) {
    students[numberOfStudents] = student;
    numberOfStudents++;
  }
  
  public String[] getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }  

  public String getCourseName() {
    return courseName;
  }  
  
  public void dropStudent(String student) {
    // Left as an exercise in Exercise 10.9
  }
  //Declaring the variables
  Course courseDup;
  
  @Override
  //Method is used to create the clone and perform the shallow and deep copy of the course class
  public Course clone() throws CloneNotSupportedException{
	  //Shallow copy
	  courseDup = (Course)super.clone();
	  
	  //Deep Copy
	  courseDup.students = students.clone();
	  
	  return courseDup;
	  }
}