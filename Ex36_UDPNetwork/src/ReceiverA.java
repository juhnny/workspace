import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiverA {

	public static void main(String[] args) {
		
		try {
			//1. ��ü����� �����
			//UDP���� ServerSocket�� ���� ���� �ٷ� Socket ���
			DatagramSocket socket = new DatagramSocket(10002);
			
			//2. ������ ���빰�� ��Ƶ� �� �ڽ��� �ʿ�
			byte[] buf = new byte[1024]; //1024ĭ¥�� �� �ڽ�
			//���빰�� �� �ڽ��� �Űܴ��
			DatagramPacket packet = new DatagramPacket(buf, 1024); //���� �����͸� buf�� �־���
			//DatagramPacket packet = new DatagramPacket(buf, 3); //ù 3 ����Ʈ�� �о��
			//DatagramPacket packet = new DatagramPacket(buf, 1, 2); //offset 1 �߰�. 2 ����Ʈ �������� 1 ����Ʈ �ǳʶ�
			
			//3. ���빰�� ����� ��ٸ���. 
			System.out.println("�޽����� ��ٸ��ϴ�.");
			socket.receive(packet); //�����͸� ���� ������ Ŀ���� ���⼭ ���. ������ buf�� ���.
			
			//4. buf(����Ʈ �迭)�� ��� ���빰�� ����Ѵ�.
			String s = new String(buf); //byte �迭�� String���� ��ȯ
			System.out.println("���� �޽���: "+ s);
			
			//�߰��� �� �޾ƺ���.
			socket.receive(packet);
			s = new String(new byte[] {65, 66, 67});
			System.out.println("���� �޽���: "+ s);
		
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
