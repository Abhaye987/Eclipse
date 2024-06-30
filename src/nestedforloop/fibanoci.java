package nestedforloop;

public class fibanoci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=1,n2=1,n3,i,c=10;    
		   System.out.print(n1+" "+n2);//printing 0 and 1    
		      
		   for(i=1;i<c;++i)//loop starts from 2 because 0 and 1 are already printed    
		   {    
		    n3=n1+n2;    
		    System.out.print(" "+n3);    
		    n1=n2;    
		    n2=n3;    
		   }    
		    
	}
}
