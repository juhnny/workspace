import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CharacterIO {

	public static void main(String[] args) {
		
		//���� ��Ʈ�� character stream �� �̿��� ���� ����� ���α׷�
		
		//����ڷκ��� ���������� �Է¹޾� ���Ͽ� �����ϱ�
		Scanner scan = new Scanner(System.in);
		
		//����ڰ� "no"��� �۾��� �Է��� ������ �ݺ������� ���ڿ� �Է¹ޱ�
		String fileName;
		//����ڿ��� ���� �̸� �Է¹ޱ�
		System.out.print("������ ���� �̸��� �Է��ϼ���: ");
		fileName = scan.next();
		//��� ����
		File path = new File("testFiles"); //������Ʈ ���� �ȿ� �� ���丮 ����
		if( !path.exists()) path.mkdirs();
		File file = new File(path, fileName+".txt");
		
		
		while(true) {
			System.out.print("������ �ܾ� �Է�(no �Է� �� ����): ");
			String s = scan.next();	
			if(s.equalsIgnoreCase("no")) break; //equalsIgnoreCase() - ��ҹ��� ���о��� ���ڿ� ��
			
			//�̹��� byte ������ �а� ���� byte stream ��� 
			//character(2 bytes) ������ �а� ���� character stream�� ����غ���
			//Character Stream �� File Writer�� Print Writer�� ����غ���
			try {
				FileWriter fw = new FileWriter(file, true); //true�� ���̸� ����� ��� �̾� ����
				//�Ʒ� ����� �⺻���� FileWriter�� ����
				//������ FileWriter ��ü�����δ� �ܾ� �����̳� Ư�� format���� �������� �� ����.
//				fw.write(s+"\n"); 
//				fw.flush();
//				fw.close();
				
				//�׷��� System.out.print()ó�� ������ ����� �� �ְ� �� ���� ��Ʈ���� PrintWriter
				//print()�� �ϵ� �ܼ�â�� �ƴ� ���Ϸ� ����� �ȴٰ� �����ϸ� ��
				PrintWriter writer = new PrintWriter(fw);
//				writer.print("Nice "+2+" meet you. ");
				writer.println(s);
				writer.flush();
				writer.close(); //������Ʈ���� ������ �� ��Ʈ���� ���� ����. ���� ���� �ݾƵ� ��� ����.
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//while
		System.out.println("���� �Ϸ�");
		
		
		
		//���� ������ ������ �о�ͺ���
		System.out.println("\n---------------------------");
		System.out.println("        ������ ���� �о����");
		System.out.println("---------------------------\n");
		
		//�о�� ���� �����͸� ��� ��ƾ� ����� �� �ִ�.
		//ArrayList�� �����ؼ� ��Ծ��
		ArrayList<String> data = new ArrayList<>();
		
		//Character Stream �� File Reader�� BufferedReader�� ����غ���
		try {
			FileReader fr = new FileReader(file);
			
			int c = fr.read(); //�� ���ھ� �о����(���� 1 byte, �ѱ� 2~3 byte�� �о���. ���� �˾Ƽ� ����Ʈ���� �����Ǿ� �о���.)
			System.out.println(c); 
			//�� ����� �ѱ��ھ� �б� ������ ������.
			
			//�׷��� �о���̴� �۾��� ���ݴ� ���� ������ �������ִ� ��Ʈ���� ������
			//�� �߿��� ���� ���� �ֿ�Ǵ� BufferedReader�� ���
			//BufferedReader�� ������ ���ڿ����� ��� ���� �о ������ ����.
			//�׷��⿡ �� BufferedReader���� �� �پ� ���ڿ��� �޶�� ��û�� �� ����.
			BufferedReader reader = new BufferedReader(fr); //�μ��� ���ڿ��� �о�� Reader�� �־���
			//�� �پ� �о���̱� ������. 
			while(true) {
				String line = reader.readLine(); //���� ���� �б�
				if(line == null) break; //�о���� String�� �� �̻� ������
				
				data.add(line); //ArrayList�� ����
			}
			
			System.out.println("����� ���ڿ��� ����: "+data.size());
			System.out.println(data);
			
			reader.close(); //��Ʈ�� �ݱ�
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����");
		
		
		
	}
}
