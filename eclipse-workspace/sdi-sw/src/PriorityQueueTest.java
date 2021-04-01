import java.util.*;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Member> pq = new PriorityQueue<Member>();
		Member m1 = new Member("1", 10, "hong");
		Member m2 = new Member("3", 30, "kim");
		Member m3 = new Member("2", 20, "lee");
		pq.offer(m1);
		pq.offer(m2);
		pq.offer(m3);
		System.out.println(pq); // need to comparable
		
		/*
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(1);
		pq.offer(3);
		pq.offer(2);
		pq.offer(5);
		pq.offer(4);
		System.out.println(pq);
		System.out.println(pq.poll()+" -> "+pq);
		System.out.println(pq.poll()+" -> "+pq);
		System.out.println(pq.poll()+" -> "+pq);
		System.out.println(pq.poll()+" -> "+pq);
		System.out.println(pq.poll()+" -> "+pq);
		*/
	}

}
