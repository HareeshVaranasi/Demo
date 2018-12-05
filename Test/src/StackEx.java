import java.util.*;

public class StackEx {
	public static void main(String args[]) throws InterruptedException {
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
//		stack.pop();
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			long start = System.currentTimeMillis();

			System.out.println(itr.next());
			Thread.sleep(20000);
			System.out.println("Sleep time in ms = " + (System.currentTimeMillis() - start));
		}
	}
}