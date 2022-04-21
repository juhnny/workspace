import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOut {
	
	public static void main(String[] args) {
		
		//�����͸� HDD�� File�� �����غ���
		//File ������ ���� Ŭ���� ��ü���� ����
		//���(path)�� �������� ������ �⺻ ��δ� ���� ������Ʈ ����
		File file = new File("aaa.txt");
		
		//�� ��α��� ����Ǵ� �������ε�(Stream) ��������� ��
		//Stream�� �߿����� OutputStream, �� �߿����� ������ �������� �ɷ��� ���� FileOutputStream Ŭ������ ���
		try {
			//aaa.txt��� ������ ������ FileOutputStream�� �ڵ����� ������. ��, ������ �ڵ����� �������� ����
			//�ش� ������ ������ ���
			FileOutputStream fos = new FileOutputStream(file);
			//����-����-�ݰ�
			fos.write(65); //������ �������� �����ڵ尪: 'A'
							//fos.write()�� int Ȥ�� byte[]�� �μ��� ����
							//int�� ������ �� ���� �� ����(�����ڵ�)�� ����
			fos.flush(); //Stream ���ۿ� ��Ⱑ �������� �� �־ ��쵵�� �ϴ� �޼ҵ�. ���ֱ⸦ ����.
			fos.close(); //������ ��Ʈ�� �۾��� ������ ��Ʈ���� �ݴ� �۾� ����. �� �ص� �ü���� �ݾ������� ���ֱ⸦ ����
			
			System.out.println("���� ���� ����");
		} catch (FileNotFoundException e) { //new FileOutputStream(file)�� ���� ���� ó��. 
			e.printStackTrace();
		} catch (IOException e) { //.write() �޼ҵ��� ���� ó��
			e.printStackTrace();
		}
		
		//�� ����� 1 byte�� �����͸� �������⿡ �ݺ����� �ʿ���
		//�̹��� byte[] �迭�� �ѹ��� ���ڿ��� �־��
		//String ��ü���� ������ ���ڿ��� byte[]�� ��ȯ���ִ� �޼ҵ尡 ����
		FileOutputStream fos2;
		try {
			fos2 = new FileOutputStream(new File("bbb.txt"), true); //�ι�° �Ķ���͸� ���� append�� ������ ����Ⱑ �ƴ� �̾�� ����
			byte[] bytes = "Apple".getBytes();
			fos2.write(bytes);
			fos2.write(("Orange"+"\n").getBytes()); //append�� true�̹Ƿ� ����� �� �ƴ϶� �߰��ȴ�.
			
			fos2.flush(); //flush()�� ���� ���(write()�����)�� ������ �ʾƼ� ��Ʈ���� �����Ͱ� �������� ��� �� ��ɵ��� ������ ó���ϵ��� �ϰ� ��Ʈ���� ����.
			fos2.close();
			System.out.println("���� ���� �߰� ����");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//��θ� �� �߰��غ���
		//������ ���б�ȣ�� �ü������ �ٸ�
		//windows�� ��������(\)�� �ǰ� �����õ� ��(/)
		//mac, linux�� �����ø�(/) ��
		//File file= new File("xxx\\aaa.txt");//�������ô� 2���� �����[Ư�����ڷ� �ν���]
		File file2= new File("xxx/yyy/aaa.txt"); //�����ø� �� ��ȣ��
		//��λ��� ���丮�� ���ٸ� ���丮 ����
		if(!file2.isDirectory()) {
			file2.mkdirs();
			//file2.mkdir(); //.mkdir()�� ��λ� ���� ������ �ϳ��� ����. .mkdirs()�� ���� ����
			System.out.println("���丮 ����");
		}
		//�ٵ� .mkdir()�� aaa.txt���� ���������� �ν��ؼ� ������ ����
		
		//��ο� ���ϸ��� ���� ������ִ� �� �Ϲ���. ���߿� ��θ� �����ϱ⵵ ����.
		File path = new File("xxx/yyy");
		//isFile() - ������ ��ΰ� �����̸� true
		//isDirectory() - ������ ��ΰ� ������ true
		//exists() - ������ ��ο� ���� Ȥ�� ������ �����ϸ� true
		if(!path.exists()) path.mkdirs(); //exitst()�� ���� ���� ��
		File file3 = new File(path, "bbb.txt");
		
	}
}
