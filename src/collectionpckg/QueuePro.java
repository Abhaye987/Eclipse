package collectionpckg;
import java.util.Iterator;
import java.util.PriorityQueue;
public class QueuePro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> li=new PriorityQueue<String>();
		li.add("hello");
		li.add("java");
		li.add("good");
		li.add("testing");
		
		Iterator<String>iter=li.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		li.remove();
		System.out.println("remove first element:"+li);
	}

}
