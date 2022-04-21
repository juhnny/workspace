import member.Person;

public class Main {
	
	public static void main(String[] args) {
		
		//���� ������
		//OOP������ ��ü�� ����������� �ܺηκ��� ��ȣ�ϴ� ���� �߿��ϰ� ��
		//ĸ��ȭ, ���������� ����. �ܺο����� �׳� ���(�޼ҵ�)�� ������. �ȿ� �ִ� ���� �Ժη� �ǵ帮�� ��
		
		//���� �������� ���� 4����(���� ��->�� ����)
		//1. private	: Ŭ���� ���ο����� ���� ����
		//2. (default)	: ���� ��Ű�� ������ ���� ������(.)�� ���� ����. �ٸ� ��Ű�������� ���� �Ұ�. package ���������̶�� �θ�
		//3. protected	: default�� ����. ��, �ٸ� ��Ű������ ��Ӱ����� Ŭ������� ���� ����
		//4. public		: ��� �������� ���� ������(.)�� ���� ����
		
		//���������ڴ� �� ���� ���� ���� : Ŭ����, �ʵ�, �޼ҵ�
		
		//Ŭ�������� ����
		//�� Ŭ���� ���� private class First - private class�� �̳� Ŭ�������� ���� ���� 
		//���� ��Ű���� (default) class Second
		//�ٸ� ��Ű���� protected class Third
		//�ٸ� ��Ű���� public class Fourth
		
		new First(); //private static inner class
		new Second(); //default
//		new pack.one.Third(); //�ٸ� ��Ű���� protected class ���� �Ұ�
		new pack.one.Fourth(); //public
		
		//�ʵ�, �޼ҵ��� ����
		//���� ��Ű���� (default) class Second
		Second sec = new Second();
		
//		sec.a = 10; //a�� private. �� �� ��Ÿ���� ����. ������ a�� ���� �־�� �ص� �Ұ�
		sec.b = 20;
		sec.c = 30;
		sec.d = 40;
		
//		sec.showPrivate(); // private. �� �� ��Ÿ���� ����
		sec.showDefault();
		sec.showProtected();
		sec.showPublic();
		
		//�ٸ� ��Ű���� public class Fourth
		pack.one.Fourth four = new pack.one.Fourth();

//		four.a = 10; //private
//		four.b = 10; //�ٸ� ��Ű������ ���� �Ұ�
//		four.c = 10; //�ٸ� ��Ű������ ���� �Ұ�
		four.d = 10; //�ٸ� ��Ű�������� public�� ���� ����! 
		
//		four.showPrivate(); //private
//		four.showDefault(); //�ٸ� ��Ű������ ���� �Ұ�
//		four.showProtected(); //�ٸ� ��Ű������ ���� �Ұ�
		four.showPublic(); //�ٸ� ��Ű�������� public�� ���� ����! 
		
		
		//OOP������ �⺻������ ���������� �߿��ϱ� ������
		//�ʵ�� �ܺο� �������� �ʵ��� private ����
		//�޼ҵ�� ����� ����� �� �ְ� public ����
		
		//�ٸ� �׷��� �ϸ� �ʵ尪 ������ ���� �� �� ���� ������ �ʵ尪 ������ ��� �޼ҵ�(������ ����)�� ���� �ؾ� ��
		//�ʵ尪�� �о�� ���� �����Ƿ� ��� �� ��ȯ �޼ҵ嵵 �ʿ�����

		//�ʵ尪 ������ ���� �Լ����� Setter �޼ҵ��� ��
		//�ʵ尪 ������ ���� �Լ����� Getter �޼ҵ��� ��
		
		//��Ŭ���� �ڵ��ϼ� ���

		//setA���� ġ�� shift + space �������� ��Ŭ�������� �ڵ��ϼ� ����
		//��ĥ �� �ִ� public���� �ڵ� �ϼ�
		
		//��ü �ڵ��ϼ��� ����
		//��Ŭ�� - Source - Generate getters and setters
		
		//��) �� ����� ���� ����: �̸�, ����
		Person p = new Person();
		p.setPerson("Sam", 10);
		p.show();
		
		p.setName("Sammy");
		//p.setAge; //setAge()�� default�� ���־� �ٸ� ��Ű������ �о�� �� �����Ƿ� public�� ���� ���� ������.
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
	}
	
	//private class�� �̳�Ŭ���������� ���� �� �ִ�. 
	//inner class�� static�� �ʿ��ϳ�? �� �ʿ��ϰ� private���� ����� ���� �����غ���.
	private static class First{
		//���� �����ڸ� �ο��� �ʵ�
		private int a;
		int b;
		protected int c;
		public int d;
		
		void show() {
			System.out.println("I'm private static class First");
		}

	}
}

