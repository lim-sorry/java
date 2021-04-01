import java.util.*;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList();
		Deque<Integer> dq = new LinkedList();
		ArrayDeque<Integer> adq = new ArrayDeque<>(); // 배열
		PriorityQueue<Integer> pq = new PriorityQueue<>(); // 배열
		
		/*
		adq.offer(10);
		adq.offer(20);
		adq.offerFirst(30);
		System.out.println(adq);
		
		/*
		dq.offer(10);
		dq.offer(20);
		System.out.println(dq);
		dq.offerFirst(30);
		System.out.println(dq);
		dq.offerLast(40);
		System.out.println(dq);
		System.out.println(dq.pollLast());
		System.out.println(dq.pollFirst());
		
		/*
		q.offer(10);
		q.offer(20);
		q.offer(10);
		q.offer(20);
		System.out.println(q);
		System.out.println("peek: "+q.peek()+" -> "+q);
		System.out.println("poll: "+q.poll()+" -> "+q);
		*/
	}

}
