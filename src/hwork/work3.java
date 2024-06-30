package hwork;
import java.util.Scanner;
public class work3 {

      public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter the first value: ");
		        int value1 = scanner.nextInt();
		        System.out.print("Enter the second value: ");
		        int value2 = scanner.nextInt();
		        
		        System.out.println("Values before swapping:");
		        System.out.println("First value: " + value1);
		        System.out.println("Second value: " + value2);
		        
		        int temp = value1;
		        value1 = value2;
		        value2 = temp;
		        
		        System.out.println("\nValues after swapping:");
		        System.out.println("First value: " + value1);
		        System.out.println("Second value: " + value2);
		        }
}
