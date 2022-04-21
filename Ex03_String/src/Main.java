import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Java에서는 문자열을 객체로 관리함. 문자열은 객체다!
		//즉 문자열을 값으로만 갖고 있지 않고 관련된 기능들을 갖고 있다.
		//C에서 문자열은 단순히 캐릭터형 값들의 배열이었다. 
		//String 객체는 내부적으로는 C에서와 똑같이 char 배열이다.
		//하지만 끝문자 0을 필요로 하지 않고(문자열의 길이 정보를 클래스 자체적으로 저장하고 있어서 불필요) 
		//관련된 메소드들을 포함하고 있다.
		//한번 만들어진 String 객체의 value는 절대 불면(immutable)
		
		String str1 = new String("Hello");
		//문자열 데이터는 워낙 중요하고 자주 사용되는 값이라 축약표현이 제공된다.
		String str2 = "Hello"; //자동 new String("Hello"); 객체를 만들었다는 걸 잊지 말자.
		
		//String 클래스의 기능(메소드) 사용
		
		//1. length
		//문자열 데이터의 길이(글자 수) 리턴
		int len = str1.length();
		int len2 = str2.length();
		int len3 = "He".length();
		System.out.println(len);
		System.out.println(len2);
		System.out.println(len3);
		System.out.println();
		
		//2. equals
		//문자열값의 비교(같은 문장이냐)
		System.out.println( str1 == "Hello"); //주소 비교. 오른쪽은 "Hello"라는 문자열을 가진 String 객체를 새로 만들고 그 주소를 반환함
		System.out.println(str1.equals(new String("Hello")));
		System.out.println(str1.equals("Hello"));
		System.out.println(str1.equals(str2));
		System.out.println("Hello".equals(str1));
		System.out.println();
		
		//2-1. 대소문자 비교
		System.out.println(str1.equals("hello")); //false
		System.out.println(str1.equalsIgnoreCase("hello")); //true. 대소문자 무시
		System.out.println();
		
		//2-2. charAt 
		//문자열에서 특정 위치의 char 하나를 가져오기(index 사용)
		char ch = str1.charAt(0);
		System.out.println(ch);
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(3));
		System.out.println(str1.charAt(4));
//		System.out.println(str1.charAt(5)); //Error. String index out of range
		System.out.println();
		
		for(int i = 0; i < str1.length();i++) {
			System.out.println(str1.charAt(i));
		}
		
		//3. 문자열에서 한 글자씩 가져오기
		//Scanner에는 char 입력기능이 없음.
		//System.in은 한 문자씩 받지만 그럼 유저 입력이 불편하잖아.
		//자바에서는 문자열로 입력받아서 한 글자씩 가져오는 방식을 사용
