
public class Knapsack {
	static final int MAXN = 30+1;
	static final int MAXM = 1000+1;
	static final int MAXW = 1000+1;
	
	static int[] moneys = {0,1,4,6};
	static int[] jw = {0,10,25,10};
	static int[] jp = {0,15,20,8};
	static int W;
	static int N;
	static int MONEY;
	
	static int[] dp = new int[MAXM];
	static void getMoney() {
		for(int i = 1; i <= MONEY; i++) {
			dp[i] = 987654321;
		}
		for(int i = 1; i <= MONEY; i++) {
			dp[i] = 987654321;
			for(int j = 1; j <= N; j++) {
				if(i >= moneys[j]) {
					if(dp[i] > dp[i-moneys[j]]+1) {
						dp[i] = dp[i-moneys[j]]+1;
					}
				}
			}
		}
	}
	static int[] dp1 = new int[MAXW];
	static void knapsack1() {
		for(int i = 1; i <= W; i++) {
			for(int j = 1; j <= N; j++) {
				if(i >= jw[j]) {
					if(dp1[i] < dp1[i-jw[j]]+jp[j]) {
						dp1[i] = dp1[i-jw[j]]+jp[j];
					}
				}
			}
		}
	}
	static int[][] dp2 = new int[MAXN][MAXW];
	static void knapsack2() {
		for(int i = 1; i <= N; i++) {
			for(int j = jw[i]; j <= W; j++) {
				dp2[i][j] = dp2[i-1][j];
				if(j>=jw[i]) {
					if(dp2[i][j] < dp2[i-1][j-jw[i]]+jp[i]) {
						dp2[i][j] = dp2[i-1][j-jw[i]]+jp[i];
					}
				}
			}
		}
	}
	/* 오류가 있다.
	static void knapsack2() {
		for(int i = 1; i <= N; i++) {
			for(int j = jw[i]; j <= W; j++) {
				if(dp2[i-1][j] < dp2[i-1][j-jw[i]]+jp[i]) {
					dp2[i][j] = dp2[i-1][j-jw[i]]+jp[i];
				}else {
					dp2[i][j] = dp2[i-1][j];
				}
			}
		}
	}
	*/
	public static void main(String[] args) throws Exception{
		N = 3;
		W = 30;
		MONEY = 8;
		getMoney();
		System.out.println("max: "+dp[MONEY]);
		knapsack1();
		System.out.println("max1: "+dp1[W]);
		knapsack2();
		System.out.println("max2: "+dp2[N][W]);
	}

}
