import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiverA {

	public static void main(String[] args) {
		
		try {
			//1. 우체통부터 만들기
			//UDP에는 ServerSocket이 따로 없이 바로 Socket 사용
			DatagramSocket socket = new DatagramSocket(10002);
			
			//2. 우편의 내용물을 담아둘 빈 박스가 필요
			byte[] buf = new byte[1024]; //1024칸짜리 빈 박스
			//내용물을 내 박스로 옮겨담기
			DatagramPacket packet = new DatagramPacket(buf, 1024); //받은 데이터를 buf에 넣어줌
			//DatagramPacket packet = new DatagramPacket(buf, 3); //첫 3 바이트만 읽어옴
			//DatagramPacket packet = new DatagramPacket(buf, 1, 2); //offset 1 추가. 2 바이트 가져오고 1 바이트 건너뜀
			
			//3. 내용물의 배송을 기다리기. 
			System.out.println("메시지를 기다립니다.");
			socket.receive(packet); //데이터를 받을 때까지 커서가 여기서 대기. 받으면 buf에 담김.
			
			//4. buf(바이트 배열)에 담긴 내용물을 사용한다.
			String s = new String(buf); //byte 배열을 String으로 변환
			System.out.println("받은 메시지: "+ s);
			
			//추가로 더 받아보자.
			socket.receive(packet);
			s = new String(new byte[] {65, 66, 67});
			System.out.println("받은 메시지: "+ s);
		
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