//		char c;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a string");
//		String str = scan.next();
//		c = str.charAt(0);
//		System.out.println("c: "+c);
//		
//		//축약형 표현법
//		System.out.println("Enter a string");
//		char c2 = scan.next().charAt(1); //메소드 체이닝. 함수에 접근한 게 아니라 함수가 반환한 문자열 객체에 접근해서 함수를 호출한 것
//		System.out.println("c2: "+c2);

		//4. 문자열 안에서 특정 글자의 index를 가져오기
		//indexOf('A'), lastIndexOf('l')
		
		int index = str1.indexOf('e');
		System.out.println(index);
		System.out.println(str1.indexOf('o'));
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.indexOf('A')); // 못 찾으면 -1
		System.out.println();
		
		//뒤에서부터 검사
		System.out.println(str1.lastIndexOf('l'));

		
		//4.1. 문자열도 찾을 수 있다.
		System.out.println(str1.indexOf("el"));
		System.out.println(str1.indexOf("Hl")); //못 찾으면 -1
		System.out.println();
		
		//4.2 원하는 위치부터 검사
		System.out.println(str1.indexOf('l', 3)); 
		System.out.println(str1.indexOf("lo", 3));
		System.out.println();
		
		//5. contains 
		//특정 문자열이 포함되어 있는지 여부(true/false) 리턴
		String s3 = "안녕하세요. 반갑습니다. 500원 입니다.";
		boolean b = s3.contains("반갑");
		System.out.println(b);
		System.out.println();
		
		//6. concat 
		//문자열 결합
		//참고로 String 객체는 한번 만들어지면 데이터 변경 불가
		String s4 = s3.concat(" 카드는 안 받습니다."); //"카드는 안받습니다."라는 새로운 String 객체를 만들어서 s3와 결합한 새로운 String 객체를 만든다.
		System.out.println(s3);
		System.out.println(s4);
		
		//참조변수는 그대로 사용할 수도 있다.
		s3 = s3.concat(" 현금 환영.");
		System.out.println(s3);
		
		//사실 concat은 너무 많이 쓰여서 잘 안 쓰인다. 결합 연산자 +가 만들어져서.
		s3 = s3 + " 안녕히 가세요.";
		System.out.println(s3);
		System.out.println();
		
		//String을 다루면서 concat이나 + 연산자를 반복 사용하면 객체를 메모리에 할당하는 일이 반복되기 때문에 퍼포먼스에는 부담되는 행위
		//그래서 문자열을 쭉 버퍼에 담아뒀다가 한번에 String 객체로 만드는 메소드도 있다. 아마도 StringBuffer
		
		//기본적으로 상수들은 다음 명령줄로 넘어가면 자동으로 메모리에서 잊혀진다.
		//자바에서도 문자열 상수들은 Heap 영역에 만들어졌다가 더이상 참조되지 않으면 다음 줄에서 삭제된다.
		//자바에서는 Heap에 상수만을 만드는 Constant Pool이라는 영역을 둔다.
		//계속 참조되고 있는 문자열 객체들은 Constant pool에 있어도 사라지지 않는다.
		
		//7. startsWith, endsWith 
		//특정 문자열로 시작/끝나는 지 여부
		System.out.println(s3.startsWith("안녕"));
		System.out.println(s3.startsWith("반갑"));
		
		System.out.println(s3.endsWith("가세요."));
		System.out.println(s3.endsWith("가세요. "));
		System.out.println();
		
		//8. trim 
		//문자열의 양쪽 공백문자를 제거해주는 기능
		String s5 = "   abc   ";
		System.out.println("["+s5+"]");
		s5 = s5.trim(); //새로운 객체 생성 및 주소 대입
		System.out.println("["+s5+"]");
		System.out.println();
		
		//9. toUpperCase, toLowerCase 
		//대소문자 변환
		s5 = s5.toUpperCase();
		System.out.println(s5);
		s5 = s5.toLowerCase();
		System.out.println(s5);
		
		//다 한번에 써보자 ㅋㅋ
		System.out.println("   Apple   ".trim().concat(" Computer").toUpperCase().endsWith("r"));
		System.out.println();
		
		//10. replace 
		//특정 문자/문자열 바꾸기
		System.out.println("Android".replace('d', 'r')); //모든 문자가 대체된다.
		System.out.println("  홍 길 동  ".replace(" ", "")); //문자열 중간 공백 없애기
		System.out.println();
		
		//11. substring 
		//문자열 잘라내기
		System.out.println("abcdefg".substring(2)); //2번째 글자부터 
		System.out.println("abcdefg".substring(2, 4)); //2이상 4미만 글자
		//두번째 파라미터가 이하가 아니라 미만인 것은 두번째 파라미터에 length를 주로 쓰기 때문
		System.out.println();
		
		//12. compareTo 
		// 문자열값의 대소비교. 정렬(sort) 할 때 사용
		System.out.println('a'>'b');
		//하지만 문자열끼리 비교는 어떻게 해?
