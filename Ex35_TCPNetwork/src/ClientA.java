import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientA {

	public static void main(String[] args) {
		
		//MyServer에서 ServerSocket 객체를 만들어 serverSocket.accept()까지 작성 후 클라이언트 프로그램 작성
		//클라이언트는 서버의 IP 주소, port 번호를 알아야 접속 가능
		
		String serverIP = "192.168.0.2"; //IPv4 주소는 ISP 사업자가 나한테 할당한 IP가 달라지면 바뀔 수 있다.
		String serverIP2 = "127.0.0.1"; //Loopback address도 사용 가능. 현재 디바이스를 가리키는 특별한 IP 주소
		String serverIP3 = "localhost"; //현재 디바이스를 가리키는 도메인
		
		//1. 서버와 연결할 Socket 생성
		try {
			Socket socket = new Socket(serverIP, 10001); //소켓 생성 시도가 바로 서버 연결 시도
			System.out.println("서버와의 연결에 성공했습니다.");
			
			//2. 서버와의 사이에 Stream 생성
			//데이터를 내보내는 스트림: Socket에게 요청
			OutputStream os = socket.getOutputStream();
			//바이트 스트림은 문자 사용에는 불편
			//PrintWriter를 사용하면 바이트 스트림을 문자 스트림으로, 문자 스트림을 보조 스트림으로 연결
			PrintWriter writer = new PrintWriter(os);
			Scanner scan = new Scanner(System.in);
			
			System.out.print("보낼 메세지 입력: ");
			String msg = scan.nextLine();
			writer.println(msg);
			writer.flush();
			
			//반복하려면
			while(true) {
				System.out.print("보낼 메세지 입력: ");
				msg = scan.nextLine();
				if(msg.equalsIgnoreCase("quit")) break; //"quit" 쓰면 종료되도록
				writer.println(msg);
				writer.flush(); //flush는 메시지 한 단위마다 써준다고 보면 된다.
			}
			
			writer.close();
			
			System.out.println("메세지 전송 완료");
		} catch (UnknownHostException e) { 
			System.out.println("서버의 위치를 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("서버와 통신이 불가능합니다.");
		}
		
		
	}
}
