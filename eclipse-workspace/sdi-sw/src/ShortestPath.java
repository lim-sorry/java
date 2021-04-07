//import java.io.*;
//import java.util.*;
//
////class Node implements Comparable<Node>{
////	int idx;
////	int dist;
////	
////	public Node(int idx, int dist) {
////		this.idx = idx;
////		this.dist = dist;
////	}
////	
////	@Override
////	public int compareTo(Node obj) {
////		return Integer.compare(this.dist, obj.dist);
////	}
////}
//public class ShortestPath {
//	static final int INF = 987654321;
//	static int[][] g;
//	static int[] dist;
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
//	static void f_w(int start, int end) {
//		for(int k=1; k<=V; k++) {
//			for(int s=1; s<=V; s++) {
//				for(int e=1; e<=V; e++) {
//					if(g[s][e] > g[s][k]+g[k][e]) {
//						g[s][e] = g[s][k]+g[k][e];
//					}
//				}
//			}
//		}
//		System.out.println("f_w\t:\t"+g[start][end]);
//	}
//	static void dijkstra_PQ(int start, int end) {
//		init();
//		dist[start] = 0;
//		
//		Node u;
//		PriorityQueue<Node> pq = new PriorityQueue<>();
//		pq.offer(new Node(start, 0));
//		while(!pq.isEmpty()) {
//			u = pq.poll();
//			if(!visited[u.idx]) continue;
//			if(u.idx == end) break;
//			visited[u.idx] = false;
//			for(int i=1; i<=V; i++) {
//				if(dist[i] > dist[u.idx]+g[u.idx][i]) {
//					dist[i] = dist[u.idx]+g[u.idx][i];
//					p[i] = u.idx;
//					pq.offer(new Node(i, dist[i]));
//				}
//			}
//		}
//		System.out.print("idx\t:\t");
//		for(int i=1; i<=V; i++) {
//			System.out.print(i+"\t");
//		}
//		System.out.println();
//		System.out.print("dist\t:\t");
//		for(int i=1; i<=V; i++) {
//			System.out.print(dist[i]+"\t");
//		}
//		System.out.println();
//		System.out.print("p\t:\t");
//		for(int i=1; i<=V; i++) {
//			System.out.print(p[i]+"\t");
//		}
//		System.out.println();
//		System.out.println("dijk_PQ\t:\t"+dist[end]);
//	}
//	static void dijkstra(int start, int end) {
//		init();
//		dist[start] = 0;
//		
//		int u = -1;
//		int min;
//		while(true) {
//			min = INF;
//			for(int i=0; i<=V; i++) {
//				if(visited[i] && min>dist[i]) {
//					min = dist[i];
//					u = i;
//				}
//			}
//			if(u == end) break;
//			visited[u] = false;
//			for(int i=1; i<=V; i++) {
//				if(dist[i] > dist[u]+g[u][i]) {
//					dist[i] = dist[u]+g[u][i];
//					p[i] = u;
//				}
//			}
//		}
//		System.out.print("idx\t:\t");
//		for(int i=1; i<=V; i++) {
//			System.out.print(i+"\t");
//		}
//		System.out.println();
//		System.out.print("dist\t:\t");
//		for(int i=1; i<=V; i++) {
//			System.out.print(dist[i]+"\t");
//		}
//		System.out.println();
//		System.out.print("p\t:\t");
//		for(int i=1; i<=V; i++) {
//			System.out.print(p[i]+"\t");
//		}
//		System.out.println();
//		System.out.println("dijk\t:\t"+dist[end]);
//	}
//	static void bfs(int start, int end) {
//		init();
//		dist[start] = 0;
//		Queue<Integer> q = new LinkedList<>();
//		q.offer(start);
//		int u;
//		while(!q.isEmpty()) {
//			u = q.poll();
//			for(int i=1; i<=V; i++) {
//				if(dist[i] > dist[u]+g[u][i]) {
//					dist[i] = dist[u]+g[u][i];
//					p[i] = u;
//					q.offer(i);
//				}
//			}
//		}
//		System.out.print("idx\t:\t");
//		for(int i=1; i<=V; i++) {
//			System.out.print(i+"\t");
//		}
//		System.out.println();
//		System.out.print("dist\t:\t");
//		for(int i=1; i<=V; i++) {
//			System.out.print(dist[i]+"\t");
//		}
//		System.out.println();
//		System.out.print("p\t:\t");
//		for(int i=1; i<=V; i++) {
//			System.out.print(p[i]+"\t");
//		}
//		System.out.println();
//		System.out.println("bfs\t:\t"+dist[end]);
//	}
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
//		for(int i=0; i<E; i++) {
//			st = new StringTokenizer(br.readLine());
//			int sn = Integer.parseInt(st.nextToken());
//			int en = Integer.parseInt(st.nextToken());
//			int val = Integer.parseInt(st.nextToken());
//			g[sn][en] = val;
//		}
//		for(int i=1; i<=V; i++) {
//			for(int j=1; j<=V; j++) {
//				if (g[i][j]==0) {
//					g[i][j] = INF;
//					System.out.print("- ");
//				} else {
//					System.out.print(g[i][j]+" ");
//				}
//			}
//			System.out.println();
//		}
//		int start = 1;
//		int end = 7;
//		dijkstra_PQ(start, end);
//		System.out.println("====================");
//		dijkstra(start, end);
//		System.out.println("====================");
//		bfs(start, end);
//		System.out.println("====================");
//		f_w(start, end);
//		
//		/*
//		ArrayList<LinkedList<Integer>> g = new ArrayList<>(V+1);
//		for(int i=0; i<=V; i++) {
//			g.add(new LinkedList<>());
//		}
//		for(int i=0; i<E; i++) {
//			st = new StringTokenizer(br.readLine());
//			int sn = Integer.parseInt(st.nextToken());
//			int en = Integer.parseInt(st.nextToken());
//			int val = Integer.parseInt(st.nextToken());
//			g.get(sn).add(en);
//		}
//		
//		/*
////		int[][] g = new int[V+1][V+1];
//		ArrayList<ArrayList<Integer>> g = new ArrayList<>(V+1);
//		for(int i=0; i<=V; i++) {
//			g.add(new ArrayList<>());
//		}
//		for(int i=0; i<E; i++) {
//			st = new StringTokenizer(br.readLine());
//			int sn = Integer.parseInt(st.nextToken());
//			int en = Integer.parseInt(st.nextToken());
//			int val = Integer.parseInt(st.nextToken());
//			g.get(sn).add(en);
////			g[sn][en] = val;
//		}
//		
//		for(int i=1; i<g.size(); i++) {
//			System.out.print(i+": [");
//			for(int t: g.get(i)) {
//				System.out.print(t+" ");
//			}
//			System.out.println("]");
//		}
//		*/
//	}
//
//}
