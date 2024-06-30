package collectionpckg;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Stack <String> li =new Stack <String>();
			li.push("10");
			li.push("biju");
			li.push("oii");
			li.push("12");
			li.push("10");
			
			System.out.println("elements are:"+li);
			li.push("binu");
			li.push("manu");
			System.out.println("elements are:"+li);
			System.out.println("elements are:"+li.peek());
			li.pop();
			System.out.println("removed elements are:"+li);
			System.out.println("elements are:"+li.peek());
	}

}
