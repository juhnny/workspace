
public class Person {

	String name;
	int age;
	
	//����� ����ϴ� ��� �޼ҵ�
	void show() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println();
	}
	
	//����� �Է��ϴ� �޼ҵ�
	void setField(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//������

	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		this("�͸�", 0);
	}
}
