
public class ClassA {
	
	public int a = 5;	//�������
	public static int b = 5; //����(static) �������
	
	//Ŭ������ Heap�� �������
	//���������� Stack�� ������� Heap�� Ŭ������ ����Ŵ
	//�������� a�� Stack�� �������
	//static ���� b�� Method ����(C������ Code ������ Data ������ ��ģ ����)�� �������
	
	//static ������ �� Ŭ������ ��ü�� �ƹ��� ���� ���� Method ������ �ϳ��� ����
	
	//�ʱ�ȭ ��
	{
		a = 3;
//		b = 3;
		System.out.println("instance �ʱ�ȭ ��"); //��ü�� ������ ������ ����
	}
	
	//static �ʱ�ȭ ��
	static
	{
//		a = 7; //static �ʱ�ȭ �� ������ �ν��Ͻ� ������ ��� �Ұ�
		b = 7;
		System.out.println("static �ʱ�ȭ ��"); //ó�� Ŭ������ ���� �� �� �ѹ��� �ʱ�ȭ
	}
	//static ���� �ʱ�ȭ�� �Ϲ� �ʱ�ȭ �� �������� �� ���� �ʴ´�. ���� static ������, �ν��Ͻ� ���������� �������ִ� �� ����.
	
	//������
	public ClassA(int a, int b) {
		this.a = a;
//		this.b = b; //������ �޼ҵ� ���� static ������ �����ϴ� ���๮�� ������ ClassA ��ü�� ���� ������ b�� ���ԵǾ�����ϱ� �� �����ؼ� ��������.
		System.out.println("������ �ʱ�ȭ");
	}
	
	public ClassA() {
		this(10, 10);
		System.out.println("������ �ʱ�ȭ");
	}
	
	//�ν��Ͻ� �޼ҵ�
	public void show() {
		System.out.print("a: "+ a);
		System.out.println(" b: "+b);
	}
	
	//static �޼ҵ�
	public static void showStatic() {
//		System.out.print("a: "+ a); //����. static method �ȿ����� �ν��Ͻ� ��������� ����� �� ����. ��ü�� �������� �ʰ� �� �� �־�� �ϹǷ�.
		System.out.println(" b: "+b);
		
//		show(); //���� �������� ������ �ν��Ͻ� ��� �޼ҵ嵵 ����� �� ����. ClassA ��ü�� �����Ǳ� �������� show()�� ��������� ���� �״ϱ�.  
		//���� ������ public static void main() �ȿ��� �ν��Ͻ� �ʵ�/�޼ҵ带 ����� �� ����. static �ʵ�/�޼ҵ常 �θ� �� �ִ�.
//		this.show(); //Cannot use this in a static context
	}
}
