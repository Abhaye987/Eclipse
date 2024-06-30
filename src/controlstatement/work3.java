package controlstatement;
import java.util.Scanner;
public class work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age,weight;
Scanner in =new Scanner(System.in);

System.out.println("enter the age");
age=in.nextInt();
System.out.println("enter the weight");
weight=in.nextInt();
if(age>=18) {
	if(weight>=50) {
		System.out.println("eligible to donate blood");
	}
}
	else {
		System.out.println("not eligible");
	}

	}

}
