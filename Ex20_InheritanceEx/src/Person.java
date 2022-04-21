
//일반회원
public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
		this("no name", 0);
	}

	public void show() {
		System.out.println(name);
		System.out.println(age);
	}

}

