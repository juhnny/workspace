
public class ClassB {

	int m = 5;
	static int n = 10;
	
	//static �̳� Ŭ����
	public static class StaticInner{
		//�̳� Ŭ�������� �ƿ��� Ŭ������ static ��� ��� ���� 
		int k = n;
//		int j = m; //�ƿ��� Ŭ������ �ν��Ͻ� ��� ������ ��� �Ұ�
	}
}