package controlstatement;

public class withfunction {
public static void div() {
	int a=10,b=0,c;
	c=a/b;
	System.out.println("div :"+c);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	div();
}
catch(Exception e) {
	System.out.println(e);
}
	}

}
