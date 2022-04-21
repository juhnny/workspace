import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOut {
	
	public static void main(String[] args) {
		
		//데이터를 HDD에 File로 저장해보자
		//File 정보를 가진 클래스 객체부터 생성
		//경로(path)를 지정하지 않으면 기본 경로는 현재 프로젝트 폴더
		File file = new File("aaa.txt");
		
		//위 경로까지 연결되는 무지개로드(Stream) 생성해줘야 함
		//Stream들 중에서도 OutputStream, 그 중에서도 파일을 내보내는 능력을 가진 FileOutputStream 클래스를 사용
		try {
			//aaa.txt라는 문서가 없으면 FileOutputStream이 자동으로 생성함. 단, 폴더는 자동으로 생성하지 않음
			//해당 문서가 있으면 덮어씀
			FileOutputStream fos = new FileOutputStream(file);
			//쓰고-비우고-닫고
			fos.write(65); //저장할 데이터의 유니코드값: 'A'
							//fos.write()는 int 혹은 byte[]를 인수로 받음
							//int를 보내면 한 번에 한 문자(유니코드)만 저장
			fos.flush(); //Stream 버퍼에 찌꺼기가 남아있을 수 있어서 비우도록 하는 메소드. 써주기를 권장.
			fos.close(); //언제나 스트림 작업이 끝나면 스트림을 닫는 작업 수행. 안 해도 운영체제가 닫아주지만 써주기를 권장
			
			System.out.println("파일 저장 성공");
		} catch (FileNotFoundException e) { //new FileOutputStream(file)에 대한 예외 처리. 
			e.printStackTrace();
		} catch (IOException e) { //.write() 메소드의 예외 처리
			e.printStackTrace();
		}
		
		//위 방식은 1 byte씩 데이터를 내보내기에 반복문이 필요함
		//이번엔 byte[] 배열로 한번에 문자열을 넣어보자
		//String 객체에는 본인의 문자열을 byte[]로 변환해주는 메소드가 있음
		FileOutputStream fos2;
		try {
			fos2 = new FileOutputStream(new File("bbb.txt"), true); //두번째 파라미터를 쓰면 append가 켜져서 덮어쓰기가 아닌 이어쓰기 가능
			byte[] bytes = "Apple".getBytes();
			fos2.write(bytes);
			fos2.write(("Orange"+"\n").getBytes()); //append가 true이므로 덮어쓰는 게 아니라 추가된다.
			
			fos2.flush(); //flush()는 앞의 명령(write()라던가)이 끝나지 않아서 스트림에 데이터가 남아있을 경우 이 명령들을 완전히 처리하도록 하고 스트림을 비운다.
			fos2.close();
			System.out.println("파일 내용 추가 성공");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//경로를 더 추가해보자
		//폴더의 구분기호는 운영체제마다 다름
		//windows는 역슬래시(\)도 되고 슬래시도 됨(/)
		//mac, linux는 슬래시만(/) 됨
		//File file= new File("xxx\\aaa.txt");//역슬래시는 2개를 써야함[특수문자로 인식함]
		File file2= new File("xxx/yyy/aaa.txt"); //슬래시를 더 선호함
		//경로상의 디렉토리가 없다면 디렉토리 생성
		if(!file2.isDirectory()) {
			file2.mkdirs();
			//file2.mkdir(); //.mkdir()는 경로상에 없는 폴더를 하나만 생성. .mkdirs()는 전부 생성
			System.out.println("디렉토리 생성");
		}
		//근데 .mkdir()는 aaa.txt까지 폴더명으로 인식해서 폴더로 만듦
		
		//경로와 파일명을 따로 만들어주는 게 일반적. 나중에 경로를 수정하기도 쉽다.
		File path = new File("xxx/yyy");
		//isFile() - 지정한 경로가 파일이면 true
		//isDirectory() - 지정한 경로가 폴더면 true
		//exists() - 지정한 경로에 폴더 혹은 파일이 존재하면 true
		if(!path.exists()) path.mkdirs(); //exitst()를 많이 쓰는 편
		File file3 = new File(path, "bbb.txt");
		
	}
}
