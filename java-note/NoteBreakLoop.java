
public class NoteBreakLoop {
	public static void main(String[] args){
		outer:
		for(int i=0;i<10;i++){
			System.out.println("i��ֵΪ��"+i);
			for(int j=0;j<10;j++){
				if(j==3){
					break outer;
				}
				System.out.println("j��ֵΪ��"+j);
			}
		}
	}

}
