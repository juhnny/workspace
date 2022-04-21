import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
//		문제1
//		프로그램 사용자로부터 하나의 영단어(String)를 입력 받아라. 그리고 이 입력된 단어를
//		한줄에 한문자(character)씩 출력시켜 보아라. 단, 출력할 때 각 문자에 1이 더해진 문자가
//		출력되도록 해보자.
//
//		 예를 들어, "Array"라는 단어가 입력되면 
//		 B
//		 s
//		 s
//		 b
//		 z
		
//		System.out.println("sdfsf");
//		
		Scanner scan = new Scanner(System.in);
//		System.out.println("Input a word");
//		String str = scan.next();
//
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println((char)(str.charAt(i) + 1));
//		}
		

//		문제2.
//		2개의 String 참조변수를 선언해라. 그런다음 프로그램 사용자로부터 영단어를 입력 받아서
//		String변수 중 하나로 참조한다. 그 다음 남은 하나의 String 참조변수에 저장된 영단어를
//		역순으로 뒤집어서 String 객체를 만들어서 참조해보자.
//		뒤집고 나서는 제대로 뒤집혔는지 확인하기 위해서 출력해보자.
//		예를들어, "Hello" 를 입력하면 "olleH"가 출력되어야 한다.
		
//		String s1 = new String();
//		String s2 = new String();
//		
//		System.out.println("Enter a word");
//		s1 = scan.next();
//		for (int i = s1.length() -1 ; i >= 0; i--) {
//			s2 = s2 + s1.charAt(i);
//		}
//		System.out.println(s2);


//		문제3.
//		프로그램 사용자로부터 영단어을 입력 받는다. 그리고 나서 입력 받은 영단어를 구성하는 
//		문자 중에서 아스키 코드의 값이 가장 큰 문자를 찾아서 출력하는 프로그램을 작성해보자.
//		예를 들어서 입력된 영단어가 "LOVE"라면 이 중에서 아스키 코드 값이 가장 큰 문자는 V
//		이므로 V가 출력되어야 한다.
		
//		String str = scan.next();
//		char ch = '\0';
//		
//		for(int i = 0; i < str.length(); i++) {
//			ch = (str.charAt(i) > ch)? str.charAt(i):ch;
//		}
//		
//		System.out.println(ch);
		

//		문제4.
//		사용자로부터 문자열을 하나 입력받는다. 그리고 이 값을 출력하시오.
//		다만, 입력된 문자열에 공백문자가 있다면 제거하고 출력하시오.
//		문자열의 중간에 공백문자가 있어도 마찬가지로 제거해야한다.

//		String str = scan.nextLine();
//		System.out.println(str.replace(' ','\0')); //혹은
//		System.out.println(str.replace(" ","")); 

//		문제5.
//		사용자로부터 전화번호를 입력받되 첫3자리, 두번째 3~4자리, 세번째 4자리 숫자를 따로따로
//		입력 받아서 하나의 문자열로 합쳐서 저장하고 출력하시오. 단, 사이에 '-'로 구분자를 갖도록 한다.
//
//		예)  
//		  첫번째 자리 입력(3자리) : 010
//		  두번째 자리 입력(3~4자리) : 12345
//		  [잘못 입력하셨습니다. 3~4자리의 숫자만 입력가능합니다.]
//		  두번째 자리 입력(3~4자리) : 1234
//		  세번째 자리 입력(4자리) : 567a
//		  [잘못 입력하셨습니다. 3~4자리의 숫자만 입력가능합니다.]
//		  세번째 자리 입력(4자리) : 5678 
//
//		  입력된 전화번호는 [ 010-1234-5678 ] 입니다.
		
		//다음번에는 잘못 입력했을 때를 걸러내는 방식보다 잘 입력했을 때 break 거는 방식으로 해보자. 그게 더 안전. 내가 모든 잘못된 경우를 고려하지 못했을 수 있다.
		//상황에 따라 더 옳은 방법이 있는 것 같다.
		
//		String s1, s2, s3, snum;
//		int num;
//		
//		while(true) {
//			System.out.print("첫번재 자리 입력(3자리) :");
//			s1 = scan.next();
//			num = Integer.parseInt(s1);
//
//			if(s1.length() != 3) {
//				System.out.println("Wrong number");
//				continue;
//			}
//
//			if(num < 0) {
//				System.out.println("Wrong number");
//				continue;
//			}
//			
//			break;
//		}
//		System.out.println("첫번째 자리: "+s1);
//		
//		while(true) {
//			System.out.print("두번째 자리 입력(3~4자리) :");
//			s2 = scan.next();
//			num = Integer.parseInt(s2);
//
//			if(s2.length() > 4 || s2.length() < 3) {
//				System.out.println("Wrong number");
//				continue;
//			}
//
//			if(num < 0) {
//				System.out.println("Wrong number");
//				continue;
//			}
//			
//			break;
//		}
//		System.out.println("두번째 자리: "+s2);
//		
//		while(true) {
//			System.out.print("세번째 자리 입력(3자리) :");
//			s3 = scan.next();
//			num = Integer.parseInt(s3);
//
//			if(s3.length() != 4) {
//				System.out.println("Wrong number");
//				continue;
//			}
//
//			if(num < 0) {
//				System.out.println("Wrong number");
//				continue;
//			}
//			
//			break;
//		}
//		System.out.println("세번째 자리: "+s3);
//		
//		snum = s1 + "-" + s2 + "-" + s3;
//		System.out.println("\n입력된 전화번호는 [ "+snum+" ] 입니다.");

		
		/*** 다른 방식 ***/
