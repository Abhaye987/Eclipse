package basics;

public class instncevrbles {
	int num=10;
	
}
	public static void main(String args[]) {
		instncevrbles obj=new instncevrbles();
		System.out.println("number is:"+obj.num);
		
		obj.num=20;
		System.out.println("changed value:"obj.num);
	}
