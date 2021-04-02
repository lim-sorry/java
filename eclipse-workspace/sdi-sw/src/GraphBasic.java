import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class GraphBasic {
	static char[] src = {0,'a',98,99};
	static int n, r;
	static int[] a = new int[101];
	static boolean[] visit = new boolean[101];
	static void print() {
		System.out.print("[");
		for(int i = 1; i <= r; i++) {
			System.out.print(src[a[i]]+" ");
		}
		System.out.println("]");
	}
	static void btr_perm(int k) {
		if(k == r) {
			print();
			return;
		}
		k++;
		for(int i = 1; i <= n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				a[k] = i;
				btr_perm(k);
				visit[i] = false;
			}
		}
	}
	static void btr_pi(int k) {
		if(k == r) {
			print();
			return;
		}
		k++;
		for(int i = 1; i <= n; i++) {
			a[k] = i;
			btr_pi(k);
		}
	}
	static void btr_subSet(int k) {
		if(k == r) {
			print();
			return;
		}
		k++;
		for(int i = 0; i < 2; i++) {
			a[k] = i;
			btr_subSet(k);
		}
	}
	public static void main(String[] args) throws Exception{
		n = 3;
		r = 2;
		btr_perm(0);
		System.out.println("===========");
		btr_pi(0);
		System.out.println("===========");
		btr_subSet(0);
	}

}
