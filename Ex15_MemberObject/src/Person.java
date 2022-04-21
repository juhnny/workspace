
public class Person {

	String name;
	int age;
	
	//멤버값 출력하는 기능 메소드
	void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println();
	}
	
	//멤버값 입력하는 메소드
	void setField(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//생성자

	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		this("익명", 0);
	}
}
