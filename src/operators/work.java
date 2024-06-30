package operators;

public class work {
	public static void main(String args[]) {
		int a=8,b=4,num=6,c=3,x=3,y=6,z=9,mod,div,p,q,r;
		mod=a%b;
		div=num/c;
		p=4/2+8*4-(5+2)%3;
		q=x+z/x+(z%y)*(z-x);
		r=z/x+y*x-(y+x)%z;
		System.out.println("mod="+mod);
		System.out.println("div="+div);
		System.out.println("p="+p);
		System.out.println("q="+q);
		System.out.println("r="+r);
	}

}
