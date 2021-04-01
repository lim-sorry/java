import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.add(10);
		s.addElement(20);
		s.push(30);
		s.push(20);
		Collections.sort(s);
		System.out.println(s);
		System.out.println("size: "+s.size());
		System.out.println("peek: "+s.peek()+" -> "+s);
		System.out.println("remove: "+s.remove(0)+" -> "+s);
		System.out.println("pop: "+s.pop()+" -> "+s);
	}
}
