package array;
import java.util.Scanner;
public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner (System.in);
        System.out.println("enter the array size");
        int size=in.nextInt();
        int mark[]=new int[size];
        System.out.println("enter the values :");
        for(int i=0;i<mark.length;i++) {
        	mark[i]=in.nextInt();
        }
        for(int i=0;i<mark.length;i++) {
        	System.out.println("mark["+i+"]"+"="+mark[i]);
        }
	}

}
