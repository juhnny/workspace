
public class Ex01_Test {
	
	public static void main(String[] args) {
		
//		문제 1.
//		다음과 같은 형태로 본인의 이름을 출력하는 프로그램을 작성해 보자.
//		단, System.out.print()는 한번만 사용한다.
//		 홍길동
//		 홍 길 동
//		 홍  길  동
		
		System.out.print("홍길동\n홍 길 동\n홍  길  동");
		
//		문제2.
//		다음의 출력결과를 보이도록 예제를 작성해보자. 단, 출력되는 숫자들(20,123,456)은
//		정수형 숫자 형태로 기입하며 문자열표기" "와 +를 이용하여 아래와 같이 출력하도록 하자.
//
//		 제 이름은 홍길동입니다.
//		 제 나이는 20살이고요.
//		 제가 사는 곳의 번지수는 123-456 입니다.
		
		System.out.println("제 이름은 홍길동입니다.");
		System.out.println("제 나이는"+20+"살이고요.");
		System.out.println("제가 사는 곳의 번지수는 "+123+"-"+456+"입니다.");

//		문제3.
//		다음의 출력결과를 보이도록 예제를 작성해보자. 이번에도 역시 출력되는 숫자들은 정수형
//		숫자 형태로 기입하며 문자열표기" "와 +를 이용하여 아래와 같이 출력하도록 하자.
//		각 연산의 결과는 숫자를 직접 기입하지 말고 연산자를 이용하여 결과가 출력되도록 하자.
//
//		 4 * 5 = 20
//		 7 * 9 = 63
		
		System.out.println(4+" * "+5+" = "+(4*5));

//		문제4.
//		문제3번의 방식을 이용해서 구구단 5단을 출력해보자.
//
//		 5 * 1 = 5
//		 5 * 2 = 10
//		 5 * 3 = 15
//		 5 * 4 = 20
//		 5 * 5 = 25
//		 5 * 6 = 30
//		 5 * 7 = 35
//		 5 * 8 = 40
//		 5 * 9 = 45
		
		System.out.println("");
		
//		[2-2] 주민등록번호를 숫자로 저장하고자 한다.
//		이 값을 저장하기 위해서는 어떤 자료형(data type)을 선택해야 할까? 
//		regNo라는 이름의 변수를 선언하고 자신의 주민등록번호로
//		초기화 하는 한 줄의 코드를 적으시오. 

		String regNo = new String("123456-1234567");
		System.out.println(regNo + '\n');
		
//		[2-5]다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우 괄호 안에오류라고 적으시오
									// 내 예측
//		System.out.println(“1” + “2”) "12"
//		System.out.println(true + “”) "true"
//		System.out.println(‘A' + 'B') "AB"
//		System.out.println('1' + 2)   1의 아스키값 + 2
//		System.out.println('1' + '2')	"12"
//		System.out.println('J' + “ava”) "Java"
//		System.out.println(true + null)	true
	
		System.out.println("1" + "2"); 
		System.out.println(true + "");
		System.out.println('A' + 'B');  //int형보다 작은 타입(byte, char, short)은 덧셈연산 시 int로 변환 후 연산됨
		System.out.println('1' + 2);
		System.out.println('1' + '2');
		System.out.println('J' + "ava\n");
//		System.out.println(true + null); //오류. boolean은 덧셈 연산이 정의돼있지 않음
		
//		[2-6] 다음 중 키워드가 아닌 것은 모두 고르시오
	//	
//			a. if
//			b. True
//			c. NULL
//			d. Class
//			e. System
			
			//참고로 Java의 키워드 중 대문자로 시작하는 것은 하나도 없다.
			
		
//		[2-9]다음 중 형변환을 생략할 수 있는 것은 모두 고르시오? ()

//		byte b = 10;
//		char ch = 'A';
//		int i = 100;
//		long l = 1000L;
//		
//		b = (byte)i;  			필요. 큰 자료형에서 작은 자료형
//		ch = (char)b;			불필요? 작은 자료형에서 큰 자료형이니까? 놉. char는 정수형 자료형으로는 묵시적형변환 되지 않는다. 
//		short s = (short)ch;	불필요? 작은 자료형에서 큰 자료형이니까? 놉
//		float f = (float)l;		필요? 바이트는 float이 작지만 표현 범위는 더 큰데
//		i = (int)ch;			불필요. 작은 자료형에서 큰 자료형
		
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
//		b = i;	//4바이트 -> 1바이트이므로 반드시 형변환 필요
//		ch = b; //1바이트 -> 2바이트이지만 범위가 달라서 형변환 필요
//		short s = ch; //둘 다 2바이트지만 범위가 달라서 형변환 필요
//		float f = l; //float(4byte)의 범위가  long(8byte)보다 커서 생략 가능. 컴퓨터 세계에선 바이트에 상관없이 실수형이 정수형보다 크다고 생각한다.
//		i = ch;	//2바이트 -> 4바이트이므로 생략 가능
//		
//		System.out.println(b);
//		System.out.println(ch);
//		System.out.println(s);
//		System.out.println(f);
//		System.out.println(i);
		
//		
//		[2-11] 다음중 변수를 잘못 초기화 한 것은 모두 고르시오

//		byte b = 256; //양수로는 127이 최대
//		char c = '';	//null 초기화가 되나?
//		char answer = 'no'; //두 글자인데? char가 2바이트가 돼서 이제 되나?
//		float f = 3.14; //상수를 double에서 float으로 변환 필요
		double d = 1.4e3f; // double로 자동형변환됨
		
//		System.out.println(b);
//		System.out.println(c); //반드시 한 개의 문자 지정 필요
//		System.out.println(answer); //두개의 문자라 안돼
//		System.out.println(f); 
		System.out.println(d);
		
//		[2-12] 다음 중
//		메서드의 선언부로 알맞은 것은 모두 고르시오
//
//		a. public static void main(String[] args)
//		b. public static void main(String args[])
//		c. public static void main(String[] arv)
//		d. public void static main(String[] args)
//		e. static public void main(String[] args)
		
//		1, 2?
		
//		해설: 배열을 의미하는 기호인 []는 타입 뒤에 붙여도 되고 변수명 뒤에 붙여도 됨.
//		public과 static은 위치가 달라도 됨.
		
//		[2-13] 다음 중 타입과 기본값이 잘못 연결된 것은 모두 고르시오
//		b, f ?
		
//		a. boolean - false 
//		b. char - '\u0000'
//		c. float - 0.0
//		d. int - 0
//		e. long - 0
//		f. String - ""
		
//		정답: c, e, f
//		해설: 0.0은 0.0d가 기본값이므로 float 선언 시 0.0f를 써줘야 함. long도 마찬가지로 0L이라고 써야 함. 
//		String은 참조형 타입. 모든 참조형 타입의 기본값은 null
		
		
		
	}
}
