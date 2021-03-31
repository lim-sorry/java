import java.io.*;
import java.util.*;

public class Solution {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= t; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			char[] cArr = str.toCharArray();
			int cnt = Integer.parseInt(st.nextToken());
a:			while(cnt > 0) {
	b:			for(int i = 0; i < cArr.length-1; i++) {
					if(cArr[i] <= cArr[i+1]) {
						break b;
					}
					break a;
				}
				int[] changeLog = new int[cArr.length]; // [0,1,2,3,4,5]
				int maxi = cArr.length-1;
				int mini = cArr.length-1;
				for(int i = cArr.length-2; i >= 0; i--) {
					if(cArr[i] > cArr[maxi]) {
						maxi = i;
					} else if(cArr[i] < cArr[mini])
				}
	
	
//				332718
//				002222
//				000333
//				821883
//				600001
//				881823
//				650021
//				881832
//				650012
//				888132
//				654312
//				888321
//				654123			
			}
			
			
		}
	}

}
