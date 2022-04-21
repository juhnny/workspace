
public class Main {

	public static void main(String[] args) {
		
		//상속 Inheritance
		//다른 클래스의 설계를 가져와 새로운 기능을 추가하는 기법
		//상속받은 클래스의 객체를 만들면 자동으로 상속해준 클래스도 객체 내부에 같이 생성됨
		ClassB b = new ClassB();
		b.a = 10; //상속받은 클래스의 멤버를 내 것처럼
		
		//상속관계 호칭
		//상위 - 하위
		//C#: parent(부모) - child(자식)
		//java: super - sub
		//C++: bass(기반) - driven(파생)
		
		//객체지향은 멤버변수 제어를 직접 접근(.) 연산자로 하는 것을 권장하지 않음
		//멤버값 출력은 객체 스스로 하도록 메소드를 만들어 사용
		b.showA(); //부모 클래스의 메소드도 내 것인양
		b.showB(); //자식 클래스 메소드
		
		//ClassA, B를 따로 출력하지 말고 한번에 출력하도록 설계하는 게 더 적절
		b.show(); 
		
		//입력기능도 만들자
		b.setFields(100, 200);
		b.show();
		
		//생성자도 만들자
		ClassB b2 = new ClassB(1000, 2000);
		b2.show();
		
	}
}
