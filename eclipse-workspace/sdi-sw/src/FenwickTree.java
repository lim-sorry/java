/*
5 2 2 
1 
2 
3 
4 
5 
1 3 6 
2 2 5 
1 5 2
2 3 5
*/
import java.io.*;
import java.util.*;
  
public class FenwickTree {

	static void update(long[] tree, int i, long diff) {
	    while (i < tree.length) {
	        tree[i] += diff;
	        i += (i & -i);
	    }
	}

	static long sum(long[] tree, int i) {
	    int ans = 0;
	    while (i > 0) {
	        ans += tree[i];
	        i -= (i & -i); 
	    }

	    return ans;
	}
    public static void main(String[] args) throws Exception {
    	System.setIn(new FileInputStream("test_input.txt"));
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken().trim());
    	int M = Integer.parseInt(st.nextToken().trim());
    	int K = Integer.parseInt(st.nextToken().trim());
    	long[] src = new long[N+1];
    	long[] tree = new long[N+1];
    	
    	
    	for(int i=1; i<=N; i++) {
    		src[i] = Long.parseLong(br.readLine().trim());
    		update(tree, i, src[i]);
    	}
    	
    	M+=K;
    	
    	for(int i=0;  i<M; i++) {
    		st = new StringTokenizer(br.readLine());
    		int op = Integer.parseInt(st.nextToken().trim());
    		if(op==1) {
        		int pos = Integer.parseInt(st.nextToken().trim());
        		long diff = Long.parseLong(st.nextToken().trim()) - src[pos];
        		src[pos] = diff;
        		update(tree,pos,diff);
    		}else {
        		int left = Integer.parseInt(st.nextToken().trim());
        		int right = Integer.parseInt(st.nextToken().trim());
        		System.out.println(sum(tree,right)-sum(tree,left-1));
    		}
    	}
    }
}