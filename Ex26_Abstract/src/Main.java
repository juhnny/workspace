
public class Main {

	public static void main(String[] args) {
		
		//Animal을 상속하는 Tiger, Leopard, Panther class를 설계
		Animal ani = new Animal();
		ani.say(); //Animal 참조변수가 Animal 객체를 가리킬 때는 say()가 Animal의 say()
		
		//Animal 참조변수가 자식 객체를 가리킬 때는 오버라이드한 메소드가 발동
		ani = new Tiger();
		ani.say();
		
		ani = new Leopard();
		ani.say();
		
		ani = new Panther();
		ani.say();
		
		//직접 사용 목적이 아닌 Animal 객체를 만들어봐야 빈 메소드만 있고 클래스 개발자의 의도도 아님
		//그걸 문법적으로 제한하기 위해 만들어진 게 
		
		//abstract
		//이 키워드는 두 곳에 사용 가능. 추상 클래스와 추상 메소드
		//오버라이드용 메소드에는 어차피 내용도 필요 없으니 중괄호도 생략해버린, 형태가 없는 추상 메소드를 만듦
		//추상메소드를 하나라도 가진 클래스는 추상 클래스여야만 함. 추상 클래스가 추상 메소드를 갖지 않는 건 가능.
		//추상 클래스는 단독으로 객체를 생성할 수 없다. 참조변수를 만드는 건 무관.
//		new Bird(); //불가
		Bird bird;
		
		//자식 객체를 생성해 사용할 수밖에 없다. 그게 abstract의 목적이니까.
		//추상 클래스도 자식 객체를 생성하면 그 안에 함께 생성된다. 단독으로 생성할 수가 없을 뿐 객체를 만들 수 없는 건 아니다. 
		bird = new Crow(); //Bird() 생성자도 작동
		bird.a = 10;
		bird.b = 20; //Bird.b로 쓸 것을 권장
		bird.show();
		bird.say(); //오버라이드한 자식의 say() 작동		
		
		//추상 클래스의 사용 목적
		//자손 클래스에서 추상 메소드를 반드시 구현하도록 강요하기 위하여 사용
		//추상 클래스는 설계도의 가이드라인이라고 볼 수 있다.
		
		
		//익명 클래스 Anonymous class
		//Bird는 상속해서 쓰고 싶은데 클래스를 만들기엔 일회성으로밖에 안 쓰일 경우
		Bird bird2 = new Bird() { //Bird를 new 한 게 아니라 Bird의 내용을 상속받는 클래스를 설계하는 것임에 주의
			void say() {
				//부모의 추상 메소드를 여기서 구현해줘야 함. 오버라이드
				System.out.println("I'm an anonymous Bird");
			}; 
		};
		bird2.say();
		//익명클래스를 사용한다는 건 무조건 업캐스팅이라는 이야기
		//자식 참조변수에겐 타입 이름이 없기 때문에 부모 참조변수를 사용해서 자식 객체(익명)를 가리킬 수밖에 없다.
		
		//추상 메소드를 쓴다는 건 그 자식 객체들에서 그 메소드들을 반드시 쓰라는 것
		//추상 메소드들만 모아놓은 궁극의 추상 클래스가 바로 interface
		//interface = abstract class라고 생각해도 된다. 단, 추상 메소드만 사용 가능한.
		//interface도 abstract class도 컴파일하면 .class 파일이 된다. 내부 원리는 비슷할 거라는 이야기.
		//interface도 마찬가지로 new 불가
	}
}
