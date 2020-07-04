
public class Binary {
	public static void main(String[] args){
//		二进制数0B或者0b开头
		System.out.println("二进制:" + Integer.toBinaryString(0B10010));
//		8进制数据0开头，转成二进制字符串输出
		System.out.println("二进制:" + Integer.toBinaryString(010));
		System.out.println("二进制:" + Integer.toBinaryString(8));
//		16进制数,0X或者0x开头转成二进制字符串输出
		System.out.println("二进制:" + Integer.toBinaryString(0x100));
		System.out.println("\u4E2D");
		System.out.println("\u0061");
		char a = '中';
		char b = 'a';
//		一个字符在unicode中的值
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
//		整数默认int类型
		byte d = 1;
//		小数默认double类型
		float e = (float)3.24;
		int f = 0b10101010100001;
		System.out.println(f);
//		用下滑线区使容易看出位数，整形和浮点型均可
		int g = 123_456_789;
//		++在后则先赋值，再加1，++在前则先加1再赋值
		int h = 1;
		int i = (h++);
		System.out.println(h);
		System.out.println(i);
//		&&短路与，||短路或 ,(^异或，a^b,相同false;不同true)
		String dd = "hi𝕆pt";
		String aa = "hi𝕆";
		String oo = "hio";
//		System.out.println(dd.length());//4
//        System.out.println(dd.codePointCount(0, dd.length()));//3
//        System.out.println(oo.length());//3
//        System.out.println(oo.codePointCount(0, oo.length()));//3
        
        int length = aa.length();
        for(int j=0;j<length;j++) {
            char charAt = aa.charAt(j);
            System.out.println(charAt+".......");
            System.out.println(Integer.toHexString(charAt)+"------");
        }
        int codePointCount = aa.codePointCount(0, length);
        for(int j=0;j<codePointCount;j++) {
            int codePoint = aa.codePointAt(j);
            System.out.println(Integer.toHexString(codePoint)+"=======");
        }
        //偏移字符的索引数，因为辅助字符不止两个字节
        int cp = dd.offsetByCodePoints(0, 2);
        int ss = dd.codePointAt(cp);
        
        System.out.println("\u0070");
        System.out.println(Integer.toHexString(ss));
        
        char t = '?';
        System.out.println(Integer.toHexString(t));
        
        int[] codePoints = { 0x1d546 };
        String strs = new String(codePoints,0,codePoints.length);
        System.out.println(strs);
        
        String jsjd = "111111";
        String sdfsf = new String(jsjd);
        String tttt = jsjd;
        System.out.println(jsjd == sdfsf);
        System.out.println(tttt == jsjd);
        

	}

}
