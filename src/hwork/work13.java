package hwork;
import java.util.Scanner;
public class work13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the first number:");
		        double number1 = scanner.nextDouble();

		        System.out.println("Enter the second number:");
		        double number2 = scanner.nextDouble();

		        if (number1 == number2) {
		            System.out.println("The numbers are equal.");
		        } else if (number1 > number2) {
		            System.out.println("The first number is greater than the second number.");
		        } else {
		            System.out.println("The second number is greater than the first number.");
		        }

		        }
			}
