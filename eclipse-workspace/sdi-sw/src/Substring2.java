import java.util.*;
/*
class UserComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return 0;
	}
	
}
*/
public class Substring2 {
//	static int[] sa = new int[10000];
	public static void main(String[] args) {
		System.out.println("start");
		String str = "banana";
		Integer[] suffixArr = new Integer[str.length()];
		for(int i = 0; i < suffixArr.length; i++) {
			suffixArr[i] = i;
		}
		for(int i = 0; i < suffixArr.length; i++) {
			System.out.println(str.substring(suffixArr[i]));
		}
		System.out.println("================");
		Arrays.sort(suffixArr, (a, b) -> str.substring(a).compareTo(str.substring(b)));
		for(int i = 0; i < suffixArr.length; i++) {
			System.out.println(str.substring(suffixArr[i]));
		}		
	}

}
