
public interface TypeB {
	//�߻� �޼ҵ�
	//�߻� �޼ҵ�� �ٸ� �������̽��� �߻� �޼ҵ�� �̸��� ���Ƶ� ���߻�� �� ���� ���� ����. �ϳ��� �������ָ� �ȴ�.
	public abstract void ccc(); 
	
	//�ν��Ͻ� �޼ҵ�� �ٸ� �������̽��� �ν��Ͻ� �޼ҵ�� �̸��� �Ķ���Ͱ� ������ ��ӹ޴� Ŭ�������� ����
//	default void funcDef() {System.out.println("funcDef() of TypeB");}
	
	//�ٸ� �������̽��� ������ �޼ҵ�� �Ķ���Ͱ� �ٸ��� �����ε�
	default void funcDef(int a) {System.out.println("funcDef() of TypeB");}

	//TypeA�� �̸��� �ߺ��Ǵ� public static �޼ҵ�. static�� ���� ����.
	public static void funcPubSta() {System.out.println("funcPubSta() of TypeB");} 
	
	//�ڵ� public abstract
	void ddd();
	
	
}
