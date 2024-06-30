package oopsconcept;
 class bbird {
int haslegs=4;
 }
 class duck extends bbird{
	 int haslegs=4;
	 public void display() {
		 System.out.println("super ="+super.haslegs);
		 System.out.println("legs ="+haslegs);
	 }
 }
 public class supercls{
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
duck d =new duck();
d.display();
	}

}
