package collectionpckg;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> li=new ArrayDeque<String>();
		li.add("hello");
		li.add("java");
		li.add("good");
		li.add("testing");
		
		System.out.println(li);
		
		li.addFirst("abc");
		System.out.println(li);
		
		li.addLast("welcome");
		System.out.println(li);
		li.poll();
		System.out.println("remove first element :"+li);
		li.pollFirst();
		System.out.println(li);
		li.pollLast();
		System.out.println(li);
		System.out.println("print first element:"+li.peekFirst());
		System.out.println("print last element:"+li.peekLast());
	}
	}

}
