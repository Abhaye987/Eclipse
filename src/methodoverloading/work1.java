package methodoverloading;

public class work1 {
	public void add() {
		int a,b,c;
		a = 10; b = 20;
		c= a+b;
		System.out.println("sum is:"+c);
	}

	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b, int c) {
		System.out.println("sum ="+(a+b+c));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
