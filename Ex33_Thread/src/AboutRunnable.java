
public class AboutRunnable {

	public static void main(String[] args) {
		
		//Thread�� ����� ����� �� ������ �ִ�.
		//1. Thread Ŭ������ ��� ���� Ŭ������ �����Ͽ� ���
		//2. Runnable �������̽��� ������ Ŭ������ �����Ͽ� ���
		
		//2���� �� ����? ������ Thread�� Runnable�� ������ Ŭ�����̰�, Runnable�� �߻�޼ҵ� run()�ۿ� ���� �������̽��ε�?
		//���� ����� ȿ���� ���� ���� �� ���
		//��, ���� Ŭ������ �״�� ����ϸ鼭 Thread�� �ɷµ� �־����� �� ��.
		
		PersonThread pt = new PersonThread();
		//pt.start(); //�޼ҵ尡 ����.
		//Runnable �������̽����� .start() �޼ҵ尡 ����
		//�׷��ٰ� run()�� ���� �����ϸ� main thread�� �۾��ϰ� �ȴ�. 
		pt.run();
		//�׷� ���? Thread ��ü�� ���� ������Ѿ� �Ѵ�.
		//���� Thread�� Runnable�� run()�� �ߵ�(trigger)�ϱ� ���� ������� Ŭ����
		//�������� Runnable�� ������ Ŭ������ ����� Thread�� �ߵ��ϴ� ������� ������ ������ �׳� Thread�� ���� ���� �� �Ϲ���
		Thread t1 = new Thread(pt); //Runnable�� ������, �� run()�� ���� ��ü�� �����ڷ� ����
		t1.start(); //run ����

		//�׷��� Runnable�� ���� ����� �� �˾ƺ���.
		//�͸�Ŭ������ Runnable�� �����Ͽ� ����ϴ� ��쵵 ����
		Runnable r = new Runnable() { //��ĳ����
			public void run() {
				for(int i = 0; i < 10; i++) {
					String name = Thread.currentThread().getName();
					System.out.println(name +": I'm working (�͸� Ŭ����)");
				}
			};
		};
		Thread t2 = new Thread(r);
		t2.start();
		
		//�ٿ��� �� ���� �ִ�.
		Thread t3 = new Thread( new Runnable() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					String name = Thread.currentThread().getName();
					System.out.println(name +": I'm working (�͸� Ŭ����)");
				}
			}
		});
		t3.start();
		
		//���� thread�� ���� ������ �ӵ� ����� ���� �͵� �ְ�
		//main thread�� �۾��� ������ �۾��� �и����ֱ� ���ؼ��̱⵵ �ϴ�. 
		//�ȵ���̵忡���� ��Ʈ��ũ �۾��� ��� ���� ������� �и��ϵ��� �ߴµ� 
		//��Ʈ��ũ �۾��� �ϴ� ���ȿ��� ������� ��ġ�� �����ϰ� �ϱ� ���ؼ���.
		//��, main thread �۾��� ���Ӽ��� �츱 �� �ִ�.
		
		//Thread�� ����
		//���� �����尡 ���ÿ� ���� �۾��� �� �� ������ �߻�
		//main thread�� ȭ�鿡 "Hello"�� ���϶�� �ϰ� ���ÿ� thread 0������ ȭ�鿡 "Bye"�� ���϶�� �ϸ� ����
		//Ư�� ��ŷ���� ���� ������ ����� ū ������ �� �� �ִ�.
		//�׷� �� ���� �۾��� �ƴ϶� ���� �۾��� �ǵ��� �ؾ� �Ѵ�.
		//����(�񵿱�) Asynchronized : ������ ���� �۾��� �׾߸��� ���ÿ� ���Ƿ� �̷����� ��
		//���� Synchronized : ������ ���� �۾��� �Ϸ��� �۾� �������� �̷������� �ϴ� ��. ������A�� �۾�a-b-c�� ������ ������ ������B�� �۾� a-b-c�� �ϴ� ��.
		//��Ƽ �����带 ��óĴ� �� �ٷ� �� ����ȭ ������ �ٷ�óĴ� ��
	}
	
	
}

class PersonThread extends Person implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ": I'm working");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
	
}

class Person{
	String name; 
	int age;
}

