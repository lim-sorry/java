
public class DecimalFloat {
	
	public static void main(String[] args) {
		double d = 1.123456789;
		System.out.println("버림 : " + (int)d);
		System.out.println("버림 : " + Math.floor(d));
		System.out.println("올림 : " + Math.ceil(d));
		System.out.printf("반올림 : %.0f\n", d);
		System.out.println("반올림 : " + Math.round(d));
		
		/*
		System.out.printf("%.2f", d);
		System.out.println();
		*/
		
		/*
		double d;
		float f1 = 1;
		float f2 = (float)1.0;
		float f3 = 1.0f;
		*/
		
		/*
//		long l = 2147483648L;
		int i = 2147483647;
		int i2 = 1;
//		long l = (long)i + i2;
		long l = 0L + i + i2;
		System.out.println("l : " + l);
		/*
		
		/*
		int i1 = 2147483647;
		int i2 = 0x7fffffff;
		System.out.println("i1 : " + i1);
		System.out.println("i2 : " + i2);
		*/
	}

}
