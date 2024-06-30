package controlstatement;
import java.util.Scanner;
public class hwwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mark,grade;
Scanner in =new Scanner(System.in);
System.out.println("enter the mark");
mark=in.nextInt();
if(mark>90) {
	System.out.println("grade A");
}
else if(mark>=70 && mark<=89) {
	System.out.println("grade B");
}
else if(mark>=50 && mark<=69) {
	System.out.println("grade C");
}
else if(mark<50){
	System.out.println("grade D");
}
	}

}
