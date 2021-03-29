public class BitTest {
	static final int MAX = 30;
	static char[] src = new char[MAX];
	static int N;
	static void subSet() {
		for(int i = 0; i < (1<<N); i++) {
			System.out.print("{");
			for(int j = 0; j < N; j++) {
				if((i & (1 << j)) == (1 << j)) {
					System.out.print(src[j] + " ");
				}
			}
			System.out.println("}");
		}
	}
	public static void main(String[] args) {
		int val = 100;
		int key = 200;
		System.out.println("val : " + val);
		val = val ^ key;
		System.out.println("val : " + val);
		val = val ^ key;
		System.out.println("val : " + val);
	}

}
