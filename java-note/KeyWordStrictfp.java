
public class KeyWordStrictfp {
	
	public static void main(String[] args){
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);	
		}
		System.out.println(2.1-1.2);
		char a = 'A';
		char b = 65;
		System.out.println(a);
		System.out.println(b);
		boolean �����ַ����� = false;
		System.out.println(�����ַ�����);
		boolean g = Character.isJavaIdentifierPart(';');
		boolean f = Character.isJavaIdentifierPart(50);
		System.out.println(g);
		System.out.println(f);
		byte c = (byte)300;
		//c��ֵΪ44
		System.out.println(c);
		int i =7;
		int j = 2*i++;
		//j��ֵΪ14��i��ֵΪ8
		System.out.println(j);
		System.out.println(i);
		//m��ֵΪ16,n��ֵΪ8
		int n = 7;
		int m = 2*++n;
		System.out.println(m);
		System.out.println(n);	
		String d = null;
		if(d != null && d.equals("")){
			
		}
		
		String hello = "A";
		String word = "666";
		String hi = "hi";
		int ha = 1;
		String all = String.join(",", "A", "B", "C", "D", "E");
		System.out.println(all);
		String hw = "hello word";
		int index = hw.offsetByCodePoints(1, 3);
		System.out.println(index);
		int cp = hw.codePointAt(index);
		char four = hw.charAt(4);
		System.out.println(four);
		System.out.println(cp);
		int[] codePoints =  hw.codePoints().toArray();
		String test = new String(codePoints,0,codePoints.length);
		System.out.println(test);
		//�죬���̲߳���ȫ
		StringBuilder str = new StringBuilder();
		str.append("ssss");
		//�̰߳�ȫ
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("11111111");		
	}
	/**
	 * strictfp
	 * StrictMath
	 * double>flaot>long>int
	 * +=
	 * -=
	 * &&��·��,&�Ƕ�·��
	 * a+=b+=c�ȼ���a+=(b+=c)
	 * instanceof
	 * String���ɱ��ַ���
	 */
	public static strictfp void calculation(){
		
	}
	public static int bigNumber(int a,int b){
		int c = a<b?a:b;
		return c;   
		
	} 

}
