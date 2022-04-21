import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientA {

	public static void main(String[] args) {
		
		//MyServer���� ServerSocket ��ü�� ����� serverSocket.accept()���� �ۼ� �� Ŭ���̾�Ʈ ���α׷� �ۼ�
		//Ŭ���̾�Ʈ�� ������ IP �ּ�, port ��ȣ�� �˾ƾ� ���� ����
		
		String serverIP = "192.168.0.2"; //IPv4 �ּҴ� ISP ����ڰ� ������ �Ҵ��� IP�� �޶����� �ٲ� �� �ִ�.
		String serverIP2 = "127.0.0.1"; //Loopback address�� ��� ����. ���� ����̽��� ����Ű�� Ư���� IP �ּ�
		String serverIP3 = "localhost"; //���� ����̽��� ����Ű�� ������
		
		//1. ������ ������ Socket ����
		try {
			Socket socket = new Socket(serverIP, 10001); //���� ���� �õ��� �ٷ� ���� ���� �õ�
			System.out.println("�������� ���ῡ �����߽��ϴ�.");
			
			//2. �������� ���̿� Stream ����
			//�����͸� �������� ��Ʈ��: Socket���� ��û
			OutputStream os = socket.getOutputStream();
			//����Ʈ ��Ʈ���� ���� ��뿡�� ����
			//PrintWriter�� ����ϸ� ����Ʈ ��Ʈ���� ���� ��Ʈ������, ���� ��Ʈ���� ���� ��Ʈ������ ����
			PrintWriter writer = new PrintWriter(os);
			Scanner scan = new Scanner(System.in);
			
			System.out.print("���� �޼��� �Է�: ");
			String msg = scan.nextLine();
			writer.println(msg);
			writer.flush();
			
			//�ݺ��Ϸ���
			while(true) {
				System.out.print("���� �޼��� �Է�: ");
				msg = scan.nextLine();
				if(msg.equalsIgnoreCase("quit")) break; //"quit" ���� ����ǵ���
				writer.println(msg);
				writer.flush(); //flush�� �޽��� �� �������� ���شٰ� ���� �ȴ�.
			}
			
			writer.close();
			
			System.out.println("�޼��� ���� �Ϸ�");
		} catch (UnknownHostException e) { 
			System.out.println("������ ��ġ�� ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("������ ����� �Ұ����մϴ�.");
		}
		
		
	}
}
