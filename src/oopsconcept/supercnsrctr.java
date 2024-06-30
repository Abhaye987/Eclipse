package oopsconcept;

class Bbirds1 {
	public Bbirds1() {
		System.out.println("bird constructor");
	}
	
	public Bbirds1(int haslegs) {
		System.out.println("legs="+haslegs);
	}
}
class Duckks1 extends Bbirds1{
	public Duckks1() {
		super (2);
		System.out.println("duck constructor");
	}
}
public class supercnsrctr{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duckks1 d=new Duckks1();
	}

}
 
