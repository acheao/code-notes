package SM4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestExcel {
	public static void main(String[] args){
//		encryption();
		decrypt();
		
	}
	
	
	public static void decrypt(){
		FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] key={0x01,0x23,0x45,0x67,(byte) 0x89,(byte) 0xab,(byte) 0xcd,(byte) 0xef,(byte) 0xfe,(byte) 0xdc,(byte) 0xba,(byte) 0x98,0x76,0x54,0x32,0x10};
		SMS4 sm4=new SMS4();
		int inLen=16,ENCRYPT=1,DECRYPT=0,inlen1=32;
        try {
            fis = new FileInputStream("C:\\Users\\linc\\Desktop\\model\\encryption\\ACE54654544843742398.xls");
            // Ȼ���ٴ����������д�뱾��
            // ������Ҳ����һ��������ó�ÿ�μ��ܵĿ�Ĵ�С�����������С����������
            byte data[] = new byte[16];
            byte out[] = new byte[16];
            byte in[] = new byte[16];
            // �������Ҫ�����Ŀ¼
            fos = new FileOutputStream("C:\\Users\\linc\\Desktop\\model\\decrypt\\ACE54654544843742398.xls");
            // ���ڱ���Ƿ��Ƕ�ȡ���ļ���ĩβ�ˣ�
            // �ڶ�����ֽ������棬ʹ��ĳЩ��ȡ���������Է���ÿ�ζ�ȡ���ֽ�����
            // ��������ļ��Ľ�β�������ٶ�ȡ�����ݣ��ͷ���-1
            int len = -1;
            // �����ݽ��ж��뵽ָ����С�Ļ���飬ֱ����ȡ���ļ��Ľ���Ϊֹ
            while (-1 != (len = fis.read(data))) {
            	if(len != 16){
            		in = data;
            	}else{
            		System.out.println(Arrays.toString(data)+"����");
            		sm4.sms4(data, inLen, key, in, DECRYPT);
            		System.out.println(Arrays.toString(in)+"����");
            	}
            	
                fos.write(in, 0, len);
                // ��������ܹ�д��ֱ������������д�룬
                // ������Ҫ�ȵ��ر�����������ʱ�䣩ʱ�����д��
                fos.flush();
            }
            // �ر��ļ������������
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	
	public static  void encryption(){
		FileInputStream fis = null;
        FileOutputStream fos = null;
        byte[] key={0x01,0x23,0x45,0x67,(byte) 0x89,(byte) 0xab,(byte) 0xcd,(byte) 0xef,(byte) 0xfe,(byte) 0xdc,(byte) 0xba,(byte) 0x98,0x76,0x54,0x32,0x10};
		SMS4 sm4=new SMS4();
		int inLen=16,ENCRYPT=1,DECRYPT=0,inlen1=32;
        try {
            fis = new FileInputStream("C:\\Users\\linc\\Desktop\\model\\origin\\ACE54654544843742398.xls");
            // Ȼ���ٴ����������д�뱾��
            // ������Ҳ����һ��������ó�ÿ�μ��ܵĿ�Ĵ�С�����������С����������
            byte data[] = new byte[16];
            byte out[] = new byte[16];
            byte in[] = new byte[16];
            // �������Ҫ�����Ŀ¼
            fos = new FileOutputStream("C:\\Users\\linc\\Desktop\\model\\encryption\\ACE54654544843742398.xls");
            // ���ڱ���Ƿ��Ƕ�ȡ���ļ���ĩβ�ˣ�
            // �ڶ�����ֽ������棬ʹ��ĳЩ��ȡ���������Է���ÿ�ζ�ȡ���ֽ�����
            // ��������ļ��Ľ�β�������ٶ�ȡ�����ݣ��ͷ���-1
            int len = -1;
            // �����ݽ��ж��뵽ָ����С�Ļ���飬ֱ����ȡ���ļ��Ľ���Ϊֹ
            while (-1 != (len = fis.read(data))) {
            	
            	if(len != 16){
            		out = data;
            		
            	}else{
            		System.out.println(Arrays.toString(data)+"ԭʼ");
            		sm4.sms4(data, inLen, key, out, ENCRYPT);
            		System.out.println(Arrays.toString(out)+"����");
            	}
                fos.write(out, 0, len);
                // ��������ܹ�д��ֱ������������д�룬
                // ������Ҫ�ȵ��ر�����������ʱ�䣩ʱ�����д��
                fos.flush();
            }
            // �ر��ļ������������
            fis.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	
	

}
