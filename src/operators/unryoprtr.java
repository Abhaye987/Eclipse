package operators;

public class unryoprtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=4,b,c,d,e;
			boolean value=false;
			++a;
			System.out.println(a);
			a++;
			System.out.println(a);
			--a;
			a--;
			System.out.println("value is:"+(!value));
			System.out.println(a);
			
			int x=8;
			System.out.println("bitwise compliment:"+~x);
			
			int j=10,k=20;
			boolean result= j<=k;
			System.out.println("greater than:"+result);
			boolean result2=k==j;
			System.out.println("equal to:"+result);
			
			int m=5,n=10,o;
					o=m+=n;
					System.out.println(o);
					
					o=m*=n;
					System.out.println(o);
					
	}

}
