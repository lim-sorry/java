import java.util.*;

public class StringTest2 {

	public static void main(String[] args) throws Exception{
//		String str = "123 456\t789\nabc";
		String str = "123.456.789";
		StringTokenizer st = new StringTokenizer(str, ".");
		ArrayList<String> list = new ArrayList();
		while(st.hasMoreTokens()) {
			list.add(st.nextToken());
		}
		System.out.println(list);
		
		/*
		System.out.println("start");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 1000000; i++) {
			sb.append('a');
		}
		System.out.println("end");
		
		/*
		StringBuffer sb1 = new StringBuffer(); // 동기화 보장 Thread
		StringBuilder sb2 = new StringBuilder(); // 비동기
		sb2.append(100);
		sb2.append('a');
		sb2.append(10.5);
		String str = sb2.toString();
		System.out.println(str);
//		System.out.println(str.toString());
		sb2.append("abc");
		System.out.println(sb2);
		sb2.setLength(0);
		sb2.append("abc");
		System.out.println(sb2);
		sb2.insert(0, "123");
		System.out.println(sb2);
		System.out.println(sb2.reverse());
		
		/*
		String str = ""; // null;
		for(int i = 0; i < 1000000; i++) {
			str = str + 'a';
		}
		*/
	}

}
