import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		//객체지향 프로그래밍 OOP(Object Oriented Programming)
		//객체 위주로 프로그래밍을 한다.
		//객체: 값(필드 = 멤버변수)과 기능(메소드 = 함수)을 가진 것
		//객체의 자료형을 class라고 부름
		//자바에서는 클래스를 기능별로 2000여 개 정도 만들어 놓음
		//이 2000여 개의 클래스를 Java System API라고 함
		//이런 객체들을 필요할 때 적재적소에 잘 불러서 사용하는 것이 중요

		//하지만 내가 원하는 기능이 다 있을 순 없으니...
		//사용자 정의 클래스(자료형)
//		class Robot{
//			void move() {
//				//...
//			}
//			
//			void attack() {
//				//...
//			}
//		}
//		
//		Robot r1 = new Robot();
		
		
		//class 작성이 가능한 위치
		// 1. 별도의 .java 파일에 만들기
		// 2. 하나의 .java 안에 여러 개의 class 설계
		// 3. 어떤 class 안에 또 다른 class를 설계
		// 4. 메소드 안에 class 설계
		// + 5. 익명 클래스

		//1. 별도의 문서에 만들기 - Second.java 파일에 Second 클래스 생성
		//다른 파일이어도 같은 폴더 안에 있으면 알아 듣는다.
		//별도의 문서에 만든 클래스 중 public인 클래스는 반드시 파일명과 클래스명이 같아야만 함
		//하나의 .java 안에서는 public 클래스가 하나만 있을 수 있다.
		Second second = new Second();
		
		second.a = 10; //필드에 값 대입
		second.show(); //메소드 호출
		
		
		//2. 하나의 문서 안에 여러 개의 class 설계 - Second.java 파일에 Second2 class 생성
		//하나의 .java 안에서는 public 클래스가 하나만 있을 수 있다.
		//다른 클래스들은 public 없이 선언해야 함 
		//파일명이 어느 클래스와 같아야 하는지 컴파일러가 알아야 해서
		
		//main 함수와 다른 패키지에 있는 .java 파일들은 대표 public class 하나와 그 클래스에 필요한 보조 클래스가 담기는 구조가 되겠군? 
		//다른 패키지에 있으면 public에만 접근할 수 있으니까 public 외의 클래스들은 어차피 다른 패키지에서 사용할 수도 없고. 
		
		
		//3. class 안에 class 설계
		//Inner class
		//이너클래스는 외부에서 인식은 되지만 직접 사용할 수 없음
		//Outer class, 지금의 경우 Second 객체만이 SecondInner 객체를 생성할 수 있음. - 추후 3일차 수업에 소개
		//bin\Second$SecondInner.class

//		new Second.SecondInner();
		
		
		//4. 메소드 안에 class 설계 - Second.java 파일의 Second class의 show() 안에 SecondLocal class 생성
		//지역 클래스(Local class) 혹은 내장 클래스
		//지역변수와 마찬가지로 지역(중괄호) 내에서만 인식됨
		//지역클래스는 밖에서 아예 인식조차 되지 않음.
		//bin\Second$1SecondLocal.class

//		new Second.;//
		
		
		//5. 익명 클래스
		//객체 생성을 하면서 중괄호를 열고 클래스를 임시 수정할 수 있는데 
		//내부적으로는 그 클래스를 상속받은 sub클래스를 만드는 것.
		
		//bin\Main$1.class
		Second2 sec2 = new Second2() {
			void show() {
				System.out.println("anonymous class1");
			}
		};
		sec2.show();
		
		//bin\Main$2.class
		Second2 sec3 = new Second2() {
			void show() {
				System.out.println("anonymous class2");
			}
		};
		sec3.show();
		
	}
}
