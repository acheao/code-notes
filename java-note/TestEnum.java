
public class TestEnum {
	public static void main(String[] args){
		for(Season s:Season.values()){
			System.out.println(s);
		}
		new TestEnum().judge(Season.SPRING);
		
	}
	
	public static void judge(Season s){
		switch(s){
			case SPRING:
				System.out.println("���죬spring");
				break;
			case SUMMEER:
				System.out.println("���죬summer");
				break;
			case FALL:
				System.out.println("���죬FALL");
				break;
			case WINTER:
				System.out.println("���죬WINTER");
				break;
		}
	}

}
