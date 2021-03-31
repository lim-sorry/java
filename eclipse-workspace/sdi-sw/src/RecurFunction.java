
public class RecurFunction {
	static final int MAX = 101; 
	static void memoryOutRec(int n) {
		System.out.println("n: "+n);
		memoryOutRec(++n);
	}
	static int cnt;
	static int dpCnt;
	static int fibo(int n) {
		cnt++;
		if(n<2) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
	}
	static int[] dp1 = new int[MAX];
	static int[] dp2 = new int[MAX];
	static int[] dp3 = new int[3];
	static int fibo_rec_dp(int n) {
		dpCnt++;
		if(n<2) {
			return n;
		}
		if(dp1[n]==0) {
			dp1[n] = fibo_rec_dp(n-1)+fibo_rec_dp(n-2);
		}
		return dp1[n];
	}
	static int fibo_iter_dp(int n) {
		dp2[1] = 1;
		for(int i=2; i<=n; i++) {
			dp2[i] = dp2[i-1] + dp2[i-2];
		}
		return dp2[n];
	}
	static int fibo_iter_dp2(int n) {
		dp3[1] = 1;
		for(int i=2; i<=n; i++) {
			dp2[i%3] = dp2[(i-1)%3] + dp2[(i-2)%3];
		}
		return dp2[n%3];
	}
	public static void main(String[] args) throws Exception{
		System.out.println("start");
//		memoryOutRec(1);
		long s = System.currentTimeMillis();
		int n = 10;
//		System.out.printf("fibo(%d) = %d\n", n, fibo(n));
//		System.out.println("cnt: "+cnt);
		System.out.printf("fibo_rec_dp(%d) = %d\n", n, fibo_rec_dp(n));
//		System.out.println("dpCnt: "+dpCnt);
		System.out.printf("fibo_iter_dp(%d) = %d\n", n, fibo_iter_dp(n));
		System.out.printf("fibo_iter_dp2(%d) = %d\n", n, fibo_iter_dp2(n));
		long e = System.currentTimeMillis();
		System.out.println("time: "+(e-s));
	}

}
