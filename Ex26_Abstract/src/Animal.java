
public class Animal {

	//�������̵�� �޼ҵ�
	void say() {
		System.out.println("for override");
	}
	
	//������ ���ٴ� �ǹ̷� �߰�ȣ�� �ٿ��� ����� ��ȭ�� ������ IDE�� �ڵ����� ����� ���� ������ �ǰ� ��ġ ������ �־�� �� ��ó�� ���δ�. 
	void aaa() {}
	//�׷��� ������ ���뵵 ������ �߰�ȣ�� �����ع���, ���°� ���� �߻� �޼ҵ带 ����
	//�߻�޼ҵ带 �ϳ��� ���� Ŭ������ �߻� Ŭ�������߸� ��. �߻� Ŭ������ �߻� �޼ҵ带 ���� �ʴ� �� ����.
//	abstract void bbb();
}

//������ ���� ��Ű���̴� �ٸ� Ŭ������ ���� ���Ͽ� ������
class Tiger extends Animal{
	void say() {
		System.out.println("I'm a tiger");
	}
}

class Leopard extends Animal{
	void say() {
		System.out.println("I'm a leopard");
	}
}

class Panther extends Animal{
	void say() {
		System.out.println("I'm a panther");
	}
}
