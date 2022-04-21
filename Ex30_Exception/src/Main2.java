import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;

public class Main2 {

	public static void main(String[] args) {
		
		//throws
		//예외 떠넘기기 문법. 폭탄 돌리기 같은 느낌
		
		//아래 작업을 함수를 통해 한다고 해보자.
		int x = 10/2;
		System.out.println(x);
		
		//두 수를 전달받아 결과값을 리턴하는 메소드
		//0 나눗셈 예외가 발생할 것이 예상된다. 하지만 아무 예외 처리도 안한 메소드 
//		x = devide(10, 0);//예외가 예상되는 코드 
		
		//메소드 안에서 예외 처리를 해보기
		//예외를 try-catch 해보아도 예외 상황에서 무얼 return할 지 도저히 정할 수 없는 경우가 있다.
		x = devideWithTryCatch(10, 0); 
		
		//메소드에서 예외를 throw로 처리
		//메소드에서 직접 예외처리 하지 말고 리턴으로 예외 객체를 던지는 것
		try {
			x = devideWithThrows(10, 0); 
		} catch(Exception e) {
			System.out.println("메소드가 던진 Exception 객체를 여기서 받아 처리");
		}
		
		//throws로 떠 넘겨진 Exception의 종류가 Checked Exception이 었다면 ... 
		//필수적으로 예외처리를 해야 함.
		try {
			aaa();
		}catch(MalformedURLException e) {
			e.printStackTrace(); //우리가 흔히 보는 예외 발생 문구 출력
		}
		
		//이런 것도 가능하다. 던지고 던지고 ~
		try {
			bbb();
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		//throws로 Exception 객체를 리턴하는 메소드를 사용할 때는 Checked Exception이 전달될 지 Unchecked Exception이 전달될 지 알 수 없으므로 
		//반드시 받아서 예외처리를 해줘야 한다.
		x = devideWithThrows(10, 2); //문제 없는 경우
//		x = devideWithThrowsAll(10, 2); //똑같이 문제가 없지만 Exception을 반환하므로 반드시 예외처리 필요
		
		try {
			x = devideWithThrowsAll(10, 2); 
			System.out.println(x);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\n프로그램 종료");
	}///main()
	
	
	static int devide(int a, int b) {
			return a/b;			
	}
	
	static int devideWithTryCatch(int a, int b) {
		try {
			return a/b;			
		} catch (Exception e) {
//			return ??? //void 메소드가 아니니까 return을 하긴 해야겠는데 뭘 리턴할지가 애매... 
			return 0; //임시 방편
		}
	}
	
	//메소드에서 직접 예외처리 하지 말고 그냥 리턴으로 예외 객체를 던지자~ 
	//정의문에서 발생하는 Exception을 포함할 수 있는 Exception을 throw해야 한다.
	//ArithmeticException이 발생했는데 MalformedURLException을 throw하면 안된다.
	static int devideWithThrows(int a, int b) throws ArithmeticException { 
		return a/b;			
	}
	
	//Checked Exception을 떠넘기는 메소드
	static void aaa() throws MalformedURLException{
		URL url= new URL("www.daum.net");
	}
	
	//떠넘겨진 예외를 다시 떠넘기기
	static void bbb() throws MalformedURLException{
		aaa();
		System.out.println("bbb");
	}
	
	//떠넘겨진 예외를 다시 떠넘기기
	static int devideWithThrowsAll(int a, int b) throws Exception { 
		return a/b;			
	}

	
}
