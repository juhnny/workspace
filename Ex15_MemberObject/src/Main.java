
public class Main {

	public static void main(String[] args) {
		
		//클래스의 멤버로 다른 클래스의 참조변수가 있는 경우에 대한 고려사항 학습
		Member m= new Member();
		System.out.println( m.no ); //0
		System.out.println( m.p );  //null
		System.out.println();
		
		//멤버값 대입
		m.no = 10;
		m.p = new Person(); //먼저 참조변수에 객체부터 생성하여 대입.
		
		//멤버 참조변수의 멤버에도 대입이 필요
		//대입 전에는 초기값 상태
		m.p.name = "Sam";
		m.p.age = 22;
		
		//멤버값 출력
		System.out.println(m.no ); //10
		System.out.println(m.p); //참조값의 .toString();
		//p가 가리키는 Person 클래스의 멤버까지 출력해줘야..
		System.out.println(m.p.name);
		System.out.println(m.p.age);
		System.out.println();
		
		//객체지향이니까 객체의 값은 객체 스스로 출력하도록 하자.
		//우선 Person 클래스에 출력 메소드 추가
		m.p.show();
		//Member 클래스에도 출력 메소드 추가..해야 하는데 Person의 출력기능을 이용한 show()를 만들자.
		m.show();
		
		//이제 멤버의 멤버값 입력도 편하게 할 수 없을까?
		//우선 Person 클래스에 입력 메소드 추가
		m.p.setField("Tim", 30);
		//Member 클래스에도 입력 메소드 추가.. Person의 입력기능을 이용하자.
		m.setField(11, "John", 40);
		m.show();
		
		//NullPointerException 주의!
		Member m2 = new Member(); 
		m2.show(); //NullPointerException 주의
		//아직 m2의 멤버인 참조변수 p가 null인 상태라면(객체 할당을 해주지 않았다면) p를 사용한 show()에서 에러가 발생
		//멤버로 클래스(참조변수)가 있을 땐 null 참조변수를 사용하는 경우가 없도록 명시적 초기화나 생성자 단계에서 참조변수에 객체를 new 해줄 필요가 있다!
		
		
	}
}
