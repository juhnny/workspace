//�������̽��� ����Ҷ� extends��� Ű���带 ������� �ʰ�.
//�����Ѵٴ� ���� �ǹ��ϴ� implements Ű���� �����.
public class Usb1 implements TypeA{
	//�������̽��� �߻�޼ҵ带 ������ �ֱ� ������
	//�ݵ�� �߻�޼ҵ���� �������̵� �ؼ� �����ؾ߸� ��!
	//��, ���������� �� ����� �����ϵ��� �԰�ȭ ��!

	@Override
	public void funcPubAbs() {
		System.out.println("funcPubAbs() of Usb1");	
		
	}

	public void aaa() {
		System.out.println("aaa() of Usb1");
	}
	
	@Override
	public void bbb() {
		System.out.println("bbb() of Usb1");	
	}

	@Override
	public void ccc() {
		System.out.println("ccc() of Usb1");	
	}

	
}
