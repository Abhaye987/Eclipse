package whileloop;

public class ijk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int i=1,j=20,k=31;
			while(i<j) {
				k+=i*j;
				i*=2;
				j--;
			}
			System.out.println("i="+i+" \n j="+j+"\nk="+k);
	}
    
}
