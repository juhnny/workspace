
public class ClassB extends ClassA {
	
	private int b;
	
	void showB() {
		//System.out.println("a : " + a); //error. �θ��� ��� a�� private -> �޼ҵ�� �о�;� ��
		showA();
		System.out.println("b: "+b);
		System.out.println();
	}
	
	public ClassB(int a, int b) {
		//super.a= a; //��� ���� �θ��� ����� private ����� ��� �Ұ�
		super(a);
		this.b = b;
		System.out.println("ClassB(int a, int b)");
	}
	
	public ClassB() {
		//ClassA �����ڰ� �����ִ�.
		System.out.println("ClassB()");
	}
	
	
}
