package operators;

public class logicaloprtr {
public static void main(String args[]) {
	int num1=2,num2=5;
	boolean x1=num1>num2&&num2<num1;
	System.out.println("value :"+(num1>num2));
	System.out.println("value :"+(num2>num1));
	System.out.println("x:"+x1);
	
	boolean y=num1<num2 ||num1>=num2;
			System.out.println("y:"+y);	
	boolean z=!(num2!=num1);
	System.out.println("z:"+z);
}
}
