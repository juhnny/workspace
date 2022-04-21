package member;

public class Person {

	//이름, 나이 (정보은닉)
	private String name;
	private int age;
	
	//멤버변수가 private이라면 반드시 멤버값을 대입해주는
	//기능메소드가 필수적으로 만들어져 있어야 함.
	//다른 패키지에서도 이 기능을 사용하도록 ... public 으로..
	public void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//필드값 출력도 메소드가 필요해짐
	public void show() {
		System.out.println(name);
		System.out.println(age);
	}
	
	//필드값 대입을 위한 함수들을 Setter 메소드라고 함
	//필드값 리턴을 위한 함수들을 Getter 메소드라고 함
	
	//이클립스 자동완성 사용

	//setA까지 치고 shift + space 눌러보면 이클립스에서 자동완성 제공
	//놓칠 수 있던 public까지 자동 완성
	
	//전체 자동완성도 제공
	//우클릭 - Source - Generate getters and setters
	
	public void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
		
}
