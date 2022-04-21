
public class Second {

	// Main 함수는 프로젝트 폴더 전체에 하나만 있어야 한다. 지금은 Main 클래스 안에 Main 함수가 있으니 여기에는 만들면 안된다.

	// 1. 필드(멤버 변수) : 데이터 저장
	int a;

	// 2. 메소드(멤버 함수) : 기능
	void show() {
		System.out.println("Second.show @Second.java");

		// Inner class는 Outer class 내에서만 사용 가능
		new SecondInner();

		// 지역변수
		int k; // k는 클래스 안에 있지만 메소드 안에 있으면 멤버변수 아님. 지역변수임. show() 밖에서는 k를 못 쓰는데 멤버라고 할 수가 없다.

//		new SecondLocal(); //일반 클래스와 이너 클래스는 클래스 선언보다 위 순서에서도 객체를 만들 수 있지만 지역 클래스는 순서가 중요.  

		// 지역 클래스(Local class) 혹은 내장 클래스
		// 지역변수와 마찬가지로 지역클래스도 지역을 벗어나면 인식 불가
		class SecondLocal {

		}

		new SecondLocal();
	}

	
	void test() {
//		new SecondLocal(); //지역변수와 마찬가지로 지역클래스도 지역을 벗어나면 인식 불가
	}

	
	// Inner class 추가
	// Inner class가 추가되면 바깥 클래스는 Outer class가 된다.
	// Second$SecondInner.class
	class SecondInner {
//		System.out.println("Why it isn't working?");
	}


}


class Second2 {
	void show() {
		System.out.println("Second2.show @Second.java");
	}
}
//한 문서 안에 두 개의 클래스가 있다.
//하지만 .class 바이트 문서는 클래스별로 생긴다. 
//컴퓨터가 보는 건 src 폴더가 아니라 bin 폴더 뿐이다.
//src 폴더는 개발자가 보는 폴더. 컴퓨터는 관심이 없다.