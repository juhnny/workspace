import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyServer {

	public static void main(String[] args) {
		
		//��� �Ծ�(Protocol)
		//������ �ְ�������� ���� ������ ���� ������ ������ ���ƾ� �Ѵ�. 
		//��ȭ�� �ߴµ� ������ �������� ���� ��ȯ�� �� ���� ����.

		//- Internet Protocol; IP v1 ~ v6
		//�� ���ӵ��� �ʰ� ���� ���
		//4 ����Ʈ(1 int) ���. 0.0.0.0 ~ 255.255.255.255
		//2^32 = 42�� ���� ��ǻ�͸� ����ϰڴٰ� ����
		//�嵥 ���� ��, �ð�, IoT ������ IP�ּ� �ʿ�
		//���� �Ծ��� v4�� �θ� ���
		//���Ӱ� ���� �Ծ��� v6. �ּ� ������ 
		//v4, v6�� ȥ��ǰ� ����
		
		//������
		//���� ���ͳ� �ּ�(����)�� �ܿ�� �����Ƿ� ���� �� www.naver.com ���� ������ 
		//���������� �������� ġ�� DNS(Domain name server)�� ���ļ� ������ DB���� ���� �ּҸ� ã�� �������ش�.

		//- TCP; Transmission control protocol; ��ȭ�� ����
		//- UDP; User datagram protocol ; ������ ����
		//- SMTP; Simple mail transfer protocol; �̸��� �Ծ�
		//- FTP; File transfer protocol
		//- HTTP; Hyper text transfer protocol

		
		//-----------------------TCP ��Ʈ��ũ�� �Ẹ��-----------------------
		
		//TCP Network ; Transmission Control Protocol ���� ���� �Ծ�
		//��ȭ ��İ� ���. ���� ����� ����ϰ� �ִٴ� �� Ȯ�� �� �� �ִ�. ������ �ƴ��� �� �ƴ��� �� �� �ְ�, ������ ������ �� ��Ҹ��� ���޵� �Ŷ�� �� �� �� �ִ�.
		//������ ������� ������ ����� �̷����� �ʴ´�. ������ �������� ��ŵ� ��������.
		//��������� TCP ���
		//UDP
		//���� ��İ� ���. ������ �ϰ� ���� �� �̻� ������ �� �� ����. ������ ��ٸ��� �ʰ� �׳� ������ ������ ��. TCP���� �������� �ҿ���. 
		//�ǽð����� �߿��� ��Ʈ����, �¶��� ����, ���ͳ���ȭ ��� TCP�� �ŷڼ��� ���� ������ ���� ���� ������ �ϳ����� ���۸��� ����. 
		//�ѵ� �� �� ������ �ҽ��� �Ǵ��� �����͸� ���� ���� �� �ִ� ����� �ʿ�
		//�¶��� ���ӿ��� ĳ���� ��ǥ�� ������ ������ ������ ���. 
		
		//����� �Ϸ��� ������ IP �ּҸ� �ݵ�� �˾ƾ߸� ��
		//�ڹ� ���α׷��� ���۽�Ű�� ����̽��� IP�� �˷��ִ� ����� ���� Ŭ���� - InetAddress
		try {
			System.out.println(InetAddress.getLocalHost());
			System.out.println(InetAddress.getLocalHost().getHostName());
			System.out.println(InetAddress.getLocalHost().getHostAddress());
			//Loopback address�� 
			//����̽����� ����̽� �ڽ��� ���ͳ� �ּҸ� ������, �ϰ������� ǥ���ϱ� ���� ������ Ư���� IP�� 127.0.0.1
			//127.0.0.1�� ����Ű�� �������� localhost
			System.out.println(InetAddress.getLoopbackAddress()); //localhost/127.0.0.1
			System.out.println(InetAddress.getLoopbackAddress().getHostName()); //localhost
			System.out.println(InetAddress.getLoopbackAddress().getHostAddress()); //127.0.0.1
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		//IP�� ���ͳݿ��� �� ��ǻ���� ������ �ּ�
		//Port�� �� ��ǻ�� �������� ���α׷� �з� ��ȣ(65õ��). 0~1024������ �뵵(������ ���α׷����� ����)�� ������ �����Ƿ� ���� �� ��.
		//IP�� �ױ� �̸��̶�� port�� dock ��ȣ, �� ���� ����
		//1025~65õ �� ���̿����� �� ����� �ᵵ �ȴ�. ��, �ٸ� ���α׷��� �ߺ��Ǹ� ������ �� �� �ִ�.
		//port�� �ߺ��Ǵ��� ���ÿ� ��������� ������ ������ ���� �ʴ´�.
		
		System.out.println("-------------------------");
		
		//����-Ŭ���̾�Ʈ ���α׷� �ۼ�
		//������ ���α׷����� ���� ����(������ ����� ������)�� �������� ���
		//Ŭ���̾�Ʈ ���α׷����� ���� ��ü�� �����(������ IP �ּҿ� port ��ȣ �ʿ�). 
		//����� ���� �ʿ����� ���� ������ ���� ���� ��ü�� ���������. ������ ���ϵ� �������� ����� �� �ƴ϶� Ŭ���̾�Ʈ �ʿ��� ���� ��
		//������ ������ stream���� �����ִ� ��. TCP������ ���� ��ü��, HTTP������ URL ��ü�� stream�� �����ش�.
		
		//1. �������� ����
		try {
			ServerSocket serverSocket = new ServerSocket(10001); //�μ��� port ��ȣ �Է�
			System.out.println("�������� ���� �Ϸ�");
			
			//2. Ŭ���̾�Ʈ�� ���� ��ٸ���
			System.out.println("Ŭ���̾�Ʈ ���� ���...");
			Socket socket = serverSocket.accept(); //���⼭ Ŀ���� ���. ������ �����ٰ� ��ٷ� ���� �����ϴ� �� �ƴϴϱ�.
												//Ŭ���̾�Ʈ�� �����ϸ� �������� accept()�� Socket ��ü�� ����
			System.out.println("Ŭ���̾�Ʈ�� �����߽��ϴ�.");
			
			//3. �����͸� �ְ� ���� Stream �����
			InputStream is = socket.getInputStream();
			//����Ʈ ��Ʈ���� �� ����Ʈ�� �о���̴� ����. ���� ��Ʈ������ ��ȯ�ؼ� �������
			InputStreamReader isr = new InputStreamReader(is);
			//���ڽ�Ʈ���� �� ���ھ� �о���̴� ����. �� �پ� �ް� ������ ������Ʈ������ �ٽ� ��ȯ����
			BufferedReader reader = new BufferedReader(isr);
			
			//���� �ϳ��� �����͸� �о���̱�
			String msg = reader.readLine(); //Ŭ���̾�Ʈ�� �����͸� ���� ������ Ŀ�� ���
			System.out.println("���� ������: "+msg);
			
			//�ݺ��ؼ� �޾Ƶ��̱�
			while(true) {
				msg = reader.readLine(); //Ŭ���̾�Ʈ�� ��Ʈ���� close() �Ǹ� readLine()�� null�� ����
				if(msg == null) break;
				System.out.println("���� ������: "+msg);
			}
			
			reader.close();
			
			System.out.println("���� ��� ����");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
