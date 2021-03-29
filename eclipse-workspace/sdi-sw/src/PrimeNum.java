
public class PrimeNum {
	static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		
		for(int i = 2; i < n; i++) {
			if((n % i) == 0) {
				return false;
			}
		}
		
		return true;
	}
	static boolean isPrime2(int n) {
		if(n == 1) {
			return false;
		}
		int len = (int)Math.sqrt(n);
		for(int i = 2; i <= len; i++) {
			if((n % i) == 0) {
				return false;
			}
		}
		
		return true;
	}
	static boolean isPrime3(int n) {
		if(n == 1) {
			return false;
		}
		if(n == 2) {
			return true;
		}
		if((n & 1) == 0) {
			return false;
		}
		int len = (int)Math.sqrt(n);
		for(int i = 3; i <= len; i++) {
			if((n % i) == 0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		System.out.println("start");
		long start = System.currentTimeMillis();
		int s = 100000000;
		int e = 100010000;
		int cnt = 0;
		for(int i = s; i <= e; i++) {
			if(isPrime3(i)) {
				cnt++;
			}
		}
		System.out.println("cnt : " + cnt);
		long end = System.currentTimeMillis();
		System.out.println("time : " + (end - start));
	}

}
