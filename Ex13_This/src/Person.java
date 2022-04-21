
public class Person {

	//멤버변수 private을 권장
	private String name;
	private int age;
	private char blood;
	
	//멤버들의 값을 설정하는 메소드. public으로.
	public void setPerson(String name, int age, char blood) {
		this.name = name;
		this.age = age;
		this.blood = blood;	
	}
	
	//멤버들의 값을 출력하는 메소드
	public void getPerson() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(blood);
	}
	
	public Person(String name, int age, char blood){		
		this.name = name;
		this.age = age;
		this.blood = blood;
		System.out.println("Person(String name, int age) 발동");
	}
	
	//this() 생성자
	
	//생성자 오버로딩을 하는데 기본값을 매번 써주기가 귀찮아.
	//만약 필드가 30개면? 생성자 하나마다 기본값 대입을 수십번씩 반복해야..
	//위에서 이미 만든 생성자를 활용할 수 있게 해주는 게 this() 생성자
	//본 클래스의 생성자를 호출하는 문법
	//Person() 같은 문법은 없다.
	public Person(){
		//필드의 초기화 기본값을 넣고 싶다면 그냥 써주면 된다.
		this("익명", 0, '\0');
		System.out.println("Person() 발동");
	}

	Person(String name){
//		System.out.println(); //에러. this() 초기화 명령은 가장 첫 줄에 와야 한다.
		this(name, 0, '\0');
		System.out.println("Person(String name) 발동");
	}
		
	//
	
	
}
