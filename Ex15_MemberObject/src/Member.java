
public class Member {

	int no;   //ȸ����ȣ
	Person p; //ȸ���������� [�̸�,����]
//	Person p = new Person(); //���������� ����� �ʱ�ȭ Ȥ�� �����ڿ��� ��ü �Ҵ��� ���־�� NullPointerException�� ���� �� �ִ�. 
	
	//Person�� show()�� �̿��� show()
	void show() {
		System.out.println("no: "+no);
		p.show();
	}
	
	//Person�� setField()�� �̿��� setField()
	void setField(int no, String name, int age) {
		this.no = no;
//		this.p.name = name;
//		this.p.age = age; //�̹� ������� Person�� �޼ҵ� ���
		this.p.setField(name, age);
	}
	
	//Person�� �����ڸ� Ȱ���� ������
	
	public Member(int no, String name, int age) {
		this.no = no;
		this.p = new Person(name, age); //���������� ����� �ʱ�ȭ Ȥ�� �����ڿ��� ��ü �Ҵ��� ���־�� NullPointerException�� ���� �� �ִ�. 
	}

	public Member() {
		this(-1, "�͸�", 0);
	}
	
	//�̰͵� �����ϱ� ��
	public Member(int no, Person p) {
		this.no = no;
		this.p = p;
	}
}