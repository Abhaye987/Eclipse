package oopsconcept;

class bbird {
	public void haslegs()
	{
		System.out.println("bird has two legs");
	}
public void haslegs(int no_legs) {
	System.out.println("no of legs ="+no_legs);
}
public void sound() {
	System.out.println("tweet....tweet");
}
}
public class Crowbird extends bbird{
	public void sound() {
		System.out.println("kh...kh");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Crowbird b=new Crowbird();
b.haslegs();
b.sound();
	}

}
