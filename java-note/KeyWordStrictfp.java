
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
		boolean ���ı����� = false;
		System.out.println(���ı�����);
		boolean g = Character.isJavaIdentifierPart(';');
		boolean f = Character.isJavaIdentifierPart(50);
		System.out.println(g);
		System.out.println(f);
		byte c = (byte)300;
		//������Χ��c��ֵΪ44
		System.out.println(c);
		int i =7;
		int j = 2*i++;
		//j��ֵΪ14��iΪ8
		System.out.println(j);
		System.out.println(i);
		//m��ֵΪ16,nΪ8
		int n = 7;
		int m = 2*++n;
		System.out.println(m);
		System.out.println(n);
		
		String d = null;
		if(d != null && d.equals("")){
			
		}
	}
	/**
	 * strictfp
	 * StrictMath
	 * double>flaot>long>int
	 * +=
	 * -=
	 * &&��·,&�Ƕ�·
	 */
	public static strictfp void calculation(){
		
	}

}
