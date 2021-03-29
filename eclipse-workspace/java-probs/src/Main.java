import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
 
public class Main {
     
    public static void main(String args[]) {
         
        Scanner scan = new Scanner(System.in);
         
        int N = scan.nextInt();
         
        Integer[] list = new Integer[N];
        int idx = 0;
        int[][] lines = new int[N][2];
         
        for(int i = 0; i < N; i++) {
             
            lines[i][0] = scan.nextInt();
            lines[i][1] = scan.nextInt();
        }
         
        Arrays.sort(lines, new Comparator<int[]>() {
             
            @Override
            public int compare(int[] a, int[] b) {
                 
                return a[0] - b[0];
            }
        });
         
        Integer[] trace = new Integer[N];
        list[0] = lines[0][1];
        trace[0] = 0;
        int p, lb, ub;
         
        for(int i = 1; i < N; i++) {
             
            if(list[idx] < lines[i][1]) {
                 
                idx++;
                list[idx] = lines[i][1];
                trace[i] = idx;
            } else {
                 
                lb = 0;
                ub = idx;
                p = lb + (ub - lb) / 2;
                 
                if(idx < 2) {
                     
                    if(list[0] > lines[i][1]) {
                         
                        list[0] = lines[i][1];
                        trace[i] = 0;
                    } else {
                         
                        list[1] = lines[i][1];
                        trace[i] = 1;
                    }
                } else {
                     
                    while(p != lb) {
                         
                        if(list[p] < lines[i][1]) {
                             
                            lb = p;
                        } else {
                             
                            ub = p;
                        }
                        p = lb + (ub - lb) / 2;
                    }
                    list[ub] = lines[i][1];
                    trace[i] = ub;
                }
            }
        }
        Integer[] answer = new Integer[N - idx - 1];
        int i = N - 1;
        int j = N - idx - 2;
 
        System.out.println(Arrays.toString(trace));
        
        while(i > -1) {
             
            if(trace[i] == idx) idx--;
            else {
                answer[j] = lines[i][0];
                j--;
            }
            i--;
        }
         
        System.out.println(answer.length);
        for(int k = 0; k < answer.length; k++) {
             
            System.out.println(answer[k]);
        }
    }
}

/*

7
1 1
2 6
3 7
4 4
5 2
6 3
7 5


*/