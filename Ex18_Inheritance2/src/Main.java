
public class Main {

	public static void main(String[] args) {
		
		//ClassA를 상속받은 ClassB 객체 생성
		new ClassB(); //ClassB의 생성자만 사용해도 ClassA 객체를 먼저 만들면서 ClassA 생성자를 먼저 사용한다.
		
		//ClassA를 상속받은 ClassB를 상속받은 ClassC 객체 생성
		//ClassA는 ClassC의 조부모 클래스
		new ClassC();
		
		//자바에서 다중상속은 허용하지 않음
		//public class ClassC extends ClassA, ClassB {} 이게 C++에서는 가능. 
		//하지만 다중상속한 클래스들의 부모가 같을 경우 변수명이 중복되는 경우가 생김. C++에서는 헤더파일에서 ifdef문으로 이런 문제를 해결
		//하지만 자바에서는 이걸 비효율적이라고 보고 빼버림
		
		//그런데 상속받은 멤버들이 맘에 안 들면?
		//자바에 부분상속이라는 개념은 없음. 객체 하나를 일부만 만드는 건 불가.
		//하지만 상속받은 메소드를 수정해 사용하는 법은 있다. - 메소드 오버라이딩

	}
}
