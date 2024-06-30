package hwork;
import java.util.Scanner;

public class work8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        String result = (number % 2 == 0) ? "even" : "odd";
		        System.out.println(number + " is " + result + " ");
		    

	}

}
