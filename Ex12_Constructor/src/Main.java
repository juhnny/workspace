
public class Main {

	public static void main(String[] args) {
		
		//생성자 Constructor
		//객체가 생성될 때 자동으로 발동하는 특별한 메소드
		
		//객체생성 후 언제나 멤버값 설정하는 작업을 하게 되는 것이 일반적
		Person p = new Person();
		p.setPerson("Sam", 20);
		p.getPerson();
		
		//Person 인스턴스를 만들 때마다 멤버값 설정을 따로 해줘야 하는 게 번거롭다. 
		//대입 말고 초기화할 수 있을까? 해서 나온 게 생성자
		
		//생성자 생성 규칙
		//1. 메소드의 이름은 클래스의 이름과 같음
		//2. 리턴타입을 적지 않음
		//생성자 역시 메소드이므로 오버로딩 가능
		//실무에서도 파라미터가 있는 것과 없는 것, 최소한 두 개를 만들어 둔다. 
		//생성자도 메소드이므로 접근제어가 가능. default 상태로는 다른 패키지에서 사용 불가.
		//일반적으로 생성자는 public으로 생성할 것을 권장. 십중팔구 public.
		
		new Person();
		new Person("Ko");
		new Person("Kim", 35);
		

		
		
		//어, 근데 이렇게도 되는데?
		int a, b;
		b = a = 5;
		System.out.println(a);
		System.out.println(b);
		
		//Person p2 = new Person() = {"Tim", 30} //이런 모양이나
		//Person p2 = new Person(){"Tim", 30} //배열처럼 이런 모양의 초기화 문법도 가능하지 않았을까?
		//위에 것은 중괄호 영역이 Person()과 떨어져 있어서 안된다 쳐도 아래 것은 괜찮아 보이는데 ㅎㅎ		
		
	}
}
