public class StringTest1 {

	public static void main(String[] args) throws Exception{
		String str = "가나다123";
		byte[] eucBuf = str.getBytes("euc-kr");
		byte[] utfBuf = str.getBytes("utf-8");
		String eucStr = new String(eucBuf);
		String utfStr = new String(utfBuf, "utf-8");
		System.out.println("eucStr : " + eucStr);
		System.out.println("utfStr : " + utfStr);
		
		/*
		char[] cStr = str.toCharArray();
		String temp = new String(cStr);
		System.out.println("cStr : " + temp);
		byte[] bStr = str.getBytes();
		temp = new String(bStr);
		System.out.println("bStr : " + temp);
		
		/*
		String str = "abc가123";
		System.out.println(str.length());
		char[] cArr = str.toCharArray();
		System.out.println(Arrays.toString(cArr));
		byte[] bArr = str.getBytes();
		System.out.println(bArr.length + " : " + Arrays.toString(bArr));
		char ch = '가';
		System.out.println((int)ch);
		
		/*
		String sNum = "127 ";
		int iNum;
		try {
			iNum = Integer.parseInt(sNum.trim());
			System.out.println("iNum : " + iNum);	
		}catch(Exception e) {
			System.out.println("err : " + e.toString());
		}
		System.out.println("program end");
		
		/*
		String str = "test.jsp";
//		String str = "aa:bb:cc:";
		String[] strs = str.split(".");
		System.out.println("size : " + strs.length);
		
		/*
		System.out.println("len : " + str.length());
		
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		int iLen = str.length();
		for(int i = 0; i < iLen; i++) {
			System.out.println(str.charAt(i));
		}
		
		/*
		String str = "aa:bb:cc";
		String key = ":";
		System.out.println(str.indexOf(":"));
		System.out.println(str.indexOf(key));
		System.out.println(str.indexOf(key, 3));
		System.out.println(str.lastIndexOf(key));
		int idx = 0;
		while(true) {
			idx = str.indexOf(key, idx);
			if(idx == -1) {
				break;
			}
			idx++;
		}
		
		/*
		String str = "0123456789";
		System.out.println(str.charAt(3));
		System.out.println(str.substring(3, 5));
		
		/*
		String str1 = "hong";
		String str2 = "hong";
		String str3 = new String("hong");
		String str4 = new String("hong");
		System.out.println("1 == 2 : " + (str1 == str2));
		System.out.println("1 == 3 : " + (str1 == str3));
		System.out.println("1 equals 2 : " + str1.equals(str2));
		System.out.println("1 equals 3 : " + str1.equals(str3));
		StringBuffer sb1;
		StringBuilder sb2;
		StringTokenizer sb3;
		*/
	}

}
