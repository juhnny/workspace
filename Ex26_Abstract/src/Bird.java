//abstract class�� ������
//�̿� �ϴ� �� Animal�� �ڽ����� ������. 
public abstract class Bird extends Animal{
	
	//�߻� Ŭ������ �Ϲ� Ŭ������ �����ϰ� ����� �� ���� �� �ִ�.
	int a; //�Ϲ����� ������� - �ν��Ͻ� ����
	static int b; //static ������� - Ŭ���� ����
	
	//�ν��Ͻ� �޼ҵ�. ���� static �޼ҵ嵵 ����
	void show() {
		System.out.println("show() of Bird");
	}
	
	//�߻� �޼ҵ� 
	//�߻� �޼ҵ忡 static�� �Ұ���. ����ϱ� ���� �� �ƴϴϱ� �׷�����.
	//���������ڴ� ��� ����. ��, private �Ұ�. 
	//abstract method�� �ܺ� Ŭ�������� �������̵������� ����ϱ� ���� �޼ҵ��ε� �ܺο��� �� ���� �ϸ� �ȵż� �׷� ��
	abstract void say(); //�߻� �޼ҵ忡�� �߰�ȣ ��� �Ұ�. ������ �ڽ� Ŭ�������� �Ѵ�.
	
	//������
	public Bird() {
		System.out.println("Bird() ������");
	}
}


class Crow extends Bird {
	//�߻� Ŭ������ ��ӹ��� �̷� ������ ���. 
	//The type Crow must implement the inherited abstract method Bird.say()
	//�߻� �޼ҵ带 ���� �߻� Ŭ������ ��ӹ��� Ŭ���������� �ݵ�� �� �޼ҵ带 �������̵��Ͽ� ����� �����ؾ� �Ѵ�.
	@Override
	void say() {
		System.out.println("I'm a Crow");
	}
	
	//������
	public Crow() {
		System.out.println("Crow() ������");
	}
}

class Dove extends Bird {
	@Override
	void say() {} //�������̵��� ���� �޼ҵ忡 ������ ��� ������ �ƴϴ�. 
	//������ �̷��� � �ڽĿ����� ���� � �ڽĿ����� �� �� �Ŷ�� �߻� �޼ҵ�� ������ �ʾ��� ���̴�.
	//�߻� �޼ҵ�� ������ ���� �� �޼ҵ带 ��ӹ޾� �� ������ �ϴ� Ŭ���� �������� �ǵ��� �ݿ��� ���̴�.
}

