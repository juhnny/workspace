
public class Main {

	public static void main(String[] args) {
		
		//ȸ������ ���
		//ȸ�� ����: �Ϲ�, �л�, ����, �ٷ����л�
		
		//1. �Ϲ�ȸ��	: �̸�, ����
		//2. �л�		: �̸�, ����, ����
		//3. ����		: �̸�, ����, ��������
		//4. �ٷ����л�	: �̸�, ����, ����, ����
		
		Person p = new Person("Kim", 20);
		p.show();
		System.out.println();
		
		Student s = new Student("Choi", 25, "Law");
		s.show();
		System.out.println();
		
		//������ �ٷ����л��� ����ϹǷ� ����
		
	}
}
