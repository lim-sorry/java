import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(20);
		list.add(0,30);
		list.add(40);
		System.out.println(list);
		System.out.println(list.get(2));
	}

}
