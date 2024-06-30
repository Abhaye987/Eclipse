package hwork;
import java.util.Scanner;
public class month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.January\t 2.February\t 3.March\t4.April\t 5.May\t 6.June\t7.july \t8.Augut\t 9.September\t 10.October\t11.November\t12.December");
		   Scanner scan=new Scanner(System.in);
		   int month;
		   System.out.println("enter the month");
		month=scan.nextInt(); 

		   switch (month) {
		   case 1:
		    System.out.println("January");
		    break;
		   
		   case 2:
		    System.out.println("February");
		    break;
		    
		   case 3:
		    System.out.println("March");
		    break;
		    
		   case 4:
		    System.out.println("April");
		    break;
		    
		   case 5:
		    System.out.println("May");
		    break;
		    
		   case 6:
		    System.out.println("June");
		    break;
		    
		   case 7:
		    System.out.println("July");
		    break;
		    
		   case 8:
		    System.out.println("August");
		    break;
		    
		   case 9:
		    System.out.println("september");
		    break;
		    
		   case 10:
		    System.out.println("October");
		    break;
		    
		   case 11:
		    System.out.println("November");
		    break;
		    
		   case 12:
		    System.out.println("December");
		    break;
		   
		    
		    default:
		     System.out.println("good day");
		 }
		 }
		
	}


