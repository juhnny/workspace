import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		
		//������ �о �ٸ� ���Ͽ� �ٷ� �����ϴ� �ǽ�
		
		//���� ������ ��ο� ���ϸ�.Ȯ����
		File srcFile = new File("D:/testDir/abc.txt");
		//�����Ϸ��� ������ ��ο� ���ϸ�.Ȯ����
		File path = new File("D:/testDir/copy");
		if( !path.isDirectory()) path.mkdirs();
		File dstFile = new File(path, "abc(1).txt");
		
		try {
			FileInputStream fis = new FileInputStream(srcFile); //��ǲ ��Ʈ��
			FileOutputStream fos = new FileOutputStream(dstFile); //�ƿ�ǲ ��Ʈ��
			
			byte b = (byte)fis.read(); //1 byte�� �޾Ƽ�
			fos.write(b);	//1 byte�� �Է�
			
			b = (byte)fis.read();
			fos.write(b);
			
			while(true) {
				b = (byte)fis.read();
				if(b == -1) break;
				fos.write(b);
			}
			
			fos.flush();
			//��Ʈ�� ����� �������� �ݱ�
			fis.close();
			fos.close();
			
			System.out.println("���� ���� ����");
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
