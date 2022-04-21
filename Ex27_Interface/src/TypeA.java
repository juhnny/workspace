
public interface TypeA {
	//interface�� ���� �� class�� ����. class��� �����ص� ����
	
	//1. �ܵ����� ��ü ���� �Ұ�
	
	//2. �ʵ忡�� public & static & final �� ��� ����.
	//�������̽� �ȿ����� � ������ ���� �� ����.
	//final�̹Ƿ� ����� �ʱ�ȭ �ʿ�
//	int a; //������ ������ �ص� final�� �νĵǾ� ���� �������� ������ ����.
//	static int b; //static ������ �ǵ������� final�� �νĵǾ� ���� �������� ������ ����.
	
	//�ʵ忡�� ���������ڴ� public�� ����
//	private int aa = 5; //Illegal modifier for the interface field TypeA.aa; only public, static & final are permitted
//	default int bb = 6;
//	protected int cc = 7;
	public static final int d = 10;
	
	//��� �ʵ�� �⺻���� public static final ���
	//������ �����ϸ� public static final�̶�� ��ø� ������.
	int e = 20;	//�ڵ� public static final
	final int f = 30; //�ڵ� public static
	static int g = 40; //�ڵ� final

//	d = 11; //���� �����Ϸ� �ϸ� ����
//	e = 21;  //���� �����Ϸ� �ϸ� ����
//	f = 31   //���� �����Ϸ� �ϸ� ����
//	g = 41; //���� �����Ϸ� �ϸ� ����
	
	
	//3. abstract �Ǵ� default �ν��Ͻ� �Ǵ� static �޼ҵ常 ��� ����
	//�ڹ� 1.8 �������� default �ν��Ͻ� �޼ҵ�, static �޼ҵ尡 ��������.

	//�޼ҵ� ����������
	//�ν��Ͻ� �޼ҵ�
	private void funcPri() {System.out.println();} //�������̽��� ���ο����� �� �޼ҵ尡 �ʿ��� ��?
	default void funcDef() {System.out.println("funcDef() of TypeA");} //���̺귯�� ������Ʈ�� default�� �ʿ��ؼ� ��������ٴµ� ���� �𸣰ڴ�.
																		//�ڽ� ��ü���� �̸� ������ ����� ������ְ� ���� �� ������� ������..
																		//�� Ŭ������ ���� �������̽� ���� �� �߻� �޼ҵ�� �̸��� ���Ƶ� ���� �ȵ����� �ν��Ͻ� �޼ҵ�� �̸��� �Ķ���ͱ��� ������ ����
//	protected void funcPro() {}; //only public, private, abstract, default, static and strictfp are permitted
//	public void fundPub() {}; //abstract�� �ν�
	
	//static �޼ҵ�
	private static void funcPriSta() {System.out.println("funcPriSta() of TypeA");} //�������̽� ���ο��� �������̽��� ����� ���� static���� ����� ����..? �� �� �� �� ����
//	default static void funcDefSta() {System.out.println();} //only one of abstract, default, or static permitted
//	protected static void funcDefSta() {System.out.println();} //only public, private, abstract, default, static and strictfp are permitted
	public static void funcPubSta() {System.out.println("funcPubSta() of TypeA");} //�������̽��� ���� ����� ���� ���� ���� �� �� �� �ְڴ�.
	
	//abstract �޼ҵ�
//	private abstract void funcPriAbs();
//	default abstract void funcDefAbs();
//	protected abstract void funcProAbs();
	public abstract void funcPubAbs(); //�̰� �������̽� ����� �� ����
	
	//�������̽������� �⺻���� public abstract. 
	public abstract void aaa();
	abstract void bbb();	//�ڵ� public
	void ccc();				//�ڵ� public abstract

	
	//6. �̳�Ŭ���� ���� ���� - �ڵ� public static
	class Inner{
		void show() {
			System.out.println("show() of Inner class of TypeA interface");
		}
	}
}
