
public class Main {

	public static void main(String[] args) {
		
		//Ŭ������ ����� �ٸ� Ŭ������ ���������� �ִ� ��쿡 ���� ������� �н�
		Member m= new Member();
		System.out.println( m.no ); //0
		System.out.println( m.p );  //null
		System.out.println();
		
		//����� ����
		m.no = 10;
		m.p = new Person(); //���� ���������� ��ü���� �����Ͽ� ����.
		
		//��� ���������� ������� ������ �ʿ�
		//���� ������ �ʱⰪ ����
		m.p.name = "Sam";
		m.p.age = 22;
		
		//����� ���
		System.out.println(m.no ); //10
		System.out.println(m.p); //�������� .toString();
		//p�� ����Ű�� Person Ŭ������ ������� ��������..
		System.out.println(m.p.name);
		System.out.println(m.p.age);
		System.out.println();
		
		//��ü�����̴ϱ� ��ü�� ���� ��ü ������ ����ϵ��� ����.
		//�켱 Person Ŭ������ ��� �޼ҵ� �߰�
		m.p.show();
		//Member Ŭ�������� ��� �޼ҵ� �߰�..�ؾ� �ϴµ� Person�� ��±���� �̿��� show()�� ������.
		m.show();
		
		//���� ����� ����� �Էµ� ���ϰ� �� �� ������?
		//�켱 Person Ŭ������ �Է� �޼ҵ� �߰�
		m.p.setField("Tim", 30);
		//Member Ŭ�������� �Է� �޼ҵ� �߰�.. Person�� �Է±���� �̿�����.
		m.setField(11, "John", 40);
		m.show();
		
		//NullPointerException ����!
		Member m2 = new Member(); 
		m2.show(); //NullPointerException ����
		//���� m2�� ����� �������� p�� null�� ���¶��(��ü �Ҵ��� ������ �ʾҴٸ�) p�� ����� show()���� ������ �߻�
		//����� Ŭ����(��������)�� ���� �� null ���������� ����ϴ� ��찡 ������ ����� �ʱ�ȭ�� ������ �ܰ迡�� ���������� ��ü�� new ���� �ʿ䰡 �ִ�!
		
		
	}
}
