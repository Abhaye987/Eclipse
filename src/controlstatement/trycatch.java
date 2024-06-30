package controlstatement;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hai");
		int a[]= {1,2,3,4};
		try {
			System.out.println(a[3]);
		}
		catch (Exception e){
		System.out.println(e);
	}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
}
}