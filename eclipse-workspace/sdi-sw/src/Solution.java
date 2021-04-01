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
			
			int[] changeLog = new int[cArr.length]; // [0,1,2,3,4,5]
			for(int i = 0; i < cArr.length; i++) {
				changeLog[i] = i;
			}
			while(cnt > 0) {
				int maxi = cArr.length-1;
				int mini = 0;
				boolean flag = true;
				
				for(int i = 0; i < cArr.length-1; i++) {
					System.out.println(cnt + " " + cArr[i] +" "+ cArr[i+1] + (cArr[i] < cArr[i+1]));
					if(cArr[i] < cArr[i+1]) {
						mini = i;
						flag = false;
						break;
					}
				}
				if(flag) {
					break;
				}
				
				int tmin = mini;
				for(int i = cArr.length-2; i >= 0; i--) {
					if(i >= tmin && cArr[i] > cArr[maxi]) {
						maxi = i;
					} else if(cArr[i] < cArr[maxi]) {
						mini = i;
					}
				}
				
				System.out.println(maxi + " " + mini);
				
				char tempChar;
				tempChar = cArr[mini];
				cArr[mini] = cArr[maxi];
				cArr[maxi] = tempChar;
				int tempInt;
				tempInt = changeLog[mini];
				changeLog[mini] = changeLog[maxi];
				changeLog[maxi] = tempInt;			
				
				cnt--;
			}
			int c = 1;
			for(int i = 1; i < cArr.length; i++) {
				if(cArr[i-1] == cArr[i]) {
					c++;
				} else if(cArr[i-1] < cArr[i]) {
					break;
				} else {
					
				}
			}
			System.out.println(Arrays.toString(cArr));
		}
	}

}
