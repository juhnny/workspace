
public class Main {

	public static void main(String[] args) {
		
		//Thread
		//���ÿ� ���� �۾��� ó���ϴ� ���
		//������, ���μ���, Ʈ�����, �½�ũ �� �װ����� ���̵� ȥ���Ѵ�.
		//1. ���μ���	: ���� ���� ���� ������ ���α׷�. �Ϸ��� �۾� ����. �½�ũ���� ����. A-B-C-D task��� �̷��� �ϳ��� ���� 
		//���θ��� �޸� ������ ����. �Ҵ���� ������ �ڹ� ���α׷��� Method-Stack-Heap �������� ���� ����ϴ� ��.
		//�޸𸮿� �� ���α׷��� ���� ������ �Ҵ�޾����� �� ���μ����� ���� �ִٰ� ���Ѵ�.
		//���μ��� ������ �ڿ�(�޸� ���� �� ������) ������ �Ұ�.(�߿�) ���÷��̾�� ������ �����͸� �о�� �� ����.
		
		//2. ������	: ���μ�����, �� �Ϸ��� �۾�(task)���� �����Ű�� �ϲ�. �����δ� cpu�� ������ ����Ʈ���������� �̸� �������� �Ѵ�. 
		//�ϳ��� ���μ����� ����Ǹ� ������� ������ �ϳ� �̻� �����Ѵ�. �װ� Main Thread. ȸ��� ġ�� ����. 
		//������ �ϳ��� �ϳ��� task�� ������ �� �ִ�. A-B-C-D ������ ���� 10�ʾ� �ɸ��� �ϳ��� �����尡 ó���ϸ� �� 40�ʰ� �ɸ���.
		//������ ���� �÷��� ������ task�� �ð� �ϸ� ��ü ������ 10�ʷ� ���� �� �ִ�.
		//�����嵵 ��ü��. Heap �޸� �ȿ� ���������.
		//�ϳ��� ���μ��� �ȿ��� ������ ������ �ڿ� ���� ����.
		
		//�� thread�� �ۼ��Ǿ� �ִ� �ڵ带 �о �����ϴ� �༮���� �����ϸ� ��
		//�׷��� �ϳ��� ���μ������� ��� �ϳ��� ������� �⺻������ �����ؾ� �ϴ� ��.
		
		//���ÿ� ������ �ϴ� �۾� �� �� ����
		//��) ������ �ٿ�ε��ϸ� ������� �ϱ�
		//���� ��Ʈ��ũ�� ����� �ʾ����ϱ� ������ �ڵ�� ��ü
		
		//20���� ���� �ٿ�ε�
//		for(int i = 0; i < 20; i++) {
//			System.out.println(i + "�� ���� �ٿ�ε� ��");
//			//�ð� ������ ���� �ڵ�
//			for(long k = 0; k < 10000000000L; k++) {
//				new String();
//			}
//		}
//		System.out.println("���� �ٿ�ε� �Ϸ�!");
//		
//		//10���� ������ ���
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i + "�� ���� ��� ��");
//			//�ð� ������ ���� �ڵ�
//			for(long k = 0; k < 20000000000L; k++) {
//				new String();
//			}
//		}
//		System.out.println("���� ��� ��");
		
		//�� �� �۾��� ���ÿ� �Ǹ� �� ������ �۾��� �ǰ�����
		//�۾��� ���ʴ�� �̷�����. ��? Main Thread ȥ�� �۾��ϰ� �־
		
		//thread�� ��ü���� �Ϲ� ��ü�ʹ� �ٸ���. 
		//�Ϲ� ��ü���� �۾��� �����شٰ� �ؼ� ������ó�� �۵��ϴ� �� �ƴ϶�� ���� ���̱� ����..
		//���� �ٸ� Ŭ������ ����� �� �� ���� ����� ���� ������� �غ���.(���� ������ ��� �ƴ�)
//		WorkerA wA = new WorkerA();
//		WorkerB wB = new WorkerB();
//		wA.work();
//		wB.work();
		
		//�ƹ��� ��ü�� ���Ƶ� �װ� �׳� �����Ϳ� ���๮�� ����� �� �� �ڵ带 �����Ű�� �ִ� �� Main thread ȥ�ڴ�.
		
