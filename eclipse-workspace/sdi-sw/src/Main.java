import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        int A, B;
        String N, ans;
        long temp;
         
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A = Integer.parseInt(st.nextToken());
            if(A == 0) break;
            N = st.nextToken();
            B = Integer.parseInt(st.nextToken());
            temp = 0;
            ans = "";
             
            for(int i = 0; i < N.length(); i++) {
                int chr = (int)N.charAt(i);
                if(chr < 58) {
                    temp += (chr - 48) * Math.pow(A, N.length() - i - 1);
                } else {
                    temp += (chr - 55) * Math.pow(A, N.length() - i - 1);
                }
            }
             
            while(temp != 0) {
                if(temp % B > 9) {
                    ans += (char)(temp % B + 55);
                } else {
                    ans += Long.toString(temp % B);                 
                }
                temp /= B;
            }
             
            for(int i = 0; i < ans.length(); i++) {
                System.out.print(ans.charAt(ans.length() - i - 1));
            }
            System.out.println();
        }
    }
 
}