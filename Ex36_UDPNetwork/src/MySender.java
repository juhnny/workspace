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
		//소포 보내는 방식과 유사
		//TCP의 Server-Client가 UDP에서는 Receiver-Sender

		try {
			//1. 소포를 보낼 우체통(DatagramSocket)이 필요
			//리시버는 우체통이 꼭 필요하고 센더는 데이터를 받을 일이 없다면 굳이 필요 없다.
			DatagramSocket socket = new DatagramSocket();
			
			//보낼 데이터(msg)를 사용자로부터 입력받기
			Scanner scan = new Scanner(System.in);
			System.out.print("보낼 데이터: ");
			String msg = scan.nextLine();
			
			//2. 보낼 데이터를 소포 형식에 맞게 만들기. 
			//받을 사람의 주소가 담긴 송장 만들기
			InetAddress addr = InetAddress.getByName("192.168.0.2");
			//물건만 택배를 보낼 수 없으니 택배 박스로 포장해서 송장과 port번호를 함께 써서 보낸다.
			//(바이트 배열, 패킷 길이, IP 주소, port 번호)
//			DatagramPacket packet = new DatagramPacket(msg.getBytes(), 10, addr, 10002); //패킷으로 10 바이트만 보내짐
			DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10002); //패킷으로 메시지 길이만큼 보내짐
			
			//3. 우체통을 통해 소포보내기
			socket.send(packet);
			
			//추가로 더 보내보자
			msg = "abc";
			packet = new DatagramPacket(msg.getBytes(), msg.getBytes().length, addr, 10002);
			socket.send(packet);
			
			System.out.println("전송완료");

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
