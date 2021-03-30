
public class DataType {

	public static void main(String[] args) throws Exception{
		int x = 100;
		int y = 200;
		System.out.println(x - y);
		Integer i1 = 128;
		Integer i2 = 200;
		System.out.println(i1 - i2);
		System.out.println(Integer.compare(i1, i2));
		
		/*
		int iNum = 300;
		Integer i = new Integer(iNum);
		Integer i2 = 300; // 오토박싱
		
		/*
		int x = 300;
		int y = 300;
		Integer i1 = 128; // 객체로 접근하면 메모리에 두 번 접근한다.
		Integer i2 = 128; // 그러나 127 이하(바이트 범위)는 자동으로 메모리에 넣어준다.
		
		if(x == y) {
			System.out.println("Y");	
		}else {
			System.out.println("N");
		}
		if(i1 == i2) { 
			System.out.println("Y");	
		}else {
			System.out.println("N");
		}
		
		/*
		int iNum = 125;
		System.out.println(Integer.bitCount(iNum));
		
		/*
		int iNum = 127;
		String sNum = iNum + "";
		System.out.println(sNum);
		System.out.println(4 + 1 + "" + (2 + 3));
		
		/*
		int i = 125; // 00000000 00000000 01111101
		String str2 = Integer.toBinaryString(i);
		String str8 = Integer.toOctalString(i);
		String str10 = Integer.toString(i);
		String str16 = Integer.toHexString(i);
		System.out.println(str2);
		System.out.println(str8);
		System.out.println(str10);
		System.out.println(str16);
		
		/*
		String sNum = "127";
		byte b = Byte.parseByte(sNum);
		short s = Short.parseShort(sNum);
		int i = Integer.parseInt(sNum);
		long l = Long.parseLong(sNum);
		System.out.println(l);
		
//		Wrapper Class
//		1. 숫자와 문자열
//		2. 기본 자료형의 객체화
		
		/*
		byte b; Byte b1;
		char c; Character c1;
		short s; Short s1;
		int i; Integer i1;
		long l; Long l1;
		
		float f; Float f1;
		double d; Double d1;
		
		boolean bl; Boolean bl2;
		*/
	}

}
