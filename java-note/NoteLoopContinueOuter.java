
public class NoteLoopContinueOuter {
	public static void main(String[] args){
		outer:
		for(int i=0;i<10;i++){
			System.out.println("����i��ֵ----------��"+i);
			for(int j=0;j<10;j++){
				if(j==5){
					continue outer;
				}
				System.out.println("����j��ֵ��"+j);
			}
			
		}
	}

}
