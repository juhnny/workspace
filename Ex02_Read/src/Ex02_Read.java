//import 패키지명

import java.util.Scanner;


public class Ex02_Read {
	
	public static void main(String[] args) {

		
		
		//문자열 참조변수끼리의 비교연산 시 주의
		//new String이 반환한 주소임에 주의. 특히 == 연산 시 주의
		String str1 = new String("Good");
		String str2 = new String("Good");
		String str3 = "Good";
		String str4 = "Good";
		//new를 쓰면 String 객체라고 부름. "Good"을 쓰면 문자열 상수 객체라고 부름. 
		//문자열 자동완성기능을 사용하면 컴파일러의 판단에 따르는 것. 같은 문자열을 입력시 같은 객체를 재사용
		//str1, str2, str3은 서로 다른 객체의 주소, str3과 str4는 같은 객체의 주소. 
		
		if(str1 == str2) System.out.println(true); else System.out.println(false);
		
		//문자열 객체 비교에 
		
		
		
		
		
		
		
		
		
//		int a = System.in.read();
		
		//System.in은 입력값을 무조건 한 문자로 받아들이기에
		//다른 자료형들을 입력받기 너무 어려움
		//System.in이 입력한 한 문자들을 원하는 자료형으로 변환해주는 객체가 있다면?
		//Scanner: System.in이 입력받은 한 문자들을 원하는 자료형으로 변환해주는 기능 클래스
		//Scanner 자체로는 키보드 입력을 못 받는다.
		
		Scanner scan = new Scanner(System.in);
//		int aa = scan.nextInt();
//		System.out.println("aa: "+aa);
		
//		double dd = scan.nextDouble();
//		System.out.println("dd: "+dd);
		
//		boolean bb = scan.nextBoolean();
//		System.out.println("bb: "+bb);
		
		//한 문자 입력 기능은 없다.
		//문자열로 입력받아 그 중 한 글자를 빼오는 방식 사용(내일 수업)
		//next는 띄어쓰기를 기준으로 문자열을 구분. 띄어쓰기를 하면 다음 단어는 다음 스캔넥스트에 들어감.
		
//		String ss = scan.next();
//		System.out.println("ss: "+ss);
//		
//		String ss2 = scan.next();
//		System.out.println("ss2: "+ss2);
		//버퍼에 엔터가 남아서 다음 scan.nextLine에 들어가는 문제가..
		//맞다. nextLine()을 제외한 next(), .. , nextDouble()은 개행문자 전까지만 받는다.
		//nextLine()은 개행문자를 포함한 뒤 멈추기 때문에 위 next 시리즈 뒤에는 개행문자를 먹어줄 nextLine()을 하나 써주면 해결.
		
		//띄어쓰기를 포함해서 입력받는 기능
		//버퍼에 남는 것 없이 깔끔하게 가져옴
//		String str = scan.nextLine();
//		System.out.println("str: "+str);
//
//		String str2 = scan.nextLine();
//		System.out.println("str2: "+str2);
		
		//Ex. 사용자에게 정수 입력받아 사칙연산
		System.out.println("Input two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("a: "+a+" b: "+b);
		System.out.println(a+" + "+b+" = "+(a+b));
		
		//2. 연산자 (C언어와 거의 같음)
		//C언어와 조금 다른 문법들
		//2.1. 실수형 숫자에 대한 나머지 연산 허용
		System.out.println(10%3);
		System.out.println(10.5%3.1); //c언어에서는 에러
		
		//2.2. 비트 연산자에 >>>(시프트 연산자) 추가
		int nn = -9;
		System.out.println(nn >> 2); //2칸 옆으로 민다.부호는 그대로
		System.out.println(nn >>> 2); //2칸 옆으로 민다. 부호도 민다. 위 방식에서 부호가 남는 게 불편해서 만듦. 시스템 프로그래머가 주로 사용
		//반대 방향은 없다. 
		
		//3. 제어문 (C언어와 거의 같음)
		//3.1. 조건값에 1, 0을 참거짓으로 해석하지 않음
		//if(1){} //error
		if(true) {}
		
		//3.2. switch문에 int, char 외에 String도 쓸 수 있음
		String sss = "kim";
		switch(sss) {
		case "kim":
			System.out.println("you're kim"); break;
		default:
			System.out.println("you're not kim"); break;
		}
		
		//4. while은 다를 것 없음
		
		//5. for도 똑같음. java에서 추가된 문법이 있으나 배열에서 소개

		
	}
}
