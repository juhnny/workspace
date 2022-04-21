
public class Main {

	public static void main(String[] args) {
		
		//추상 클래스의 사용 목적
		//자손 클래스에서 추상 메소드를 반드시 구현하도록 강요하기 위하여 사용
		//추상 클래스는 설계도의 가이드라인이라고 볼 수 있다.
		
		//추상 메소드를 쓴다는 건 그 자식 객체들에서 그 메소드들을 반드시 쓰라는 것
		//추상 메소드들만 모아놓은 궁극의 추상 클래스가 바로 interface
		//interface = abstract class라고 생각해도 된다. 단, 추상 메소드만 사용 가능한.
		//interface도 abstract class도 컴파일하면 .class 파일이 된다. 내부 원리는 비슷할 거라는 이야기.
		//interface도 마찬가지로 new 불가
		
		//interface의 특징들
		//0. 단독으로 객체 생성 불가
//		new TypeA;
		
		//1. 필드는 public static final 변수만 사용 가능.
		//인터페이스 안에서는 인스턴스 변수, static 변수를 만들 수 없음
		
		//2. 접근 제한자는 public만 가능!
		//접근 제한자를 명시하지 않으면 자동으로 public. (default)가 아님에 주의!

		//3. 메소드는 추상 메소드, default, static 메소드만 사용 가능.
		TypeA typeA = new Usb1();
		typeA.funcPubAbs();
		typeA.funcDef();
		TypeA.funcPubSta();
		
		//4. 클래스를 통해 상속받아 기능을 구현해야만 사용이 가능함.
		//인터페이스를 사용한 클래스라면 그 인터페이스의 기능을 모두 갖고 있을 것이라고 확신할 수 있음
		
		//5. 인터페이스의 구현도 상속과 같은 개념이므로 부모-자식 관계. 업캐스팅 가능. 업캐스팅해서 사용해야만 하고.
		typeA = new Usb1();
		
		//6. 인터페이스도 클래스의 일종이므로 이너클래스를 가질 수 있음. 
		TypeA.Inner inner = new TypeA.Inner(); //public static이라 외부에서 바로 new 가능
		inner.show();
		
		//7. 인터페이스에서 클래스로 다중구현 가능
		//클래스에서 클래스로는 다중상속 불가(다이아몬드 문제 때문)
		Usb2 usb2 = new Usb2();
		usb2.ddd();
		
		//8. 인터페이스에서 인터페이스로 다중상속도 가능.(TypeC)
		Usb3 usb3 = new Usb3();
		usb3.eee();
		
	}
}
