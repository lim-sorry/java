
public class GcdLcd {
	
	static int gcd(int p, int q) {
		if(q == 0) {
			return p;
		}
		return gcd(q, p % q);
	}
	public static void main(String[] args) {
		int a = 1071;
		int b = 1029;
		int g = gcd(a, b);
		int l = a * b / g;
		
		System.out.println("gcd : " + g);
		System.out.println("lcd : " + l);
	}

}
