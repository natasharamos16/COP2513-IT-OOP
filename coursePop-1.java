//Test Program created to compare students in course based on cloning data from the Course class
//Created Natasha Ramos-Gomez
//COP2513 USF
//2/13/2019

public class coursePop {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		//declaring my course name and variable
		Course newClass1 = new Course("Java Programming");
		
		//Adding students to class 1
		newClass1.addStudent("Eddie Woodard");
		newClass1.addStudent("Tiana Hopkins");
		newClass1.addStudent("Ariel Ortiz");
		
		//Creating the clone of Class1
		Course newClass2 = newClass1.clone();
		
		//Adding students to class 2
		newClass2.addStudent("Tanner Rubio");
		newClass2.addStudent("Aubree Mccall");
		
		//Printing the information of Class 1
		System.out.println("Number of students in Class 1:" + newClass1.getNumberOfStudents());
		String[] firstStu = newClass1.getStudents();
		
		//Method includes how many students are in the courses and will compare both classes
		for (int n = 0; n < newClass1.getNumberOfStudents(); n++)
			System.out.println(firstStu[n]);
		System.out.println();
		
		System.out.println("Number of students in Class 2:" + newClass2.getNumberOfStudents());;
		String[] secStu = newClass2.getStudents();
		for (int a = 0; a < newClass2.getNumberOfStudents(); a++)
			System.out.println(secStu[a]);
		
		//Print method prints all the values from both courses
		System.out.println();
		
		//Print method compares the courses to see if they are equal to each other
		System.out.println("Is students Course 1 and Course 2 equal? " + "\n" + (newClass2.getStudents()==newClass1.getStudents()));
		
		//Created to display course name
		System.out.println("\n"+ "Course 1:" + newClass1.getCourseName()   + "\n" + "Course 2:" +  newClass2.getCourseName());
	}
}