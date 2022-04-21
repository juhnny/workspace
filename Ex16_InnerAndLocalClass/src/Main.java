
public class Main {

	public static void main(String[] args) {

		ClassA a = new ClassA(); //�̳�Ŭ���� ��ü�� ���� ��������� ����
		
		//�̳�Ŭ������ �ܺο��� �׳��� �ν� �ȵ�
//		Inner inner; //����
		
		//�ƿ���Ŭ�������� ����ؾ� �̳�Ŭ�������� �ν�
		ClassA.Inner inner;
		
		//�ν��� ������ ���⼭ ��ٷ� ��ü ������ �Ұ���. �ܺο��� ����� �� ���� �Ϸ��� ���� �� �̳�Ŭ����. �������� ����.
		//��, �ƿ��� ��ü ���� �̳� ��ü�� ����� ������ ���ϵ��� �ϱ� ���� ���
		//���� ��� ���â�� Ȯ��/��� ��ư�� Ŭ�����ε� �� ��ư���� ���â�̶�� Ŭ���� ���̴� ������� �� ���Բ�.
//		ClassA.Inner inner2 = new ClassA.Inner(); //No enclosing instance of type ClassA is accessible.

		//�̳�Ŭ������ �ܺο��� ����ϰ� �ʹٸ� �ƿ��� ��ü(a)�� ���� ����� �̳� ��ü�� �����ϴ� �޼ҵ带 ���ؼ� �Ҵ������ ��
		ClassA.Inner inner3 = a.makeNiceInstance();
		
		//static inner class
		//�ƿ��� ��ü ���� ����ϴ� �̳� Ŭ����
		//�Ϲ� �̳�Ŭ������ ���� ��ó�� ��� �������� ������ �ƴ϶� Ŭ������ �Ҽ��� ǥ���ϰ� ���� �� ���
		//��) Builder��� Ŭ������ ������ ������ 
		//�׷� package�� ���� �Ǵ� �� �Ƴ�?
		//�̳�Ŭ������ ���� �ƿ��� Ŭ������ �Ϻ�(static ���)�� �� ��ó�� �� �� �־. ������ ���߿� �����ϴٰ�.
		
		//static������� ��� - ��ü�������� ���� ����
		System.out.println(ClassB.n);
		
		//static inner class - �ƿ��Ͱ�ü���� ����ϴ� �̳�Ŭ����
		ClassB.StaticInner sInner = new ClassB.StaticInner();
		System.out.println(sInner.k);
		
		
	}

}