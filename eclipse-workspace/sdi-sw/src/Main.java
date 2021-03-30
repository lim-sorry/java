import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int A, B;
        BigInteger N;
        
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            if(A == 0) break;
            N = new BigInteger(st.nextToken(), A);
            B = Integer.parseInt(st.nextToken());
            System.out.println(N.toString(B).toUpperCase());
        }
    }
 
}
