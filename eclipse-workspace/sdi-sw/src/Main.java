import java.io.*;
import java.util.*;
 
public class Main {
		
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<N-1; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	Integer parent = Integer.parseInt(st.nextToken());
        	Integer child = Integer.parseInt(st.nextToken());	
    		hash.put(child, parent);
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer n1 = Integer.parseInt(st.nextToken());
        Integer n2 = Integer.parseInt(st.nextToken());
        LinkedList<Integer> roots = new LinkedList<>();
        while(hash.containsKey(n1)) {
        	roots.add(n1);
        	n1 = hash.get(n1);
        }
        roots.add(n1);
        while(!roots.contains(n2)) {
        	n2 = hash.get(n2);
        }
        System.out.println(n2);
    }
    
}
