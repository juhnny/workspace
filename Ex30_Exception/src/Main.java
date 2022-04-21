import java.net.URL;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//자바 프로그램에서 의도하지 않은 상황이 생길 때
		//1. 오류 Error: 실행조차 불가
		//2. 예외 Exception: 실행 중(Run Time) 문제가 발생
		
		//대표적인 Exception 사례
		//1. 사용자가 잘못된 데이터를 입력하는 경우: 숫자 입력 상황에 문자를 입력
		//2. 개발자가 로직이나 계산을 잘못한 경우: 배열의 인덱스번호 오류, 0으로 나눗셈하는 경우
		//3. 네트워크나 하드웨어 오류(하드디스크의 파일제어 오류, 특정 사이트의 접속 오류): URL 미스, 서버 불량
		//4. 악의적인 해킹에 의한 오류(디도스 공격)
		
		System.out.println("예외처리에 대해 알아봅시다.");
		//오류는 실행조차 안되지만 예외는 실행은 되지만 문제가 발생
		//예외 발생 전까지는 실행결과를 확인할 수 있다.
		//예외가 발생하면 프로그램이 거기서 다운되는 느낌

		//예외처리란 예외는 발생하지만 그로 인해 다운되지 않도록 하는 문법
		//예외가 발생해도 그 다음 명령문들이 실행되는 것을 확인할 수 있다.
		
		System.out.println(123);
//		int; //error. 실행조차 불가. 어떤 코드도 나오지 않음
		System.out.println(10/2);
