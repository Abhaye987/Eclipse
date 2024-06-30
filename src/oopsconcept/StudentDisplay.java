package oopsconcept;

public class StudentDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentsDetails_Pro stud=new StudentsDetails_Pro();
		stud.setName("rocky");
		System.out.println("Student Name:" +stud.getName());
		
		stud.setEmail("rocky123gmail.com");
		System.out.println("Student Email Id :"+stud.getEmail());
	}

}
