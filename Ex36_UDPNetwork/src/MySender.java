import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MySender {

	public static void main(String[] args) {
		
		//UDP user datagram protocol
		//���� ������ ��İ� ����
		//TCP�� Server-Client�� UDP������ Receiver-Sender

		try {
			//1. ������ ���� ��ü��(DatagramSocket)�� �ʿ�
			//���ù��� ��ü���� �� �ʿ��ϰ� ������ �����͸� ���� ���� ���ٸ� ���� �ʿ� ����.
			DatagramSocket socket = new DatagramSocket();
			
			//���� ������(msg)�� ����ڷκ��� �Է¹ޱ�
			Scanner scan = new Scanner(System.in);
			System.out.print("���� ������: ");
			String msg = scan.nextLine();
			
			//2. ���� �����͸� ���� ���Ŀ� �°� �����. 
			//���� ����� �ּҰ� ��� ���� �����
			InetAddress addr = InetAddress.getByName("192.168.0.2");
			//���Ǹ� �ù踦 ���� �� ������ �ù� �ڽ��� �����ؼ� ����� port��ȣ�� �Բ� �Ἥ ������.
			//(����Ʈ �迭, ��Ŷ ����, IP �ּ�, port ��ȣ)
//			DatagramPacket packet = new DatagramPacket(msg.getBytes(), 10, addr, 10002); //��Ŷ���� 10 ����Ʈ�� ������
			DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10002); //��Ŷ���� �޽��� ���̸�ŭ ������
			
			//3. ��ü���� ���� ����������
			socket.send(packet);
			
			//�߰��� �� ��������
			msg = "abc";
			packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10002);
			socket.send(packet);
			
			System.out.println("���ۿϷ�");

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
