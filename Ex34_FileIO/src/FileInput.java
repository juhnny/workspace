import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
	
	public static void main(String[] args) {
		
		File file1 = new File("bbb.txt"); //������� ������ 
		
		//���ϰ� �������ִ� �������ε�(Stream) �����
		//Stream �߿����� Input Stream, �� �߿����� ���Ͽ����� ������� FileInputStream ���
		try {
			FileInputStream fis = new FileInputStream(file1);
			byte s = (byte)fis.read(); //int���� ���������� 1 byte ������ ��� �ִ�. �ѱ��� 2����Ʈ�ϱ� �ݾ� �ɰ��� �´�.
										//read()�� ���Ͽ� ���� ������ �� ����, ������ -1�� ����
										//char�� �����ϸ� �������� FileInputStream�� ���� ������ �ƴϴ�. 
										//char�� ���Ѵٸ� ���ڸ� ���� ������� ���� ��Ʈ������ ����.
			if(s != -1) System.out.println(s); //���� ������ ����Ʈ�ض�
			
			s = (byte)fis.read(); //read()�� ��� ����ϸ� ��� �� ����Ʈ�� �ɰ��� �����´�.
			if(s != -1) System.out.println(s); //���� ������ ����Ʈ�ض�
			
			//�ݺ��� ���
			s = (byte)fis.read();
			while(s != -1) {
				System.out.print((char)s);
				s = (byte)fis.read();
			}
			
			System.out.println("\n�о���� �Ϸ�");
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.println("�о���� �������� ������ �߻��߽��ϴ�");
		}
		
		
		
		
	}
}