//		while(true) {
//			System.out.print("첫번째 자리 입력(3자리) : ");
//			s1= scan.next();
//			
//			int i;
//			for(i=0; i<s1.length(); i++) {
//				char ch= s1.charAt(i);
//				if( ch<'0' || ch>'9') break;				
//			}
//			
//			if(i==3) break;			
//			else System.out.println("[잘못 입력하셨습니다. 3자리의 숫자만 입력가능합니다.");
//		}
	
//		문제6.
//		사용자로부터 이메일주소를 입력받아라. 단, 메일주소는 @을 포함하여 메일서버주소까지 모두 입력받아야함.
//		입력받은 메일주소에서 @앞에 있는 개인메일이름과 @뒤에 있는 메일서버주소를 각각 분리하여 저장하고 출력하시오.
//
//		예)
//		  메일 주소 입력(@포함) : 96kite
//		  [잘못 입력하셨습니다. @포함 메일서버주소까지 모두 입력하셔야 합니다.]
//
//		  메일 주소 입력(@포함) : 96kite@hanmail.net
//
//		  입력된 메일주소명 : 96kite
//		  메일서버 이름 : hanmail.net
		 
//		String s, id, serv;
//		int index;
//		
//		while(true) {
//			System.out.print("메일 주소 입력(@포함) :");
//			s = scan.next();
//			index = s.indexOf('@');
//			
//			if(index == -1) {
//				System.out.println("잘못 입력하셨습니다. @포함 메일서버 주소까지 모두 입력하셔야 합니다.");
//				continue;
//			}
//			
//			break;
//		}
//		
//		System.out.println("메일 주소 입력(@포함) :"+s);
//		
//		id = s.substring(0, index);
//		serv = s.substring(index + 1, s.length());
//		System.out.println("입력된 메일주소명: "+id);
//		System.out.println("메일서버 이름: "+serv);
		
		//다음엔 @을 검출할 땐 s.contains("@"), 문자열을 나눌 땐 s.split("@")을 써보자
//		

//		문제7.
//		사용자로부터 패스워드를 문자열로 입력받아 저장하되 다음의 규칙을 지키지 않으면 다시 입력하도록 하시오.
//		규칙1. 영문자, 숫자, 특수문자를 혼용하여 8자리 이상으로 지정.
//		규칙2. 영문자, 숫자만 사용할 경우 10자리 이상으로 지정.
//		규칙3. 영문자 또는 숫자 또는 특수문자 단독 사용만으로는 지정 불가.
//
//		입력된 패스워드가 규칙에 맞는지 확인하기 위해 출력해보시오.

		//스페이스는 포함
		//엔터는 미포함
		//
		
//		isInt('1');
//		isInt('a');
//		isInt('=');
//
//		isChar('1');
//		isChar('A');
//		isChar('f');
//		isChar('!');
//		
//		isSpecial('1');
//		isSpecial('@');
//		isSpecial('s');

		String pw;
		while(true) {
			System.out.print("\n비밀번호를 입력하세요(8자리 이상): ");
			pw = scan.next();
			int leng = pw.length();
			
			if(leng < 8) {
				System.out.println("8자리 이상이어야 합니다.");
				continue;
			}
			
			//허용되지 않은 문자 감지
			//숫자, 알파벳, 특수문자 갯수 카운트
			int notCh = 0;
			char ch; 
			int cntInt = 0, cntChar = 0, cntSpec = 0; 
			
			for(int i = 0; i < leng; i++) {
				ch = pw.charAt(i);
				System.out.println(ch);
				if(ch < 32 || ch > 126) {
					System.out.println("입력 가능하지 않은 문자가 있습니다.");
					notCh = 1;
					break;
				}
				
				if(isInt(ch)) cntInt++; //숫자의 갯수를 cnt에 카운트
				if(isChar(ch)) cntChar++; //알파벳의 갯수를 cnt에 카운트
				if(isSpecial(ch)) cntSpec++; //특수문자의 갯수를 cnt에 카운트
			}
			if(notCh == 1) continue;
			
			//경고문
			if(cntInt == leng ||
				cntChar == leng ||
				cntSpec == leng) {
					System.out.println("영문자 또는 숫자 또는 특수문자만 단독 사용할 수 없습니다.");
					continue;
			}

			if(cntSpec == 0 && leng < 10) {
				System.out.println("특수문자 미포함 시 10자리 이상이어야 합니다.");
				continue;			
			}
				
			break;
		}
		
		System.out.println("\\n패스워드가 올바르게 만들어 졌습니다.");		 		
		System.out.println("PW: "+pw);

		
	}//main()

	static boolean isInt(char a) {
		if (a >= 48 && a <= 57) {
			System.out.println("int");
			return true;
		} else {
			System.out.println("no int");
			return false;
		}
	}

	static boolean isChar(char a) {
		if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
			System.out.println("char");
			return true;
		} else {
			System.out.println("no char");
			return false;
		}
	}

	static boolean isSpecial(char a) {
		if ((a >= 32 && a <= 47) || (a >= 58 && a <= 64) || (a >= 91 && a <= 96) || (a >= 123 && a <= 126)) {
			System.out.println("special");
			return true;
		} else {
			System.out.println("no special");
			return false;
		}
	}
}
