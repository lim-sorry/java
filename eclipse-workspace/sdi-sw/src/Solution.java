import java.io.*;
import java.util.*;

class Node implements Comparable<Node>{
	int x, y, c;
	
	public Node (int x, int y, int c){
		this.x = x;
		this.y = y;
		this.c = c;
	}
	
	@Override
	public int compareTo(Node o) {
		return this.c-o.c;
	}
	
}
public class Solution {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<T+1; tc++) {
			int N = Integer.parseInt(br.readLine());
			char[][] arr = new char[N][N];
			for(int i=0; i<N; i++) {
				arr[i] = br.readLine().toCharArray();
			}
			Node start = new Node(0,0,0);
			int[][] cnt = new int[N][N];
			for(int[] c: cnt) {
				Arrays.fill(c, 999999999);
			}
			int[] d = {1,0,-1,0,1};
			PriorityQueue<Node> pq = new PriorityQueue<>();
			pq.add(start);
			while(true) {
				Node u = pq.poll();
				if(u.x == N-1 && u.y == N-1) {
					break;
				}
				for(int i=0; i<4; i++) {
					int x = u.x+d[i];
					int y = u.y+d[i+1];
					if(0 <= x && x < N && 0 <= y && y < N) {
						if(u.c+arr[x][y]-48 < cnt[x][y]) {
							Node v = new Node(x, y, u.c+arr[x][y]-48);
							cnt[v.x][v.y] = v.c;
							pq.add(v);
						}
					}
				}
			}
			System.out.println("#"+tc+" "+cnt[N-1][N-1]);
		}
	}
}