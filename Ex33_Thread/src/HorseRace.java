
public class HorseRace {

	public static void main(String[] args) {
		
		Horse h1 = new Horse("1����");
		Horse h2 = new Horse("2����");
		Horse h3 = new Horse("3����");
		
		System.out.println("���� ����");
		
		h1.setPriority(10); //1~10 ���̷� ����
		h2.setPriority(5); //1~10 ���̷� ����
		h3.setPriority(1); //1~10 ���̷� ����
		
		h1.start();
		h2.start();
		h3.start();
		
		//thread�� �켱������ job scheduler�� ���� �������� ������ h1, h2, h3 �� ���� ���� ���� �� �츮�μ��� �����ϱ� ��ƴ�.
		//�켱������ �����ϸ� ��� �۾��� �� ���� ���� Ȯ���� ��������(�º� ����). ������ ���� Ȯ���� �� �ƴϴ�.
		//�켱������ ���� 1����-2����-3���� ������ �����ؾ� �ϴµ� �Ź� �ٸ���...

	}
}

class Horse extends Thread{
	
	String name;
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(name + " �ٱ״� �ٱ״�");
			
			try {
				Thread.sleep(400); //0.4��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name +" ����� ����");
	}
	
	public Horse(String name) {
		this.name = name;
	}
}