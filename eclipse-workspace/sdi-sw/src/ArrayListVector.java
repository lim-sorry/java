import java.util.*;

public class ArrayListVector {

	public static void main(String[] args) {
		Member[] mArr = new Member[3];
		ArrayList<Member> list = new ArrayList<>();
		ArrayList<Integer> iList = new ArrayList<>();
		Member m1 = new Member("1", 20, "hong");
		Member m2 = new Member("3", 30, "kim");
		Member m3 = new Member("2", 10, "lee");
		list.add(m1);
		list.add(m2);
		list.add(m3);
		System.out.println(list); 
		Collections.sort(list, (a,b) -> Integer.compare(Integer.parseInt(a.id), Integer.parseInt(b.id)));
		System.out.println(list);

		/*
		int i1 = 100;
		int i2 = 100;
		iList.add(i1);
		System.out.println(iList.contains(i2));
		System.out.println(list.contains(m2));
		System.out.println(list.contains(m3));
		
		/*
		Vector<Integer> list = new Vector<>(5);
		System.out.println(list.capacity());
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(3);
		System.out.println(list);
		System.out.println(list.capacity()+" : "+list.size());
		list.clear();
		System.out.println(list.capacity()+" : "+list.size());
		
		/*
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(1,100);
		list.set(0, 200);
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		for(int t: list) {
			System.out.print(t+" ");
		}
		System.out.println();
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			int inum = it.next();
			System.out.print(inum+" ");
		}
		System.out.println();
		
		/*
		System.out.println("정렬전: "+list);
		Collections.sort(list);
		int idx = Collections.binarySearch(list, 3);
		System.out.println("idx: "+idx);
		System.out.println("정렬후: "+list);
		
		/*
		list.add(10);
		list.add(0,30);
		if(!list.contains(20)) {
			list.add(20);
		}
		System.out.println(list);
		System.out.println("get: "+list.get(0)+", size: "+list.size());
		System.out.println("remove: "+list.remove(0)+", size: "+list.size());
		
		/*
		list.add(100);
		int iNum;
		iNum = list.get(0); // .intValue()
		
		/*
		ArrayList list = new ArrayList(); // vector
		list.add(100);
		list.add("abc");
		
		Integer iNum = (Integer)list.get(0);
		System.out.println(iNum);
		*/
	}
}
