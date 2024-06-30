package hwork;
import java.util.Scanner;
public class work18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the number of elements in the array:");
		        int n = scanner.nextInt();

		        double[] numbers = new double[n];

		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) {
		            numbers[i] = scanner.nextDouble();
		        }
                double sum = 0;
		        for (double num : numbers) {
		            sum += num;
		        }
                double average = sum / n;
                System.out.println("Numbers greater than the average:");
		        for (double num : numbers) {
		            if (num > average) {
		                System.out.println(num);
		            }
		        }

		    }
}
