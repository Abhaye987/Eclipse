package operators;

public class workoprtr {
	public static void main(String args[]) {
		int x=3,y=9;
		boolean a=x<y,b=x>y;
		boolean res=!(a||b);
		System.out.println("result is:"+res);
		boolean res1=!(a&&b);
		System.out.println("result1 is:"+res1);
		boolean res2=!(a||b)&&(a||b);
		System.out.println("result2 is:"+res2);
		boolean res3=!((a&&b)||(a&&b));
		System.out.println("result3 is:"+res3);
	}

}
