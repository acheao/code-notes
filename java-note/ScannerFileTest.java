import java.io.File;
import java.util.Scanner;

public class ScannerFileTest {
	public static void main(String[] args) throws Exception{
//		����·��
		Scanner sc = new Scanner(new File("E:\\Users\\linc\\workspace\\java-note\\src\\ScannerLongTest.java"));
		System.out.println("The content ScannerLongTest.java file is:");
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		
//		���·��
		Scanner sc1 = new Scanner(new File("src/ScannerLongTest.java"));
		System.out.println("The content ScannerLongTest.java file is:");
		while(sc1.hasNextLine()){
			System.out.println(sc1.nextLine());
		}
		
	}

}
