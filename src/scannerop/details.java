package scannerop;
import java.util.Scanner;

public class details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String name,email;
    int age ;
    long phno;
    float mark;
    Scanner in =new Scanner(System.in);
     System.out.println("enter your name :");
     name=in.next();
     System.out.println("enter your age :");
     age=in.nextInt();
     System.out.println("enter your email :");
     email=in.next();
     System.out.println("enter your phno :");
     phno=in.nextLong();
     System.out.println("enter your mark :");
     mark=in.nextFloat();
     
     System.out.println();
     System.out.println("details :");
     System.out.println();
     System.out.println("Name :"+name);
     System.out.println("Age :"+age);
     System.out.println("Email :"+email);
     System.out.println("Phno :"+phno);
     System.out.println("Mark :"+mark);
	}
	}


