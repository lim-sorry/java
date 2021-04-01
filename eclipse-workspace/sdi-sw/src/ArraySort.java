import java.util.*;

/*
class UserComp implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer t1 = (Integer)o1;
		Integer t2 = (Integer)o2;
		return Integer.compare(t2, t1);
	}
	
}
*/
class UserComp implements Comparator<Integer> {
	
	@Override
	public int compare(Integer i1, Integer i2) {
		return Integer.compare(i2, i1);
	}
	
}
class Temp implements Comparable<Temp> {
	int x;
	int y;
	public Temp() {}
	public Temp(int x, int _y) {
		this.x = x;
		y = _y;
	}
	
	public int compareTo(Temp t) {
		if(this.x > t.x) {
			return 1;
		} else if(this.x < t.x) {
			return -1;
		}
		return 0;
	}
	
	public String toString() {
		return x+" : "+y;
	}
}
public class ArraySort {

	public static void main(String[] args) {
		Temp[] tArr = new Temp[3];
		System.out.println(tArr[0]); // null
		tArr[0] = new Temp(2,3);
		tArr[1] = new Temp(3,1);
		tArr[2] = new Temp(1,4);
		System.out.println(Arrays.toString(tArr));
		Arrays.sort(tArr); // with comparable implements, no err
		Arrays.sort(tArr, (a,b) -> Integer.compare(a.x,b.x));
		System.out.println(Arrays.toString(tArr));
		
		/*
		Temp t = new Temp(300, 400);
		System.out.println(t.toString());
		
		/*
		Temp d = new Temp();
		d.x = 100;
		d.y = 200;
		Temp d1 = new Temp(300, 400);
		
		/*
		int arr[][] = {{1,2},{2,1},{4,3},{2,3}};
		for(int[] t : arr) {
			System.out.print(Arrays.toString(t));
		}
		System.out.println();
		Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
		for(int[] t : arr) {
			System.out.print(Arrays.toString(t));
		}
		System.out.println();
		Arrays.sort(arr, (a,b) -> {
			if(a[0] > b[0]) {
				return 1;
			} else if(a[0] < b[0]) {
				return -1;
			} else {
				if(a[1] < b[1]) {
					return 1;
				}
			}
			return -1;
		});
		for(int[] t : arr) {
			System.out.print(Arrays.toString(t));
		}
		System.out.println();
		
		/*
		String[] str = {"abcd","cd","d"};
		System.out.println("정렬전: "+Arrays.toString(str));
		Arrays.sort(str, (a, b) -> Integer.compare(a.length(), b.length())); 
		System.out.println("정렬후: "+Arrays.toString(str));
		
		/*
		Integer[] arr = {1,3,5,7,9,10,8,4,2};
		System.out.println("정렬전: "+Arrays.toString(arr));
		// default sort
		UserComp uc = new UserComp();
		Arrays.sort(arr, uc); 
		// class sort
		Arrays.sort(arr, new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return Integer.compare(i1, i2);
			}
		}); 
		// lambda sort
		Arrays.sort(arr, (Integer i1, Integer i2) -> Integer.compare(i1, i2)); 
		System.out.println("정렬후: "+Arrays.toString(arr));

		
		/*
		int[] arr = new int[] {1,2};
		int[] arr1 = {1,3,5,7,9,10,8,4,2};
		System.out.print("정렬전: [");
		for(int t : arr1) {
			System.out.print(t+" ");
		}
		System.out.println("]");
		System.out.println("정렬전: "+Arrays.toString(arr1));
		Arrays.sort(arr1);
//		Arrays.sort(arr1, 3, 6+1);
		System.out.println("정렬후: "+Arrays.toString(arr1));
		int key = 6;
		int idx = Arrays.binarySearch(arr1, key);
		System.out.println("key: "+key+", idx: "+idx);
		*/
	}

}
