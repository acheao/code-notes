
public class NoteChangeParameter {
	public static void main(String[] args){
		test(2,"����Ԫ��1","����Ԫ��2","����Ԫ��3");
	}
	
	public static void test(int a,String ... strings){
		System.out.println("the value is:"+a);
		for(String s : strings){
			System.out.println(s);
		}
	}

}
