//System Library의 java.base, java.lang 같은 라이브러리들은 import하지 않아도 기본값. 나머지는 import 필요.
public class Ex01_Print {

		public static void main(String[] args) {
			
			//출력기능(함수, 자바에서는 Method)을 가진 객체에게 출력 요청
			//1. print()
			System.out.print("Hello");
			System.out.print("\n");
			
			System.out.print("Nice\n");
			System.out.print("\n");
			
			System.out.print('A');
			System.out.print("\n");
			
			System.out.print(10);
			System.out.print("\n");
			
			System.out.print(1.1);
			System.out.print("\n");
			
			System.out.print(true); //Java에서 true와 1은 호환되지 않는다. while(1)은 오류
			System.out.print("\n");
			
			//println
			System.out.println("줄 바꿔");
			
			//문자열의 + 덧셈(결합 연산자)
			System.out.println(10+20);
			System.out.println("aaa" + "bbb");
			
			//서로 다른 자료형끼리 연산 가능
			System.out.println(10 + 3.14); //int -> double
			System.out.println(10 + "aaa"); //int -> string으로 자동형변환. string이 double보다도 자료형이 크기 때문
			System.out.println(10 + 20 + "aaa"); ///30aaa
			System.out.println("aaa" + 10 + 20); //aaa1020
			
			System.out.println(5 + "+" + 3 + "=" + (5+3));
			System.out.println(5 + "+" + 3 + "=" + 5+3);
			
			//변수명으로도 값 출력됨
			int num = 10;
			double num2 = 3.14;
			System.out.println(num);
			System.out.println(num2);
			System.out.println(num + num2);
			System.out.println(num + " * " + 2 + " = " + num * 2);
			
			//print의 "" 안에서 그대로 출력되지 않는 문자 2개: ", \
			//C언어에서 안 나오던 %는 나오게 됐다.
			System.out.println("나는 \"홍길동\"입니다.\\ %");
			
			//C언어의 printf도 있다. 출력서식도 동일
			System.out.printf("%4d %.3f \n", 10, 1.23456);
			
			//변수와 자료형 
			//자바에서 자료형은 두 종류(사실 c언어도 그렇긴 해)
			
			//1. 기본(원시) 자료형(primitive) 8종
			//데이터를 저장하는 용도
			//boolean, byte, char, short, int, long, float, double
			//boolean은 논리형
			//byte, char, short, int, long은 정수형
			//float, double은 실수형
			
			//boolean 	1바이트
			//byte 		1바이트 New! -128 ~ 127
			//char		2바이트 Unicode
			//short		2바이트
			//int		4바이트
			//long		8바이트 더 커짐
			//float		4바이트
			//double	8바이트
			
			//2. 참조 자료형(reference)
			//String, Random, Scanner, ... 등 4천 여개의 class들
			
			
			//변수명(identifier)의 규칙
			//1. 대소문자 구분. 길이 제한 없음
			//2. 예약어 사용 불가
			//3. 숫자로 시작 불가
			//4. 특수문자는 '_'와 '$'만 허용
			
			//변수 생성 문법
			
			//변수에 대입 시 주의할 점
			//자료형이 큰 것을 작은 것에 넣으면 에러
			//c 언어와 다른 점
			
			//int b = 3.14;
			//int b; b = 3.14;
			
			double c = 10; //ok
			
			//값 대입할 때 변수의 크기(저장 가능한 값의 범위)를 고려해야 
			byte by = 127; 
			System.out.println(by);
			//by = 128; //Error
			
			short sh = 32767; //[2 byte: 65,536]
			System.out.println(sh);
			//sh = 32768;
			
			int in = 2100000000; //42억개
			//in = 2200000000;
			System.out.println(in);

			long lo ;
			//lo = 10000000000; //에러가 나는 이유: 리터럴 상수를 메모리에 만들 때 C나 자바는 정수형은 기본적으로 int로 만든다. 그런데 int에 100억이 못 들어가니까.
			//접미어를 붙여서 리터럴 상수를 long으로 만들도록 정해줘야 한다.
			lo = 10000000000L;
			System.out.println(lo);
			//long lo2 = 10000000000; //이건 초기화인데 왜 에러? 메모리에 상수를 안 만드는데? 이건 컴파일러가 막은 것
			
			float flo; 
			//flo = 3.14; //이것도 에러. 실수형 상수의 기본값은 double형이기 때문에 float에 대입할 수 없다.
			flo = 3.14f; //접미어로 자료형을 정해준다.
			System.out.println(flo);
			
			double dou;
			dou = 3.14; //문제 없음. 실수형 상수의 기본값이 double이니까.
			System.out.println(dou);
			
			short z = 10 + 20; //short에 상수를 대입할 때는 오른쪽 상수가 int인데도 자동으로 형변환을 해준다? 이건 지원을 해줌
			System.out.println(z);
			
			short x = 10, y = 20; 
			//z = x + y; //하지만 short형 변수를 덧셈하여 대입할 때는 자동 형변환을 안 해준다. 좀 이상한 부분이라고.
			
			boolean truth = true;
			truth = false;
			System.out.println(truth);
			
			if(truth) System.out.println("it's true");
			
			//상수
			//1. 리터럴 : 쓰여진 그대로 - 19, 3.14, 'G', "hello"
			//2. final 상수: c의 const 상수를 대체.
			final int cons = 10;
			System.out.println(cons);
			y = 3;
			System.out.println(cons);
			
			
			
		}
}
