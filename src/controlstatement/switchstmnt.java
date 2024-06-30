package controlstatement;
import java.util.Scanner;
public class switchstmnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.chrome \t 2. edge \t 3. safari");
		Scanner in=new Scanner (System.in);
		int browser;
		System.out.println("enter your option");
		browser=in.nextInt();
		 
		switch(browser) {
		
		case 1 :
		System.out.println("the browser is chrome");
		break;
		
		case 2 :
		System.out.println("the browser is edge");
		break;
		
		case 3:
		System.out.println("the browser is edge");
		break;
		
		default :
		System.out.println("the browser is not supported");
		}
	}
}	
		
	


