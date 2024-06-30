package methodconstruction;
public class copyconstructor{
	int area;
}
public  copyconstucto(int l,int b) {
	area=l*b;
System.out.println("area is":+area);
}
public void display() {
	System.out.println("area is:"+area);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
copyconstructor ob=new copyconstructor(5,8);
ob.display();

	}

}
