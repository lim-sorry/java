import java.util.*;

public class Lotto {

	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<>();
		while(lotto.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
		}
		System.out.println(lotto);
		
		/*
		ArrayList<Integer> lotto = new ArrayList<>();
		while(lotto.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			if(!lotto.contains(num)) {
				lotto.add(num);
			}
		}
		lotto.sort((a,b) -> Integer.compare(a, b));
		System.out.println(lotto);
		*/
	}

}
