import java.io.*;
import java.util.*;
 
public class Main {
	static int M, N, m, n;
	static String[][] arr;
	static int[] drs = {1,0,-1,0,1};
	static int[][] cnt;
	
	public static int bfs() {
		Queue<int[]> q = new LinkedList<>();
		cnt = new int[M][N];
		cnt[0][0] = 1;
		int[] nd = {0,0,1};
		q.offer(nd);
		while(!q.isEmpty()) {
			nd = q.poll();
			int x = nd[0];
			int y = nd[1];
			if(x == m && y == n) {
				return nd[2];
			}
			for(int i = 0; i < 4; i++) {
				x = nd[0];
				y = nd[1];
				while(true) {
					if(0<=x+drs[i] && x+drs[i]<M && 0<=y+drs[i+1] && y+drs[i+1]<N) {
						x += drs[i];
						y += drs[i+1];
						if(arr[x][y].equals("1")) {
							if(cnt[x][y] == 0 || cnt[x][y] > nd[2]+1) {
								int[] nd2 = {x,y,nd[2]+1};
								cnt[x][y] = nd[2]+1;
								q.offer(nd2);
							}
						} else {
							break;
						}
					} else {
						break;
					}
				}
			}
		}
		return 0;
	}
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new String[M][N];
        for(int i = 0; i < M; i++) {
        	String[] strs = br.readLine().split(" ");
        	arr[i] = strs;
        }
        System.out.println(bfs()-2);
    }

}
