package pack2;

import pack1.ClassC;

//�ٸ� ��Ű���� Ŭ������ ��ӹޱ�
public class ClassD extends ClassC {
	//��Ӹ����ε� �̹� ������� 4��(c1, c2, c3, c4) ����.
	//�嵥! ��� ����� �޾����� ���������ڰ� ������ �θ��� ����� ����� �� �� ����.
	void show() {
		//�θ��� private ���
//		System.out.println(c1); //�θ� Ŭ���� �ܺο����� ���� �Ұ�
		
		//�θ��� (default) ���
//		System.out.println(c2); //��Ű���� �ٸ��� ���� �Ұ�
		
		//�θ��� protected ���
		System.out.println(c3); //��Ű���� �޶� ��Ӱ����� protected�� ���� ����
		
		//�θ��� public ���
		System.out.println(c4); //public�� ������ ��� ����
		
	}
	
	
	
	
}
