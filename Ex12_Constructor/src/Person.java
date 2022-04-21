
public class Person {

	//������� private�� ����
	private String name;
	private int age;
	
	//������� ���� �����ϴ� �޼ҵ�. public����.
	public void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//������� ���� ����ϴ� �޼ҵ�
	public void getPerson() {
		System.out.println(name);
		System.out.println(age);
	}
	
	//������� ���������ڸ� ����ϸ� Getter, Setter �޼ҵ�鵵 ������ �Ѵ�.
	
	//������ ���� ��Ģ
	//1. �޼ҵ��� �̸��� Ŭ������ �̸��� ����
	//2. ����Ÿ���� ���� ����.
	//������ ���� �޼ҵ��̹Ƿ� �����ε� ����
	//�ǹ������� �Ķ���Ͱ� �ִ� �Ͱ� ���� ���� �� ����� �д�. 
	//�����ڵ� �޼ҵ��̹Ƿ� ������� ����. default ���·δ� �ٸ� ��Ű������ ��� �Ұ�.
	//�Ϲ������� �����ڴ� public���� ������ ���� ����. �����ȱ� public.
	public Person(){
		//�ʵ��� �ʱ�ȭ �⺻���� �ְ� �ʹٸ� �׳� ���ָ� �ȴ�.
		this.name = "�͸�";
		this.age = 0;
		System.out.println("Person() �ߵ�");
	}

	public Person(String name, int age){		
		this.name = name;
		this.age = age;
		System.out.println("Person(String name, int age) �ߵ�");
	}
	
	//�Ķ���Ͱ� �Ϻθ� �ִ� �͵� ���� �����ϱ� �ѵ�.. �� ������ ������
	Person(String name){
		this.name = name;
		System.out.println("Person(String name) �ߵ�");
	}
	
	//��Ŭ���� �ڵ��ϼ� ���1
	//Person ġ�� ctrl + space
	
	//��Ŭ���� �ڵ��ϼ� ���2
	//��Ŭ�� -> Source -> Generate constructor using Fields Ȥ�� 
	//��Ŭ�� -> Source -> Generate constructors using superclass
	
	
}
