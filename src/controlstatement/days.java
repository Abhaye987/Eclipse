package controlstatement;

import java.util.Scanner;

public class days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 Sunday \t 2. monday \t 3. tuesday \t 4. wednesday \t 5. thursday \t 6. friday \t 7. saturday");
		Scanner in=new Scanner (System.in);
		int day;
		System.out.println("enter your option");
		day=in.nextInt();
		
        switch(day) {
		
		case 1 :
		System.out.println("the day is sunday");
		break;
		
		case 2 :
		System.out.println("the day is monday");
		break;
		
		case 3 :
		System.out.println("the day is tuesday");
		break;
		
		case 4 :
		System.out.println("the day is wednesday");
		break;
		
		case 5 :
		System.out.println("the day is thursday");
		break;
		
		case 6 :
		System.out.println("the day is friday");
		break;
		
		case 7 :
		System.out.println("the day is saturday");
		break;
		
		default :
		System.out.println("it is your day");
		
		
		}

	}
}
