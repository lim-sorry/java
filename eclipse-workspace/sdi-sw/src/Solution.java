import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc=1; tc<T+1; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			ArrayList<LinkedList<Integer>> pcList = new ArrayList<>(V+1);
			ArrayList<LinkedList<Integer>> cpList = new ArrayList<>(V+1);
			for(int i=0; i<V+1; i++) {
				pcList.add(new LinkedList<Integer>());
				cpList.add(new LinkedList<Integer>());
			}
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<E; i++) {
				int p = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				pcList.get(p).add(c);
				cpList.get(c).add(p);
			}
			int root = n1;
			LinkedList<Integer> roots = new LinkedList<>();
			while(root!=1) {
				root = cpList.get(root).peek();
				roots.add(root);
			}
			root = n2;
			while(!roots.contains(root)) {
				root = cpList.get(root).peek();
			}
			System.out.print("#"+tc+" "+root+" ");
			Queue<Integer> q = new LinkedList<>();
			int ans = 1;
			q.offer(root);
			while(!q.isEmpty()) {
				int n = q.poll();
				for(int i: pcList.get(n)) {
					q.offer(i);
					ans++;
				}
			}
			System.out.println(ans);
		}
	}

}
