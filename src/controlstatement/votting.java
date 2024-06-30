package controlstatement;

public class votting {
public static void check (int age) throws ArithmeticException{
	if(age<18) {
		throw new ArithmeticException("age is not valid");
	}
	else {
		System.out.println("welcome .......");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	check(10);
}
catch(Exception e) {
	System.out.println(e);
}
	}

}
