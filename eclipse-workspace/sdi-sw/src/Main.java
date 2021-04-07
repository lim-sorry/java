import java.io.*;
import java.util.*;
 
public class Main {
		
    public static void main(String[] args) throws Exception {
    	System.setIn(new FileInputStream("input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        }
        LinkedList<Integer> list = new LinkedList<>();
        for(int i: arr) {
        	if(list.size() == 0 || i > list.peekLast()) {
        		list.add(i);
        	} else {
        		int idx = Collections.binarySearch(list, i);
        		list.set(-idx-1, i);
        	}
		}
        System.out.println(N - list.size());
    }
    
}
