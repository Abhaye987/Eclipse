package controlstatement;

public class finly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hai");
		int a[]= {1,2,3,4};
		try {
			System.out.println(a[4]);
		}
		catch (ArithmeticException e){
		System.out.println(e);
	}
		catch(NullPointerException e1) {
			System.out.println("the array is null");
		}
		catch(Exception e3) {
			System.out.println(e3);
		}
		finally {
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
		}
	}

}
