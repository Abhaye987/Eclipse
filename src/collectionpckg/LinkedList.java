package collectionpckg;
import java.util.*;
public class LinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List li=new ArrayList();
			List lil=new ArrayList();
			
			li.add(10);
			li.add("biju");
			li.add("oii");
			li.add(12);
			li.add(10);
			
			System.out.println("elements are:"+li);
			li.add("binu");
			System.out.println("data's are:");
			for(String data:li) {
				System.out.println(data);
			}
			for(int i=0;i<li.size();i++) {
				System.out.println(li.get(i));
			
			}
			li.remove(2);
			System.out.println("new list:"+li);
			
			lil.addAll(li);
			System.out.println("new list:"+lil);
			
			Iterator itr=li.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
}
}}