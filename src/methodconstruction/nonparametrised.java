package methodconstruction;

public class nonparametrised {

	int length,breadth, area;
	
	public nonparametrised() {
		length=5;
		breadth=8;
		area=length*breadth;
		System.out.println("area is :"+area);
	}
public static void main(String args[]) {
	nonparametrised ob=new nonparametrised();
}
}
