
public class FinalParameter {
	public static void main(String[] args){
		final int a = 3;
//		���ܱ���ֵ
//		a = 8;
		final int c;
		c = 9;
//		���ܱ���ֵ
//		c = 10;
		final String str = "���ԣ�"+"99";
		final String str2 = "���ԣ�"+String.valueOf(99);
		System.out.println(str == "���ԣ�99");
		System.out.println(str2 == "���ԣ�99");
		System.out.println("���ԣ�99" == "���ԣ�99");
	}

}
