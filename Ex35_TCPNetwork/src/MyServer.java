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
		
		//통신 규약(Protocol)
		//정보를 주고받으려면 가는 정보와 오는 정보의 형식이 같아야 한다. 
		//전화를 했는데 편지를 보내오면 정보 교환이 될 수가 없다.

		//- Internet Protocol; IP v1 ~ v6
		//언어에 종속되지 않게 숫자 사용
		//4 바이트(1 int) 사용. 0.0.0.0 ~ 255.255.255.255
		//2^32 = 42억 개의 컴퓨터면 충분하겠다고 생각
		//헌데 이제 폰, 시계, IoT 기기까지 IP주소 필요
		//기존 규약은 v4가 널리 사용
		//새롭게 만든 규약이 v6. 주소 형식은 
		//v4, v6가 혼용되고 있음
		
		//도메인
		//실제 인터넷 주소(숫자)를 외우기 어려우므로 만든 게 www.naver.com 같은 도메인 
		//브라우저에서 도메인을 치면 DNS(Domain name server)를 거쳐서 도메인 DB에서 실제 주소를 찾아 연결해준다.

		//- TCP; Transmission control protocol; 전화와 유사
		//- UDP; User datagram protocol ; 편지와 유사
		//- SMTP; Simple mail transfer protocol; 이메일 규약
		//- FTP; File transfer protocol
		//- HTTP; Hyper text transfer protocol

		
		//-----------------------TCP 네트워크를 써보자-----------------------
		
		//TCP Network ; Transmission Control Protocol 전송 제어 규약
		//전화 방식과 비슷. 내가 상대방과 통신하고 있다는 걸 확신 할 수 있다. 연결이 됐는지 안 됐는지 알 수 있고, 연결이 됐으면 내 목소리가 전달될 거라는 걸 알 수 있다.
		//양쪽이 연결되지 않으면 통신이 이뤄지지 않는다. 한쪽이 끊어지면 통신도 끊어진다.
		//블루투스도 TCP 사용
		//UDP
		//소포 방식과 비슷. 전송을 하고 나면 더 이상 무엇을 할 수 없다. 응답을 기다리지 않고 그냥 편지를 보내면 끝. TCP보다 빠르지만 불완전. 
		//실시간성이 중요한 스트리밍, 온라인 게임, 인터넷전화 등에서 TCP의 신뢰성에 대한 제약은 아주 작은 데이터 하나에도 버퍼링을 만듦. 
		//한두 개 쯤 데이터 소실이 되더라도 데이터를 맘껏 보낼 수 있는 방식이 필요
		//온라인 게임에서 캐릭터 좌표를 서버에 보내는 데에도 사용. 
		
		//통신을 하려면 상대방의 IP 주소를 반드시 알아야만 함
		//자바 프로그램을 동작시키는 디바이스의 IP를 알려주는 기능을 가진 클래스 - InetAddress
		try {
			System.out.println(InetAddress.getLocalHost());
			System.out.println(InetAddress.getLocalHost().getHostName());
			System.out.println(InetAddress.getLocalHost().getHostAddress());
			//Loopback address는 
			//디바이스에서 디바이스 자신의 인터넷 주소를 간편히, 일관적으로 표현하기 위해 제정된 특별한 IP가 127.0.0.1
			//127.0.0.1을 가리키는 도메인이 localhost
			System.out.println(InetAddress.getLoopbackAddress()); //localhost/127.0.0.1
			System.out.println(InetAddress.getLoopbackAddress().getHostName()); //localhost
			System.out.println(InetAddress.getLoopbackAddress().getHostAddress()); //127.0.0.1
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		//IP는 인터넷에서 그 컴퓨터의 고유한 주소
		//Port는 그 컴퓨터 내에서의 프로그램 분류 번호(65천개). 0~1024까지는 용도(유명한 프로그램들이 선점)가 정해져 있으므로 쓰지 말 것.
		//IP가 항구 이름이라면 port는 dock 번호, 즉 정박 지점
		//1025~65천 번 사이에서는 내 맘대로 써도 된다. 단, 다른 프로그램과 중복되면 문제가 될 수 있다.
		//port가 중복되더라도 동시에 통신하지만 않으면 문제는 되지 않는다.
		
		System.out.println("-------------------------");
		
		//서버-클라이언트 프로그램 작성
		//서버용 프로그램에서 서버 소켓(소켓이 연결될 지점들)을 만들어놓고 대기
		//클라이언트 프로그램에서 소켓 객체를 만든다(서버의 IP 주소와 port 번호 필요). 
		//만들면 서버 쪽에서도 같은 정보를 가진 소켓 객체가 만들어진다. 서버쪽 소켓도 서버에서 만드는 게 아니라 클라이언트 쪽에서 만든 것
		//소켓의 역할은 stream들을 열어주는 것. TCP에서는 소켓 객체가, HTTP에서는 URL 객체가 stream을 열어준다.
		
		//1. 서버소켓 생성
		try {
			ServerSocket serverSocket = new ServerSocket(10001); //인수로 port 번호 입력
			System.out.println("서버소켓 생성 완료");
			
			//2. 클라이언트의 접속 기다리기
			System.out.println("클라이언트 접속 대기...");
			Socket socket = serverSocket.accept(); //여기서 커서가 대기. 서버을 열었다고 곧바로 누가 접속하는 게 아니니까.
												//클라이언트가 접속하면 그제서야 accept()가 Socket 객체를 리턴
			System.out.println("클라이언트가 접속했습니다.");
			
			//3. 데이터를 주고 받을 Stream 만들기
			InputStream is = socket.getInputStream();
			//바이트 스트림은 한 바이트씩 읽어들이니 불편. 문자 스트림으로 변환해서 사용하자
			InputStreamReader isr = new InputStreamReader(is);
			//문자스트림은 한 문자씩 읽어들이니 불편. 한 줄씩 받고 싶으니 보조스트림으로 다시 변환하자
			BufferedReader reader = new BufferedReader(isr);
			
			//먼저 하나의 데이터만 읽어들이기
			String msg = reader.readLine(); //클라이언트가 데이터를 보낼 때까지 커서 대기
			System.out.println("받은 데이터: "+msg);
			
			//반복해서 받아들이기
			while(true) {
				msg = reader.readLine(); //클라이언트의 스트림이 close() 되면 readLine()에 null이 들어옴
				if(msg == null) break;
				System.out.println("받은 데이터: "+msg);
			}
			
			reader.close();
			
			System.out.println("서버 통신 종료");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
