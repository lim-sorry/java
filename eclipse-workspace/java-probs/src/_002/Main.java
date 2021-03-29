package _002;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		Integer[] list = new Integer[N];
		int idx = 0;
		int[][] lines = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			
			lines[i][0] = scan.nextInt();
			lines[i][1] = scan.nextInt();
		}
		
		Arrays.sort(lines, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] a, int[] b) {
				
				return a[0] - b[0];
			}
		});
		
		Integer[] trace = new Integer[N];
		list[0] = lines[0][1];
		trace[0] = 0;
		
		for(int i = 1; i < N; i++) {
			
			if(list[idx] < lines[i][1]) {
				
				idx++;
				list[idx] = lines[i][1];
				trace[i] = idx;
			} else {
				
				int lb = 0;
				int ub = idx;
				int p = lb + (ub - lb) / 2;
				
				if(idx < 2) {
					
					if(list[0] > lines[i][1]) {
						
						list[0] = lines[i][1];
						trace[i] = 0;
					} else {
						
						list[1] = lines[i][1];
						trace[i] = 1;
					}
				} else {
					
					while(p != lb) {
						
						if(list[p] < lines[i][1]) {
							
							lb = p;
						} else {
							
							ub = p;
						}
						p = lb + (ub - lb) / 2;
					}
					list[ub] = lines[i][1];
					trace[i] = ub;
				}
			}
		}
		Integer[] answer = new Integer[N - idx - 1];
		int i = N - 1;
		int j = N - idx - 2;

		while(i > -1) {
			
			if(trace[i] == idx) idx--;
			else {
				answer[j] = lines[i][0];
				j--;
			}
			i--;
		}
		
		System.out.println(answer.length);
		System.out.println(Arrays.toString(trace));
		for(int k = 0; k < answer.length; k++) {
			
			System.out.println(answer[k]);
		}
	}
}

/*

8
1 1
2 7
3 8
4 4
5 5
6 6 
7 2
8 3

8 
1 8 
3 9 
2 2 
4 1 
6 4 
10 10 
9 7 
7 6

10
461172 179604
450010 52741
433823 483423
281069 492282
494933 325829
370116 463789
397772 84522
283770 375649
467088 487809
385495 279870
*/
