import java.util.Random;
import java.util.Scanner;

public class Ex03_Random {

	public static void main(String[] args) {
		
		//랜덤값을 만들어 리턴해주는 기능들을 가진 클래스
		//자바에서는 객체생성을 반드시 Heap에만 할 수 있음
		//new 키워드로 Heap에 객체 생성
		Random rnd = new Random();
		int n;
		
		n = rnd.nextInt(); //-21억 ~ 21억
		System.out.println(n);
		
		n = rnd.nextInt(50); //50미만. 
		System.out.println(n);
		
		//시작지점을 정하고 싶으면? 클래스는 따로 없다.
		n = rnd.nextInt(10) + 5; //5~14
		System.out.println(n);
		
		//숫자 맞추기 게임 (500~ 1000 사이)
//		int com = rnd.nextInt(501) + 500;
//		int me = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		while(true) {
//			System.out.print("Guess a number: ");
//			me = scan.nextInt();
//			
//			if(me>com) System.out.println("Under");
//			else if(me<com) System.out.println("Over");
//			else {
//				System.out.println("That's it!");
//				break;
//			}
//		}
		
		//boolean형
		boolean bool = rnd.nextBoolean();
		System.out.println(bool);
		
		//double형 
		double dou = rnd.nextDouble(); //0 이상 1 미만의 값. 곱해서 사용함
		System.out.println(dou);
		
		dou = rnd.nextDouble() * 10; //0 이상 1 미만의 값. 곱해서 사용함
		System.out.println(dou);
		
		
		//숫자 야구
		
		//컴퓨터측 숫자 만들기. 중복되지 않는 세 자리 숫자 출력
		int c1 = rnd.nextInt(9) + 1;
		int c2;
		int c3;
		while(true) {
			c2 = rnd.nextInt(10);
			if(c1 != c2) break;
		}
		while(true) {
			c3 = rnd.nextInt(10);
			if((c2 != c3) && (c1 != c3)) break;
		}

		System.out.println("Com: "+c1+c2+c3);
		
		//유저 입력 받기. 중복되지 않는 세 자리 숫자
		int numb; int m1, m2, m3;
		while(true) {
			System.out.print("input a 3-digit number: ");
			Scanner scan = new Scanner(System.in);
			numb = scan.nextInt();
			
			if(numb < 101 || numb > 987) continue;
			
			m1 = (numb-(numb%100))/100;
//			System.out.println(m1);

			m2 = ((numb % 100) - (numb % 10))/10 ;
//			System.out.println(m2);
			
			m3 = numb % 10;
//			System.out.println(m3);
			
			if(m1 == m2 || m1 == m3 || m2 == m3) continue;
			else break;
		}
		
		//Strike, Ball 계산 및 결과 출력
		int str = 0, ball = 0;
		
		if(c1 == m1) str++;
		if(c2 == m2) str++;
		if(c3 == m3) str++;
		if(c1 == m2 || c1 == m3) ball++;
		if(c2 == m1 || c2 == m3) ball++;
		if(c3 == m1 || c3 == m2) ball++;
	
		if(str == 3) System.out.println("Gotcha!!!");
		else System.out.println(str+" Strike "+ball+" Ball");
		
		//다음엔 9번 초과 트라이 시 패배 처리하는 것도 추가해보자.
		
		
		
		
		

	}
}
