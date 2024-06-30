package hwork;
import java.util.Scanner;
public class work9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
                Scanner scanner = new Scanner(System.in);
		     
		        System.out.print("Enter the first integer: ");
		        int num1 = scanner.nextInt();
		       
		        System.out.print("Enter the second integer: ");
		        int num2 = scanner.nextInt();
		    
		        System.out.print("Enter the third integer: ");
		        int num3 = scanner.nextInt();
		       
		        int sum = num1 + num2;
		        
		        boolean result = (sum == num3);
		        
		        System.out.println("The sum of " + num1 + " and " + num2 + " is equal to " + num3 + ": " + result);
		    }
		
}
