package methodoverriding;

 class work1 {
public void add() {
	int a =20,b =40;
	System.out.println(a+b);
}
 }
 public class methodoverridingpoly extends work1{
	 public void add() {
		 int a =22, b=30;
		 System.out.println(b-a);
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodoverridingpoly ob =new methodoverridingpoly();
work1 obj =new methodoverridingpoly(); //data binding

	}

}
