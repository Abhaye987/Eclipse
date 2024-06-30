package controlstatement;
import java.util.Scanner;
public class usingscaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.println("enter a number");
		try {
			int num=in.nextInt();
			System.out.println("number is:"+num);
		}
		catch(Exception e) {
			System.out.println("please enter valid number");
		}
	}

}
