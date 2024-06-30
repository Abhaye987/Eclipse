package controlstatement;
import java.util.Scanner;
public class collegedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option=1;
		String course="b";
		Scanner in =new Scanner(System.in);
		System.out.println("enter the option");
		System.out.println("enter the course");
		option=in.nextInt();
        System.out.println("1.UG ");
        System.out.println("a. BCA \n b.BCOM \n c.BSC");
        course=in.next();
        System.out.println("2.PG ");
        System.out.println("a. MCA \n b.MBA \n c.BBA");
        
        switch(option) {
        case 1:
        	System.out.println("1.UG");
        	switch(course) {
        	case "a":System.out.println("a.BCA");
        	break;
        	case "b":System.out.println("b.BCOM");
        	break;
        	case "c":System.out.println("b.BSC");
        	break;
        	default :System.out.println("invalid choice");
        	}
        	break;
        }
        switch(option) {
        case 2:
        	System.out.println("2.PG");
        	switch(course) {
        	case "a":System.out.println("a.MCA");
        	break;
        	case "b":System.out.println("b.MBA");
        	break;
        	case "c":System.out.println("c.BBA");
        	break;
        	default :System.out.println("invalid choice");
        	}
        	break;
        }
        System.out.println("invalid option");
	}

}
