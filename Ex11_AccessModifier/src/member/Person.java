package member;

public class Person {

	//�̸�, ���� (��������)
	private String name;
	private int age;
	
	//��������� private�̶�� �ݵ�� ������� �������ִ�
	//��ɸ޼ҵ尡 �ʼ������� ������� �־�� ��.
	//�ٸ� ��Ű�������� �� ����� ����ϵ��� ... public ����..
	public void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//�ʵ尪 ��µ� �޼ҵ尡 �ʿ�����
	public void show() {
		System.out.println(name);
		System.out.println(age);
	}
	
	//�ʵ尪 ������ ���� �Լ����� Setter �޼ҵ��� ��
	//�ʵ尪 ������ ���� �Լ����� Getter �޼ҵ��� ��
	
	//��Ŭ���� �ڵ��ϼ� ���

	//setA���� ġ�� shift + space �������� ��Ŭ�������� �ڵ��ϼ� ����
	//��ĥ �� �ִ� public���� �ڵ� �ϼ�
	
	//��ü �ڵ��ϼ��� ����
	//��Ŭ�� - Source - Generate getters and setters
	
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
