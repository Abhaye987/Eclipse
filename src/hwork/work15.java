package hwork;
import java.util.Scanner;

public class work15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter a number:");
		        int number = scanner.nextInt();

		        int result = (number % 2 == 0) ? 1 : 0;

		        System.out.println(result);

		        scanner.close();
		    }
		}

