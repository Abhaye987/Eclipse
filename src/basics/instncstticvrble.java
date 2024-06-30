package basics;

public class instncstticvrble {
	String studname;
	int age;
	static String course="manual testing";
	public static void main(String args[]) {
		instncstticvrble stud1 =new instncstticvrble();
		System.out.println("student name="+(stud1.studname="anu"));
		System.out.println("student age="+(stud1.age=24));
		System.out.println("course="+course);
		System.out.println();
		
		instncstticvrble stud2 =new instncstticvrble();
		System.out.println("student name="+(stud2.studname="abu"));
		System.out.println("student age="+(stud2.age=25));
		System.out.println("course="+course);
		System.out.println();
		
		instncstticvrble stud3 =new instncstticvrble();
		System.out.println("student name="+(stud3.studname="arun"));
		System.out.println("student age="+(stud3.age=28));
		System.out.println("course="+(course="automation testing"));
		System.out.println();

		instncstticvrble stud4 =new instncstticvrble();
		System.out.println("student name="+(stud3.studname="abdu"));
		System.out.println("student age="+(stud3.age=29));
		System.out.println("course="+course);
		System.out.println();

		
	}

}
