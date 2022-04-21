import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CharacterIO {

	public static void main(String[] args) {
		
		//문자 스트림 character stream 을 이용한 파일 입출력 프로그램
		
		//사용자로부터 지속적으로 입력받아 파일에 저장하기
		Scanner scan = new Scanner(System.in);
		
		//사용자가 "no"라는 글씨를 입력할 때까지 반복적으로 문자열 입력받기
		String fileName;
		//사용자에게 파일 이름 입력받기
		System.out.print("저장할 파일 이름을 입력하세요: ");
		fileName = scan.next();
		//경로 생성
		File path = new File("testFiles"); //프로젝트 폴더 안에 새 디렉토리 생성
		if( !path.exists()) path.mkdirs();
		File file = new File(path, fileName+".txt");
		
		
		while(true) {
			System.out.print("저장할 단어 입력(no 입력 시 종료): ");
			String s = scan.next();	
			if(s.equalsIgnoreCase("no")) break; //equalsIgnoreCase() - 대소문자 구분없이 문자열 비교
			
			//이번엔 byte 단위로 읽고 쓰는 byte stream 대신 
			//character(2 bytes) 단위로 읽고 쓰는 character stream을 사용해보자
			//Character Stream 중 File Writer와 Print Writer를 사용해보자
			try {
				FileWriter fw = new FileWriter(file, true); //true를 붙이면 덮어쓰기 대신 이어 쓰기
				//아래 방법은 기본적인 FileWriter의 사용법
				//하지만 FileWriter 자체만으로는 단어 구분이나 특정 format으로 내보내는 게 불편.
//				fw.write(s+"\n"); 
//				fw.flush();
//				fw.close();
				
				//그래서 System.out.print()처럼 포맷을 사용할 수 있게 한 보조 스트림이 PrintWriter
				//print()를 하되 콘솔창이 아닌 파일로 출력이 된다고 생각하면 됨
				PrintWriter writer = new PrintWriter(fw);
//				writer.print("Nice "+2+" meet you. ");
				writer.println(s);
				writer.flush();
				writer.close(); //보조스트림을 닫으면 주 스트림도 같이 닫힘. 누굴 먼저 닫아도 상관 없다.
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//while
		System.out.println("저장 완료");
		
		
		
		//이제 저장한 파일을 읽어와보자
		System.out.println("\n---------------------------");
		System.out.println("        저장한 파일 읽어오기");
		System.out.println("---------------------------\n");
		
		//읽어올 문자 데이터를 어딘가 담아야 사용할 수 있다.
		//ArrayList에 저장해서 써먹어보자
		ArrayList<String> data = new ArrayList<>();
		
		//Character Stream 중 File Reader와 BufferedReader를 사용해보자
		try {
			FileReader fr = new FileReader(file);
			
			int c = fr.read(); //한 문자씩 읽어들임(영어 1 byte, 한글 2~3 byte로 읽어짐. 언어마다 알아서 바이트수가 결정되어 읽어짐.)
			System.out.println(c); 
			//위 방법은 한글자씩 읽기 때문에 불편함.
			
			//그래서 읽어들이는 작업을 조금더 쉽게 옆에서 보조해주는 스트림이 존재함
			//그 중에서 가장 많이 애용되는 BufferedReader를 사용
			//BufferedReader는 파일의 문자열들을 모두 먼저 읽어서 가지고 있음.
			//그렇기에 이 BufferedReader에게 한 줄씩 문자열을 달라고 요청할 수 있음.
			BufferedReader reader = new BufferedReader(fr); //인수로 문자열을 읽어올 Reader를 넣어줌
			//한 줄씩 읽어들이기 가능함. 
			while(true) {
				String line = reader.readLine(); //다음 한줄 읽기
				if(line == null) break; //읽어들일 String이 더 이상 없으면
				
				data.add(line); //ArrayList에 저장
			}
			
			System.out.println("저장된 문자열의 개수: "+data.size());
			System.out.println(data);
			
			reader.close(); //스트림 닫기
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
		
		
	}
}
