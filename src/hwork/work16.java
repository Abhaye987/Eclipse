package hwork;
import java.util.Scanner;
public class work16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the first number:");
		        double num1 = scanner.nextDouble();

		        System.out.println("Enter the second number:");
		        double num2 = scanner.nextDouble();

		        System.out.println("Enter the third number:");
		        double num3 = scanner.nextDouble();
                double greatestNumber = num1;
                if (num2 > greatestNumber) {
		            greatestNumber = num2;
		        }
                if (num3 > greatestNumber) {
		            greatestNumber = num3;
		        }
                System.out.println("The greatest number is: " + greatestNumber);
                }
		}
