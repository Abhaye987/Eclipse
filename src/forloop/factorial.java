package forloop;
import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = in.nextInt();
        in.close();
        
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    private static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            long factorial = 1;
            for (int i = 2; i <= number; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