		//��, ���ÿ� �۾��� ó���Ϸ��� �Ϲ� ��ü�� ����� ���� �ƴ϶� thread��� �ɷ��� ���� ��ü�� �ʿ���
		//How? Thread Ŭ������ ��ӹ޵��� Ŭ������ ����� ��
		
		//thread ����� ���۽�Ű�� ���� �޼ҵ� run()
		//�� ��ü���� ���๮�� �����Ƿ� �������̵� �ؼ� ����ؾ� �Ѵ�.
		Thread t1 = new Thread();
		t1.run();
		System.out.println("--- run() ---\n");
		
		//Thread�� ��ӹ޵��� ���� ThreadA, ThreadB
		//���� ������ ���� run()�� work() ����� ���غ���.
		ThreadA tA = new ThreadA(); 
//		tA.run(); //������ �̷��� �����ϸ� ���� �����尡 �ƴ϶� ���� �����尡 run()�� �����Ѵ�. 
//		tA.start();
		
		ThreadB tB = new ThreadB();
//		tB.run();
//		tB.start();
		System.out.println("--- ThreadA start(), ThreadB start() --- \n");
		
		tA.work();
		tB.work();
		System.out.println("--- ThreadA work(), ThreadB work() --- \n");
		
		//CPU�� �� thread�� �����Ǵ� �ð��� scheduler�� ���� ������
		//thread���� cpu ���� ������ ������ �켱������ �ణ ���� ���� ����. 1~10
		tA.setPriority(1);
		tB.setPriority(10);
		
		//Thread.sleep();
		//Thread�� ������ ���������� ���� �� �ݺ����� �ð� ������ �����
		//�����带 ���� ��Ȯ�� �ð���ŭ ����Ű�� �޼ҵ�
		
	}
}

class WorkerA{
	void work() {
		//20���� ���� �ٿ�ε�
		for(int i = 0; i < 20; i++) {
			System.out.println(i + "�� ���� �ٿ�ε� ��");
			//�ð� ������ ���� �ڵ�
			for(long k = 0; k < 10000000000L; k++) {
				new String();
			}
		}
		System.out.println("���� �ٿ�ε� �Ϸ�!");
	}
}

class WorkerB{
	void work() {
		//10���� ������ ���
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "�� ���� ��� ��");
			//�ð� ������ ���� �ڵ�
			for(long k = 0; k < 20000000000L; k++) {
				new String();
			}
		}
		System.out.println("���� ��� ��");
	}
}

class ThreadA extends Thread{
	void work() {
		//20���� ���� �ٿ�ε�
		for(int i = 0; i < 20; i++) {
			System.out.print(Thread.currentThread().getName()+": ");
			System.out.println(i + "�� ���� �ٿ�ε� ��");
			//�ð� ������ ���� �ڵ�
			for(long k = 0; k < 10000000000L; k++) {
				new String();
			}
		}
		System.out.println("���� �ٿ�ε� �Ϸ�!");
	}
	@Override
	public void run() {
		//20���� ���� �ٿ�ε�
		for(int i = 0; i < 20; i++) {
			System.out.print(Thread.currentThread().getName()+": ");
			System.out.println(i + "�� ���� �ٿ�ε� ��");
			//�ð� ������ ���� �ڵ�
			for(long k = 0; k < 10000000000L; k++) {
				new String();
			}
		}
		System.out.println("���� �ٿ�ε� �Ϸ�!");
	}
}

class ThreadB extends Thread{
	void work() {
		//10���� ������ ���
		for(int i = 0; i < 10; i++) {
			System.out.print(Thread.currentThread().getName()+": ");
			System.out.println(i + "�� ���� ��� ��");
			//�ð� ������ ���� �ڵ�
			for(long k = 0; k < 20000000000L; k++) {
				new String();
			}
		}
		System.out.println("���� ��� ��");
	}
	
	public void run() {
		//10���� ������ ���
		for(int i = 0; i < 10; i++) {
			System.out.print(Thread.currentThread().getName()+": ");
			System.out.println(i + "�� ���� ��� ��");
			//�ð� ������ ���� �ڵ�
			for(long k = 0; k < 20000000000L; k++) {
				new String();
			}
		}
		System.out.println("���� ��� ��");
	}
}