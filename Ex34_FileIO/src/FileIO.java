import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		
		//파일을 읽어서 다른 파일에 바로 저장하는 실습
		
		//원본 파일의 경로와 파일명.확장자
		File srcFile = new File("D:/testDir/abc.txt");
		//저장하려는 파일의 경로와 파일명.확장자
		File path = new File("D:/testDir/copy");
		if( !path.isDirectory()) path.mkdirs();
		File dstFile = new File(path, "abc(1).txt");
		
		try {
			FileInputStream fis = new FileInputStream(srcFile); //인풋 스트림
			FileOutputStream fos = new FileOutputStream(dstFile); //아웃풋 스트림
			
			byte b = (byte)fis.read(); //1 byte씩 받아서
			fos.write(b);	//1 byte씩 입력
			
			b = (byte)fis.read();
			fos.write(b);
			
			while(true) {
				b = (byte)fis.read();
				if(b == -1) break;
				fos.write(b);
			}
			
			fos.flush();
			//스트림 사용이 끝났으면 닫기
			fis.close();
			fos.close();
			
			System.out.println("파일 복사 성공");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
