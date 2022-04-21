import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInput {
	
	public static void main(String[] args) {
		
		File file1 = new File("bbb.txt"); //경로지정 없으면 
		
		//파일과 연결해주는 무지개로드(Stream) 만들기
		//Stream 중에서도 Input Stream, 그 중에서도 파일용으로 만들어진 FileInputStream 사용
		try {
			FileInputStream fis = new FileInputStream(file1);
			byte s = (byte)fis.read(); //int형을 리턴하지만 1 byte 정보만 담고 있다. 한글은 2바이트니까 반씩 쪼개져 온다.
										//read()는 파일에 값이 있으면 그 값을, 없으면 -1을 리턴
										//char를 리턴하면 좋겠지만 FileInputStream은 문자 전용이 아니다. 
										//char를 원한다면 문자를 위해 만들어진 문자 스트림들을 쓴다.
			if(s != -1) System.out.println(s); //값이 있으면 프린트해라
			
			s = (byte)fis.read(); //read()를 계속 사용하면 계속 한 바이트씩 쪼개서 가져온다.
			if(s != -1) System.out.println(s); //값이 있으면 프린트해라
			
			//반복문 사용
			s = (byte)fis.read();
			while(s != -1) {
				System.out.print((char)s);
				s = (byte)fis.read();
			}
			
			System.out.println("\n읽어오기 완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("읽어오는 과정에서 오류가 발생했습니다");
		}
		
		
		
		
	}
}
