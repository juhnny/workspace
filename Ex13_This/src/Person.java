
public class Person {

	//������� private�� ����
	private String name;
	private int age;
	private char blood;
	
	//������� ���� �����ϴ� �޼ҵ�. public����.
	public void setPerson(String name, int age, char blood) {
		this.name = name;
		this.age = age;
		this.blood = blood;	
	}
	
	//������� ���� ����ϴ� �޼ҵ�
	public void getPerson() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(blood);
	}
	
	public Person(String name, int age, char blood){		
		this.name = name;
		this.age = age;
		this.blood = blood;
		System.out.println("Person(String name, int age) �ߵ�");
	}
	
	//this() ������
	
	//������ �����ε��� �ϴµ� �⺻���� �Ź� ���ֱⰡ ������.
	//���� �ʵ尡 30����? ������ �ϳ����� �⺻�� ������ ���ʹ��� �ݺ��ؾ�..
	//������ �̹� ���� �����ڸ� Ȱ���� �� �ְ� ���ִ� �� this() ������
	//�� Ŭ������ �����ڸ� ȣ���ϴ� ����
	//Person() ���� ������ ����.
	public Person(){
		//�ʵ��� �ʱ�ȭ �⺻���� �ְ� �ʹٸ� �׳� ���ָ� �ȴ�.
		this("�͸�", 0, '\0');
		System.out.println("Person() �ߵ�");
	}

	Person(String name){
//		System.out.println(); //����. this() �ʱ�ȭ ����� ���� ù �ٿ� �;� �Ѵ�.
		this(name, 0, '\0');
		System.out.println("Person(String name) �ߵ�");
	}
		
	//
	
	
}
