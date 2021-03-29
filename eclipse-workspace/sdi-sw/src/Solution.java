import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String[] num = st.nextToken().split("-");
		int p = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		if(num.length >= m) {
			String[] code = num[m - 1].split("");
			if(code.length > 4) {
				System.out.println("INPUT ERROR!");
			} else {
				for(int i = 0; i < 4; i++) {
					if(i < 4 - code.length) {
						System.out.print(0);
					} else {
						System.out.print((Integer.parseInt(code[code.length + i - 4]) + p) % 10);
					}
				}
			}
		} else {
			System.out.println("INPUT ERROR!");
		}
	}

}
