import java.math.*;

public class BigIntegerTest {

	public static void main(String[] args) throws Exception{
		String sNum = "100000";
		BigInteger bi1 = new BigInteger(sNum, 2);
		String ans = bi1.toString(36);
		System.out.println(ans);
		
		/*
		BigInteger bi1 = new BigInteger("123");
		BigInteger bi2 = new BigInteger("456");
		System.out.println(bi1.add(bi2));
		System.out.println(bi1.multiply(bi2));
		System.out.println(bi1.divide(bi2));
		System.out.println(bi1.subtract(bi2));
		System.out.println(bi1.mod(new BigInteger("2")));
		
		/*
		BigInteger bi;
		BigDecimal bd;
		
		bi = new BigInteger("9223372036854775808");
		long lNum = 9223372036854775807L;
		System.out.println(lNum);
		*/
	}

}
