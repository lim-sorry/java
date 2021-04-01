import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		TreeSet<Member> ts = new TreeSet<>();
		Member m1 = new Member("1", 10, "hong");
		Member m2 = new Member("1", 10, "hong");
		ts.add(m1);
		System.out.println(ts.contains(m2)); // 정렬기준이 0(같다)이면 동일 객체
		ts.add(m2);
		System.out.println(ts);
		
		
		/*
		List<Member> list = new ArrayList<>();
		HashSet<Member> hs = new HashSet<>();
		Member m1 = new Member("1", 10, "hong");
		Member m2 = new Member("1", 10, "hong");
		hs.add(m1);
		list.add(m1);
		System.out.println(hs.contains(m2)); // 해쉬코드가 같으면 동일 객체
		System.out.println(list.contains(m2));
		
		/*
		HashSet<Integer> hs = new HashSet<>();
		int i1 = 100;
		int i2 = 100;
		hs.add(i1);
		System.out.println(hs.contains(i2));
		
		/*
//		Set<Integer> set;
		HashSet<String> set = new HashSet<>();
		set.add("c");
		set.add("b");
		set.add("a");
		set.add("d");
		set.add("ca");
		System.out.println("정렬전: "+set);
		TreeSet<String> ts = new TreeSet<>();
		ts.addAll(set);
		System.out.println("정렬후: "+ts);
		
		/*
		set.remove("a");
		for(String str: set) {
			System.out.println(str);	
		}
		*/
	}

}
