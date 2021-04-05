import java.io.*;
import java.util.*;

public class Solution {
	static int v, e;
	static ArrayList<HashSet<Integer>> g;
	static Stack<Integer> s;
	static boolean[] visited;
	static void init() {
		s = new Stack<>();
		visited = new boolean[v+1];
		Arrays.fill(visited, true);
	}
	static void find() {
		init();
		while(s.size() < v) {
			for(int i = 1; i < v+1; i++) {
				if(visited[i] && g.get(i).size() == 0) {
					s.push(i);
					for(int j = 1; j < v+1; j++) {
						if(g.get(j).contains(i)) {
							g.get(j).remove(i);
						}
					}
					visited[i] = false;
				}
			}
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int tc = 1; tc < 11; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			v = Integer.parseInt(st.nextToken());
			e = Integer.parseInt(st.nextToken());
			g = new ArrayList<HashSet<Integer>>(v+1);
			for(int i = 0; i < v+1; i++) {
				g.add(new HashSet<Integer>());
			}
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < e; i++) {
				int from =Integer.parseInt(st.nextToken());
				int to =Integer.parseInt(st.nextToken());
				g.get(to).add(from);
			}
			find();
			StringBuilder sb = new StringBuilder();
			for(int i : s) {
				sb.append(" "+i);
			}
			System.out.println("#"+tc+sb);
		}
	}

}
