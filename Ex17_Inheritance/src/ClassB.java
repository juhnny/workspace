
public class ClassB extends ClassA {
	
	//�׳� ���� �ƹ� ����� ���� ��ó�� ��������
	//��ӹ��� �͸����ε� ClassA�� ����� �̹� ������ ����.
	//�޸𸮻����ε� ClassB ��ü �ȿ� ClassA�� �����ϰ� �ȴ�. ClassA�� �ٸ� ���� �����ϴ� �� �ƴ�.
	
	//������� �߰�
	int b;
	
	void showB() {
		System.out.println("b @ClassB : "+b);
	}
	
	//����� �޾����� �θ� Ŭ������ ����� �θ� �ϰ� ��~!
	void show() {
		//��ӹ��� �θ� Ŭ������ �޼ҵ带 �� �� ȣ���ϵ�
		showA();
	
		System.out.println("b @ClassB : "+b);			
	}
	
	//�Է� �޼ҵ�
	void setFields(int a, int b) {
//		this.a = a; //������ �ƴ����� ������ ���� a ������ ClassB ��ü ���� �ƴϹǷ� this Ű���尡 �����. 
					//�θ� Ŭ������ ����� �����ϴ� Ư���� Ű����, super. thisó�� ��������.
					//����� �θ��� �θ� Ŭ������ �����ϴ� Ű����� ����.
		super.a = a;
//		setFieldsA(a);
		this.b = b;
	}
	
	//������
	public ClassB(int a, int b){
		super.a = a;
		this.b = b;
	}
	
	public ClassB(){
		this(-1, -2);
	}
}
