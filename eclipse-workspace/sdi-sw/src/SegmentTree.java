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
  
public class SegmentTree {
	static long init(long[] src, long[] tree, int node, int start, int end) {
	    if (start == end) {
	        return tree[node] = src[start];
	    }
	    else {
	    	int mid = (start+end)>>1;
	        return tree[node] = init(src, tree, node << 1, start, mid) + 
	            init(src, tree, (node << 1) | 1, mid + 1, end);
	    }
	}
	static void update(long[] tree, int node, int start, int end, int index, long diff) {
	    if (index < start || index > end) return;
	    
	    tree[node] = tree[node] + diff;
	    
	    if (start != end) {
	        update(tree, node * 2, start, (start + end) / 2, index, diff);
	        update(tree, node * 2 + 1, (start + end) / 2 + 1, end, index, diff);
	    }
	}
	static long sum(long[] tree, int node, int start, int end, int left, int right) {
	    if (left > end || right < start) {
	        return 0;
	    }
	    if (left <= start && end <= right) {
	        return tree[node];
	    }
	    return sum(tree, node * 2, start, (start + end) / 2, left, right) + 
	        sum(tree, node * 2 + 1, (start + end) / 2 + 1, end, left, right);
	}
    public static void main(String[] args) throws Exception {
    	System.setIn(new FileInputStream("test_input.txt"));
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken().trim());
    	int M = Integer.parseInt(st.nextToken().trim());
    	int K = Integer.parseInt(st.nextToken().trim());
    	long[] src = new long[N+1];
    	
    	int h = (int)Math.ceil(Math.log10(N) / Math.log10(2))+1;
    	int treeSize = (1<<h);
    	long[] tree = new long[treeSize];
    	M+=K;
    	
    	for(int i=1; i<=N; i++) {
    		src[i] = Long.parseLong(br.readLine().trim());
    	}
    	
    	init(src,tree,1,1,N);
    	
    	for(int i=0;  i<M; i++) {
    		st = new StringTokenizer(br.readLine());
    		int op = Integer.parseInt(st.nextToken().trim());
    		if(op==1) {
        		int pos = Integer.parseInt(st.nextToken().trim());
        		long diff = Long.parseLong(st.nextToken().trim()) - src[pos];
        		src[pos] = diff;
        		update(tree,1,1,N,pos,diff);
    		}else {
        		int left = Integer.parseInt(st.nextToken().trim());
        		int right = Integer.parseInt(st.nextToken().trim());
        		System.out.println(sum(tree,1,1,N,left,right));
    		}
    	}
    }
}