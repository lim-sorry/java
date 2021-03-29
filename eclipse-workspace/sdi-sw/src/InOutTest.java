import java.io.*;
import java.util.*;

class Data{
	int x;
	int y;
	int z;
}

public class InOutTest {
	static void print() {
		System.out.println("hello java!");
	}
	public static void main(String[] args) throws Exception{
		System.setIn(new FileInputStream("input.txt"));
		long start = System.currentTimeMillis();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int iNum = Integer.parseInt(st.nextToken());
		String temp = st.nextToken();
		double dNum = Double.parseDouble(st.nextToken());

		System.out.println("iNum : " + iNum);
		System.out.println("temp : " + temp);
		System.out.println("dNum : " + dNum);
		
		long end = System.currentTimeMillis();
		System.out.println("time : " + (end - start));
		
		/*
		String str = br.readLine();
		String[] buf = str.split(" ");
		int iNum = Integer.parseInt(buf[0]);
		String temp = buf[1];
		double dNum = Double.parseDouble(buf[2]);

		System.out.println("iNum : " + iNum);
		System.out.println("temp : " + temp);
		System.out.println("dNum : " + dNum);
		br.close();
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		String str = sc.next();
		double dNum = sc.nextDouble();
		
		System.out.println("iNum : " + iNum);
		System.out.println("str : " + str);
		System.out.println("dNum : " + dNum);
		sc.close();
		*/
	}

}
