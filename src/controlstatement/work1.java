package controlstatement;
import java.util.Scanner;
public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int num;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the num");
        num=in.nextInt();
        if(num<=100) {
        	System.out.println("num less than 100");
        	if(num>=50) {
        		System.out.println("num greater than 50");
        	}
        	else {
        		System.out.println("num less than 50");
        	}
        }
        else {
        	System.out.println("num greater than 100");
        }
	}
}
