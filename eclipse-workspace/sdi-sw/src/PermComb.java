
public class PermComb {
	static char[] src = {0,'a',98,99};
	static char[] temp = new char[100];
	static int n, r;
	static void print() {
		System.out.print("[");
		for(int i = 1; i <= r; i++) {
			System.out.print(temp[i]+" ");
		}
		System.out.println("]");
	}
	static void perm(int n, int r) {
		if(r == 0) {
			print();
			return;
		}
		for(int i = n; i > 0; i--) {
			char t = src[n];
			src[n] = src[i];
			src[i] = t;
			
			temp[r] = src[n];
			perm(n-1, r-1);
			
			t = src[n];
			src[n] = src[i];
			src[i] = t;
		}
	}
	static void pi(int n, int r) {
		if(r == 0) {
			print();
			return;
		}
		for(int i = n; i > 0; i--) {
			temp[r] = src[n];
			perm(n, r-1);
		}
	}
	/*
	static char[] src = {'a',98,99};
	static char[] temp = new char[100];
	static int n, r;
	static void print() {
		System.out.print("[");
		for(int i = 0; i < r; i++) {
			System.out.print(temp[i]+" ");
		}
		System.out.println("]");
	}
	static void perm(int n, int r) {
		if(r == 0) {
			print();
			return;
		}
		for(int i = n - 1; i >= 0; i--) {
			char t = src[n-1];
			src[n-1] = src[i];
			src[i] = t;
			
			temp[r - 1] = src[n-1];
			perm(n-1, r-1);
			
			t = src[n-1];
			src[n-1] = src[i];
			src[i] = t;
		}
	}
	*/
	static void comb(int n, int r) {
		if(r == 0) {
			print();
			return;
		}
		if(n < r) {
			return;
		}
		temp[r] = src[n];
		comb(n-1, r-1);
		comb(n-1, r);
	}
	static void h(int n, int r) {
		if(r == 0) {
			print();
			return;
		}
		if(n == 0) {
			return;
		}
		temp[r] = src[n];
		h(n, r-1);
		h(n-1, r);
	}
	static int comb_Cal(int n, int r) {
		if(r == 0 || n == r) {
			return 1;
		}
		return comb_Cal(n-1, r-1)+comb_Cal(n-1, r);
	}
	static int[][] dp = new int[101][101];
	static int comb_Cal_dp(int n, int r) {
		if(r == 0 || n == r) {
			return 1;
		}
		if(dp[n][r] == 0) {
			dp[n][r] = comb_Cal_dp(n-1, r-1)+comb_Cal_dp(n-1, r);
		}
		return dp[n][r];
	}
	public static void main(String[] args) throws Exception{
		n = 3;
		System.out.println("perm");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<= n; j++) {
				if(i != j) {
					System.out.printf("[%c, %c]\n", src[i], src[j]);
				}
			}
		}
		System.out.println("pi");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<= n; j++) {
				System.out.printf("[%c, %c]\n", src[i], src[j]);
			}
		}
		System.out.println("comb");
		for(int i = 1; i < n; i++) {
			for(int j = i+1; j<= n; j++) {
				System.out.printf("[%c, %c]\n", src[i], src[j]);
			}
		}
		System.out.println("h");
		for(int i = 1; i <= n; i++) {
			for(int j = i; j<= n; j++) {
				System.out.printf("[%c, %c]\n", src[i], src[j]);
			}
		}
		
		/*
		n = 3;
		for(int i = 0; i <= n; i++) {
			r = i;
			comb(n, r);
		}
		
		/*
		System.out.println("start");
		System.out.println(comb_Cal_dp(100, 50));
		
		/*
		n = 3;
		r = 2;
		perm(n, r);
		System.out.println("=================");
		pi(n, r);
		System.out.println("=================");
		comb(n, r);
		System.out.println("=================");
		h(n, r);
		*/
	}

}
