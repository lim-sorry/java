import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int tc = Integer.parseInt(st.nextToken());
		for(int t = 1; t < tc + 1; t++) {
			
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			Integer[] strs = new Integer[str.length()];
			for(int i = 0; i < strs.length; i++) {
				strs[i] = i;
			}
			
			Arrays.sort(strs, (a, b) -> str.substring(a).compareTo(str.substring(b)));
			
			int lcp[] = new int[strs.length];
			for(int i = 0; i < lcp.length - 1; i++) {
				for(int j = 0; j < strs.length - Math.max(strs[i], strs[i + 1]); j++) {
					if(str.substring(strs[i], strs[i] + j + 1).equals(str.substring(strs[i + 1], strs[i + 1] + j + 1))) {
						lcp[i + 1] += 1;
					}else {
						break;
					}
				}
			}
			int cnt = 0;
			String ans = "none";
			for(int i = 0; i < strs.length; i++) {
				cnt += strs.length - strs[i] - lcp[i];
				if(cnt >= k) {
					ans = str.substring(strs[i], k - cnt + strs.length);
					break;
				}
			}
			System.out.printf("#%d %s\n", t, ans);
		}
	}

}
