
public class DecimalFloat {
	
	public static void main(String[] args) {
		double d = 1.123456789;
		System.out.println("���� : " + (int)d);
		System.out.println("���� : " + Math.floor(d));
		System.out.println("�ø� : " + Math.ceil(d));
		System.out.printf("�ݿø� : %.0f\n", d);
		System.out.println("�ݿø� : " + Math.round(d));
		
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
