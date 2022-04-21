
public class AboutJoin {
	
	public static void main(String[] args) {
		
		//join() 
		//�ش� �������� �۾��� ���� ������ �ٸ� �������� �۾��� ���ߴ� �޼ҵ�
		//�ʿ� ��) ������A�� ���� GPS ������ �������� ������B�� �ֺ� ������ ������ ���
		//���� ��ġ ������ ����������� ��ٸ����� �ʰ� ���ÿ� �ֺ� ������ �������� ������ �ȴ�.
		
		JoinTest j = new JoinTest();
		j.start(); //5�� �ɸ��� �۾� ����

		//j �����忡 join()
		try {
			j.join(); // j�������� �۾��� ���������� �ٸ� �������� �۾��� block
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		//main thread�� ������ �۾�
		//
		for(int i = 0; i < 10; i++) {
			System.out.println("I'm main");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}

	}
}

class JoinTest extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("I'm a thread");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
}