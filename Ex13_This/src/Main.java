
public class Main {
	
	public static void main(String[] args) {
		
		//this() 생성자
		
		//생성자 오버로딩을 하는데 기본값을 매번 써주기가 귀찮아.
		//만약 필드가 30개면? 생성자 하나마다 기본값 대입을 수십번씩 반복해야..
		//위에서 이미 만든 생성자를 활용할 수 있게 해주는 게 this() 생성자
		//본 클래스의 생성자를 호출하는 문법
		//Person() 같은 문법은 없다.
		Person p = new Person();
		
		//초기화 단계(순서)
		//기본값 초기화 -> 명시적 초기화 -> 초기화 블럭 -> 생성자
		Initialization ini = new Initialization();
//		System.out.println(ini.c);
		
	}
}
