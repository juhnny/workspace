
public class Second {

	// Main �Լ��� ������Ʈ ���� ��ü�� �ϳ��� �־�� �Ѵ�. ������ Main Ŭ���� �ȿ� Main �Լ��� ������ ���⿡�� ����� �ȵȴ�.

	// 1. �ʵ�(��� ����) : ������ ����
	int a;

	// 2. �޼ҵ�(��� �Լ�) : ���
	void show() {
		System.out.println("Second.show @Second.java");

		// Inner class�� Outer class �������� ��� ����
		new SecondInner();

		// ��������
		int k; // k�� Ŭ���� �ȿ� ������ �޼ҵ� �ȿ� ������ ������� �ƴ�. ����������. show() �ۿ����� k�� �� ���µ� ������ �� ���� ����.

//		new SecondLocal(); //�Ϲ� Ŭ������ �̳� Ŭ������ Ŭ���� ���𺸴� �� ���������� ��ü�� ���� �� ������ ���� Ŭ������ ������ �߿�.  

		// ���� Ŭ����(Local class) Ȥ�� ���� Ŭ����
		// ���������� ���������� ����Ŭ������ ������ ����� �ν� �Ұ�
		class SecondLocal {

		}

		new SecondLocal();
	}

	
	void test() {
//		new SecondLocal(); //���������� ���������� ����Ŭ������ ������ ����� �ν� �Ұ�
	}

	
	// Inner class �߰�
	// Inner class�� �߰��Ǹ� �ٱ� Ŭ������ Outer class�� �ȴ�.
	// Second$SecondInner.class
	class SecondInner {
//		System.out.println("Why it isn't working?");
	}


}


class Second2 {
	void show() {
		System.out.println("Second2.show @Second.java");
	}
}
//�� ���� �ȿ� �� ���� Ŭ������ �ִ�.
//������ .class ����Ʈ ������ Ŭ�������� �����. 
//��ǻ�Ͱ� ���� �� src ������ �ƴ϶� bin ���� ���̴�.
//src ������ �����ڰ� ���� ����. ��ǻ�ʹ� ������ ����.