//		System.out.println(10/0); //예외 발생. 자바에서 0 나눗셈은 불가. double 연산에서는 가능(Infinity)
		
		//if문을 사용하면 예외 상황을 피해갈 수도 있다. 이것도 일종의 예외 처리.
		int a = 10;
		if(a != 0) System.out.println(a/2);
		//하지만 어떤 상황들은 if문으로 검사할 수 없는 경우가 있다. 예) 네이버의 서버 다운
		//이런 경우 예외처리문이 유용. 프로그래머의 필수 문법
		
		//try-catch
		//if-else와 비슷
		
		//0 나눗셈 예제
		int n = 0;
		
		try {
			System.out.println("10 / n = "+10/n); //예외 발생 가능성이 있는 코드
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다."); //예외가 발생하면 실행될 코드. 이 코드 자체보다 중요한 건 이 이후 명령들이 무사히 실행된다는 것이다. 
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
		//배열의 인덱스 번호 오류
		int[] arr = new int[] {10, 20, 30};
		int id = 3;
//		System.out.println(arr[id]); //예외 발생

		try { 
			System.out.println(arr[id]); 
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		};
		
		//null 참조 예외
		String s = null;
		try {
			System.out.println(s);
		} catch(NullPointerException e) {
			System.out.println(e);
		}
		
		//잘못된 데이터 입력
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input: ");

		try {
			num = scan.nextInt(); //try 대상 문장.
								// 만약 사용자가 'A' 같은 잘못된 데이터를 넣으면?
			System.out.println("num: "+num);
		} catch(InputMismatchException e) {
			System.out.println("정수만 입력 가능");
//			System.out.println(num); //쓰레기값인 num을 참조하므로 오류
		}
		
		//주의! 위 예에서... try문 안에서 scan 입력을 받아서 catch문 안에서 그것을 출력하려 하면 num이 아직 쓰레기값이므로 오류가 발생할 것이다.
		//catch문 안에는 try의 성패에 영향을 받는 문장은 넣지 않는 게 좋다. 그런 문장들은 try문 안에 써주자.
		
		//5. 숫자로 바꿀 수 없는 데이터를 숫자로 바꾸고자 할 때
		String s2;
//		s2 = scan.next(); //scan 받았다고 치고
//		s2 = "123";
		s2 = "12a";
		
		try { 
			int numb = Integer.parseInt(s2);
			System.out.println(numb + 100);
		} catch(NumberFormatException e) {
			System.out.println("정수 모양 문자열만 입력 가능");
		}
		
		//Try문에서 발생할 수 있는 예외가 하나가 아닌 경우
		//예) 두 수를 입력받아 나눗셈을 하는 프로그램
		
		int num1, num2;
		try {
			num1 = scan.nextInt(); //InputMismatchException이 발생할 수도 있고
			num2 = scan.nextInt();
			System.out.println(num1 / num2); //ArithmaticException이 발생할 수도 있는데
		} catch(InputMismatchException e) { //catch 할 수 있는 예외 상황은 하나 뿐이면 나머지는 커버가 안된다.
			System.out.println("정수만 입력 가능"); 
		}
		
		//이럴 땐 try-catch문을 중첩으로 쓸 수도 있지만.. 너무 지저분
		try {
			
			try {
				
			}catch(ArithmeticException e) {
				
			}
		}catch(InputMismatchException e) {
			
		}
		
		//다행히 다중 catch(multiple catch)가 가능하다.
		try {
			
		} catch(InputMismatchException e) {
			//예외 처리1
		} catch(ArithmeticException e) {
			//예외 처리2
		}
		
		//하지만 다중 catch문에서는 catch 시 실행문을 각각 써줘야 하는데..
		//굳이 그럴 거 없이 한가지 방법으로 처리할 거라면.. 모든 예외 클래스들의 부모인 Exception 클래스로 업캐스팅 한다.
		
		try {
			
		} catch(Exception e) { 
			
		}
		
		//그 중 일부 경우만 다르게 처리하고 싶으면..
		
		try {
			
		} catch(ArithmeticException e) { 
			
		} catch(Exception e) {
			
		} //catch(InputMismatchException e) { 
			//Exception으로 catch한 뒤에 다른 예외 클래스를 사용하면 Unreachable catch block 오류 
		//}
		
		
		//만약 예외 발생여부와 상관 없이 무조건 해야 할 일이 있다면?
		//예) 메모리 관리, 외부(서버, 파일)와의 연결을 종료해야 하는 경우
		//finally
		try {
			System.out.println(10/0);
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finally는 무조건 실행");
		}
		
		//그럼 그냥 try-catch 뒤에 실행문 쓰는 거랑 뭐가 달라?
		//코드 해석에 도움
		//try-catch와 관련된 문장들이 어디까지인지를 알 수 있다. try를 왜 하게 됐는지를 인지할 수 있다.
		//그래서 finally를 써주는 것이 선호된다.
		
		//사실 예외 발생 시 별도의 행동을 안 하는 경우도 많다. 
		//catch문은 파라미터까지는 꼭 써야 하기 때문에 귀찮다.. 
		//이 때 finally를 쓰면 생략할 수 있다.
		try {
			
		} finally {
			
		}
		
		
		//Exception 클래스들은 크게 보면 두 종류로 구분
		//1. Checked Exception
		//예외이지만 예외처리를 하도록 강제하는 경우. 안 하면 error가 나게 돼있다.(throw 메소드 때문)
		//네트워크나 파일입출력에 관련된 예외들
//		URL url = new URL("http://www.google.com"); //분명 접속 가능하고, 형식에 맞는 주소지만..
													//Unhandled exception type MalformedURLException - 잘못된 주소를 썼을 경우에 대한 예외가 다뤄지지 않았다.
													//try-catch를 쓰던가 throw를 추가해줘야 한다.
		try {
			URL url = new URL("http://www.google.com"); //제대로 된 형식
//			URL url2 = new URL("www.google.com");	//잘못된 형식
			
			System.out.println("정상적인 주소");
		} catch (Exception e) {
			System.out.println("잘못된 주소");
		}		
		
		//2. Unchecked Exception
		//예외처리로 다뤄주지 않아도 실행 자체엔 문제가 없는 예외들. 
//		ArithmeticException
//		NullPointerException
//		InputMismatchException
//		NumberFormatException
		
		
		
		System.out.println("\n프로그램 종료"); //예외처리가 잘 됐다면 이 문장이 나올 것이다. 프로그램을 다운시키지 않는 것이 예외처리의 목적!
		
	}
}
