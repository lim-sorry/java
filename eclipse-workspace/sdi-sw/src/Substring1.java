import java.util.ArrayList;
import java.util.Arrays;

public class Substring1 {

	public static void main(String[] args) throws Exception{
		String str = "banana";
		String[] strs = new String[str.length()];
		// 접미어 배열
		for(int i = 0; i < strs.length; i++) {
			strs[i] = str.substring(i);
		}
		// 정렬
		Arrays.sort(strs);
		// 접두어 배열
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < strs.length; i++) {
			String tmp = strs[i];
			for(int j = 0; j < tmp.length(); j++) {
				String tt = tmp.substring(0, j + 1);
				if(!list.contains(tt)) {
					list.add(tt);
				}
			}
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("10번째 배열 : " + list.get(9));
	}

}