//		System.out.println("abc" > "abb"); //Error. 주소는 비교연산 불가
		System.out.println("abc".compareTo("abb")); //1
		System.out.println("abc".compareTo("abd")); //-1
		System.out.println("abc".compareTo("abe")); //-2
		System.out.println("abc".compareTo("ab")); //1    이건 왜 1만 나올까.
		//A가 B보다 앞에 있으면 음수, 뒤에 있으면 양수
		
		//13. split 
		//특정 문자열을 기준으로 문자열들을 분리하는 기능
		String s10 = "apple, berbere,  carrot, dairy ";
		String[] arr = s10.split(",");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].trim());
		} 
		
		//String 배열의 요소들을 합쳐서 하나의 큰 문자열로 만드는 기술도 있다. 그건 배열 시간에..
		
		//String 클래스에는 이외에도 많은 기능(메소드)들이 존재
		
		//static method
		//객체 생성 없이 클래스명만으로 바로 사용 가능한 메소드
		//[클래스명.메소드명]
		
		//대표적인 String 클래스의 static methods
		//1. format(): 문자열을 특정 포맷으로 만들어주는 기능
		//마치 System.out.printf()와 비슷
		int hour = 15;
		int min = 24;
		int sec = 12;
		System.out.printf("%02d:%02d:%02d\n", hour, min, sec);
		
		//하지만 실무에서는, GUI에서는 콘솔창에 출력하지 않는다. 
		//GUI 프로그램에서는 문자열(String)을 보여주는 객체(안드로이드에서는 TextView)에게 특정 포맷으로 된 문자열 객체를 만들어 전달해줘야 함
		String data = hour+":"+min+":"+sec; //이런 식으로 String을 보내줘야 하는데... printf처럼 포맷을 정해주려면?
		System.out.println(data); 
		
		//format
		data = String.format("%02d:%02d:%02d", hour, min, sec); //String. 하고 점 찍으면 String class의 static 멤버들만 보여진다. 아이콘에도 s가 붙어있다.
																//대문자로 시작하는 변수를 보면 클래스이고, 클래스 뒤에 바로 점을 찍는다는 건 static 멤버를 쓰겠다는 것
		System.out.println(data);
		
		//2. 기본형(primitive) 자료형을 String 객체로 변환해주는 기능
		//기본형은 참조형으로 형변환이 안 된다.
		int num = 100;
//		String strnum = (String)num; //에러
		String strrr = String.valueOf(num); //100 -> "100"
		System.out.println(strrr);
		System.out.println(strrr.length());
		
		strrr = String.valueOf(3.14);
		System.out.println(strrr);
		
		strrr = String.valueOf(true);
		System.out.println(strrr);
		
		//GUI에서 화면에 출력되는 모든 숫자, 문자는 String이다. 
		//valueOf는 정말 많이 필요하다. 하지만 문자열 변환 연산자를 더 많이 쓴다.
		
		strrr = 20000 + "";
		System.out.println(strrr.length());
		
		//반대로 String을 기본형으로 변환하는 경우도 무지 많다.
		//GUI에서는 사용자에게 입력받는 값들도 모두 문자열이다. 
		//헌데 String 클래스에는 이 기능이 없다.
		//이 기능이 들어있는 클래스들은... 
		//Boolean, Character, Byte, Short, Integer, Long, Float, Double
		//Wrapper 클래스라고 부른다.
		
		int num2 = Integer.parseInt(strrr);
		System.out.println(num2 * 2);
		
		
//		num2 = Integer.parseInt("abc"); //Error. 숫자 형식이 아님
		
		double d = Double.parseDouble("3.14");
		System.out.println(d / 2);
		
		//GUI에서 숫자 입력받아 덧셈하기
		Scanner scan1 = new Scanner(System.in);
		int numb1, numb2;
		
		System.out.println("Input two numbers");
		String numstr = scan1.next();
		numb1 = Integer.parseInt(numstr);
		
		numstr = scan1.next();
		numb2 = Integer.parseInt(numstr);
		
		numstr = "Total is " + String.valueOf(numb1 + numb2);
		System.out.println(numstr);
		
		
		
		
	}
}
