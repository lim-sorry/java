import java.util.*;

public class HashMapTest {

	public static void main(String[] args) throws Exception {
		ArrayList<Object> list = new ArrayList<>();
		ArrayList<Object> temp = new ArrayList<>();
		temp.add("a");
		temp.add("b");
		temp.add("c");
		
		list.addAll(temp);
		System.out.println(list+" : "+list.size());
		
		/*
		Map<String, Integer> map = new HashMap<>();
		map.put("ab", 100);
		map.put("a", 200);
		map.put("cc", 300);
		System.out.println("정렬전: "+map);
		TreeMap<String, Integer> tm = new TreeMap<>();
		tm.putAll(map);
		System.out.println("정렬후: "+tm);
		
		/*
		Map<String, Member> map = new HashMap<>();
		Member m1 = new Member("1",10,"hong");
		Member m2 = new Member("2",30,"kim");
		Member m3 = new Member("3",20,"lee");
		Member m4 = new Member("1",10,"park");
		map.put(m1.id, m1);
		map.put(m2.id, m2);
		map.put(m3.id, m3);		
		System.out.println(map);
		map.put(m4.id, m4);
		System.out.println(map);
		Member t = map.get("1");
		System.out.println(t.id+" : "+map.size());
		t = map.remove("1");
		System.out.println(t.id+" : "+map.size());
		*/
	}

}
