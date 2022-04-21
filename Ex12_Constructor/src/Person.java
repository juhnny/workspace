
public class Person {

	//멤버변수 private을 권장
	private String name;
	private int age;
	
	//멤버들의 값을 설정하는 메소드. public으로.
	public void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//멤버들의 값을 출력하는 메소드
	public void getPerson() {
		System.out.println(name);
		System.out.println(age);
	}
	
	//정석대로 접근제한자를 사용하면 Getter, Setter 메소드들도 만들어야 한다.
	
	//생성자 생성 규칙
	//1. 메소드의 이름은 클래스의 이름과 같음
	//2. 리턴타입을 적지 않음.
	//생성자 역시 메소드이므로 오버로딩 가능
	//실무에서도 파라미터가 있는 것과 없는 것을 다 만들어 둔다. 
	//생성자도 메소드이므로 접근제어가 가능. default 상태로는 다른 패키지에서 사용 불가.
	//일반적으로 생성자는 public으로 생성할 것을 권장. 십중팔구 public.
	public Person(){
		//필드의 초기화 기본값을 넣고 싶다면 그냥 써주면 된다.
		this.name = "익명";
		this.age = 0;
		System.out.println("Person() 발동");
	}

	public Person(String name, int age){		
		this.name = name;
		this.age = age;
		System.out.println("Person(String name, int age) 발동");
	}
	
	//파라미터가 일부만 있는 것도 물론 가능하긴 한데.. 안 쓰이지 않을까
	Person(String name){
		this.name = name;
		System.out.println("Person(String name) 발동");
	}
	
	//이클립스 자동완성 기능1
	//Person 치고 ctrl + space
	
	//이클립스 자동완성 기능2
	//우클릭 -> Source -> Generate constructor using Fields 혹은 
	//우클릭 -> Source -> Generate constructors using superclass
	
	
}
