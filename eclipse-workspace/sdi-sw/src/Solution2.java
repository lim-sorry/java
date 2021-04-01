import java.io.*;
import java.util.*;

public class Solution2 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int tc = 1; tc < 11; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			Stack<Character> s = new Stack<>();
			for(char c: st.nextToken().toCharArray()) {
				if(s.isEmpty()) {
					s.push(c);
				} else if(s.peek().equals(c)) {
					s.pop();
				} else {
					s.push(c);
				}
			}
			String ans = "";
			for(Character c: s) {
				ans += c;
			}
			System.out.println("#"+tc+" "+ans);
		}
	}
	
}
