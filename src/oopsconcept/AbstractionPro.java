package oopsconcept;
abstract class Vechile{
	public abstract void start();

public void fuel() {
System.out.println("petrol");
}
}
class Train extends Vechile{
	public void start() {
		System.out.println("Button start");
	}
}
class Car extends Vechile{
	public void start() {
		
	}
	
		// TODO Auto-generated method stub

	}


public class AbstractionPro{
	public static void main(String[] args) {
		Car c=new Car();
		c.fuel();
		c.start();
	}
}