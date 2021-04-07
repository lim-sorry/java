///*
//7 11
//1 2 32
//1 3 31
//1 6 60
//1 7 51
//2 3 21
//3 5 46
//3 7 25
//4 5 34
//4 6 18
//5 6 40
//5 7 51
// */
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.InputStreamReader;
//import java.util.*;
////class Node implements Comparable<Node>{
////	int idx;
////	int dist;
////	public Node(int idx, int dist) {
////		this.idx = idx;
////		this.dist = dist;
////	}
////	@Override
////	public int compareTo(Node obj) {
////		return Integer.compare(this.dist,obj.dist);
////	}
////}
//public class MST {
//	static final int INF = 987654321;
//	static int[][] g;
//	static int[] dist ;
//	static int V;
//	static int[] p;
//	static boolean[] visited;
//	static void init() {
//		for(int i=1; i<=V; i++) {
//			dist[i] = INF;
//			p[i] = 0;
//			visited[i] = true;
//		}
//	}
//	static void prim(int start) {
//		init();
//		dist[start] = 0;
//		
//		int u = -1;
//		int min;
//		for(int j=1; j<V; j++) {
//			min = INF;
//			for(int i=0; i<=V; i++) {
//				if(visited[i] && min>dist[i]) {
//					min = dist[i];
//					u = i;
//				}
//			}
//			
//			visited[u] = false;
//			for(int i=1; i<=V; i++) {
//				if(visited[i] && dist[i] > g[u][i]) {// && g[u][i]!=INF) {
//					dist[i] = g[u][i];
//					p[i] = u;
//				}
//			}
//		}
//		System.out.print("idx\t:\t");
//		for(int i=1;i<=V;  i++) {
//			System.out.print(i+"\t");
//		}
//		System.out.println();
//		System.out.print("dist\t:\t");
//		for(int i=1;i<=V;  i++) {
//			System.out.print(dist[i]+"\t");
//		}
//		System.out.println();
//		System.out.print("p\t:\t");
//		for(int i=1;i<=V;  i++) {
//			System.out.print(p[i]+"\t");
//		}
//		System.out.println();
//		
//	}
//	
//	static void prim_PQ(int start) {
//		init();
//		dist[start] = 0;
//		
//		Node u;
//		PriorityQueue<Node> pq = new PriorityQueue<>();
//		pq.offer(new Node(start, 0));
//		for(int j=1; j<V; j++) {
//			u = pq.poll(); 
//			if(!visited[u.idx])continue;
//			
//			visited[u.idx] = false;
//			for(int i=1; i<=V; i++) {
//				if(visited[i] && dist[i] > g[u.idx][i]) {// && g[u][i]!=INF) {
//					dist[i] = g[u.idx][i];
//					p[i] = u.idx;
//					pq.offer(new Node(i, dist[i]));
//				}
//			}
//		}
//		System.out.print("idx\t:\t");
//		for(int i=1;i<=V;  i++) {
//			System.out.print(i+"\t");
//		}
//		System.out.println();
//		System.out.print("dist\t:\t");
//		for(int i=1;i<=V;  i++) {
//			System.out.print(dist[i]+"\t");
//		}
//		System.out.println();
//		System.out.print("p\t:\t");
//		for(int i=1;i<=V;  i++) {
//			System.out.print(p[i]+"\t");
//		}
//		System.out.println();
//		
//	}
//	
//	public static void main(String[] args) throws Exception{
//		System.setIn(new FileInputStream("input.txt"));
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		V = Integer.parseInt(st.nextToken());
//		int E = Integer.parseInt(st.nextToken());
//		
//		g = new int[V+1][V+1];
//		dist = new int[V+1];
//		p = new int[V+1];
//		visited = new boolean[V+1];
//		for(int i=0; i<E;  i++) {
//			st = new StringTokenizer(br.readLine());
//			int sn = Integer.parseInt(st.nextToken());
//			int en = Integer.parseInt(st.nextToken());
//			int val = Integer.parseInt(st.nextToken());
//			g[sn][en] = val;
//			g[en][sn] = val;
//		}
//		/*		
//		for(int i=1; i<=V;  i++) {
//			for(int j=1; j<=V; j++) {
//				System.out.print(g[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println("=========================");
//		//*/
//		
//		for(int i=1; i<=V;  i++) {
//			for(int j=1; j<=V; j++) {
//				if(i!=j && g[i][j]==0) {
//					g[i][j]=INF;
//				}
//			}
//		}
//
//		
//		
//		/*		
//		for(int i=1; i<=V;  i++) {
//			for(int j=1; j<=V; j++) {
//				if(g[i][j]==INF) {
//					System.out.print("- ");
//				}else
//				System.out.print(g[i][j]+" ");
//			}
//			System.out.println();
//		}
//		//*/
//		
//		int start = 3;
//		
//		
//		prim(start);
//		System.out.println("=================");
//		prim_PQ(start);
//		System.out.println("=================");
//		
//	}
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
