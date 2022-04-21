
public class ThreadControl {
	
	public static void main(String[] args) {
		
		//Ÿ�̾ �����ϴ� ���� ��ü ����
		Worker w1 = new Worker();
		w1.start();
		
		//thread�� �� �ѹ��� start() �� �� �ִ�.
		//thread�� start()�� ���� run()�� ����ǰ� run()�� �۾��� ������ �� �̻� ����� �� ����.
//		w1.start(); //IllegalThreadStateException
		
		//�׷��� ���� �۾��� ��� ��Ű�� �ʹٸ� run()�� ������ �ʵ��� run() �ȿ��� �ݺ������� ����� �д�.
		
		
		//wait-notify
		//������ �Ͻ������� wait(), �簳�� notify() �Ǵ� notifyAll()
		//wait(), notify(), notifyAll()�� synchronized method Ȥ�� synchronized ��� �ȿ��� ��� ������ ����. 
		//wait()�� ���� ������� wait pool�� �̵��Ѵ�. ��� ���� �������� ��� ���� ����
		//wait() �޼ҵ嵵 �Ϸ��� ��ɵ�� �̷��� �����ٵ� �� ���߿� notify()�� ���ÿ� ����Ǹ� ������ ����� ������ ���� ����ȭ�� �ʿ��ϴ�.
		//wait()�� try-catch���� �ʿ�
		//notify()�� �ؼ� �޽� ���� �����带 �ҷ����� ������ ���μ����� ������ ������ �ʴ´�. wait()�� ������ �ݵ�� notify() ������.
		
		//t.wait()�̶�� ���� �� ����� �д� ������, ���⼭�� main thread�� wait�� ���� t�� wait pool�� main thread�� �ö󰣴�.
		//t.notify��� �ϸ� t�� wait pool���� �� ����� �а� �ִ� �ش� thread�� �ִ��� ã�ƺ��� ������ ��������.
		/********* �̰� �ٽ� �׽�Ʈ �غ��� **********/
		
		
		//3�� �� �Ͻ� ����
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		try {
//			synchronized (w1) {
//				w1.wait();				
//			}
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}

		//������ �̷��� �Ͻ�������Ű�� ���� ������� �ʴ´�. run() ���� �� ��򰡿��� ���߶�� ��������� ������ ���� �� �ִ�.
		//�۾� �ϴ� �������� ��ġ�� �ϰ� ������ ���� if(isWait){this.wait()}�� �Ἥ ������.
		w1.isWait = true;
		
		
		//3�� �� �۾� �簳
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		synchronized (w1) {
			w1.isWait = false; //isWait = true�� ���θ� �ٽ� wait()�� ������ �ȴ�.
			w1.notify();			
		}

		//����ȭ ó���� ������ ���� �߻�
//		w1.isWait = false; //isWait = true�� ���θ� �ٽ� wait()�� ������ �ȴ�.
//		w1.notify(); //Exception in thread "main" java.lang.IllegalMonitorStateException: current thread is not owner
		
		
		//�������� ����
		//main thread�� 3�� �� �� �����带 ����ϰ� ������.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		//������ ���� ��� 1. 
		//�����带 ������ �޼ҵ�� stop()�� �ִ�. ������..
		//stop() �޼ҵ�� deprecated. �۾� �߰��� ���� �ϴ� ���� ����ϰ� �Ǳ� ����. Ÿ�̾� �� ¦�� �����ϰ� ���� ���� ���.
//		w1.stop(); 

		//�ݺ� �۾��� �ϴٰ� ���߰� �Ϸ��� �׳� ���ߴ� �� �ƴ϶� �ϴ� ȸ���� �� ����ġ�� ���߰� �ؾ� �Ѵ�. 
		//�ݺ����� ���������� ���� �����ϸ� �ݺ��� �߰����� ������ �ʰ� �� �� �ִ�.
		
		//������ ���� ��� 2. 
		//boolean isRun = true�� ���� false�� �ٲٸ� while���� �ڿ������� ����
		w1.isRun = false;
		
		System.out.println("----------�޼ҵ�� �����----------");
		
		//�׸��� ������� �̷��� ��ü �ܺο��� ���� ��ü ���⿡ ����ǹǷ� ��ü ������ �� �� �ֵ��� �޼ҵ�� ����� ����Ѵ�.
		Worker w2 = new Worker();
		w2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		w2.pauseThread();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		w2.resumeThread();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		w2.stopThread();
		
		
		
	}
}

//Ư�� �۾��� �����ϴ� ����(������) Ŭ���� ����
class Worker extends Thread{
	boolean isRun = true;
	boolean isWait = false;
	
	@Override
	public void run() {
		//Ÿ�̾� 4���� �����ϴ� �۾�
//		System.out.println("1�� Ÿ�̾� ����");
//		System.out.println("2�� Ÿ�̾� ����");
//		System.out.println("3�� Ÿ�̾� ����");
//		System.out.println("4�� Ÿ�̾� ���� \n");
		
		//Ÿ�̾� 4���� �����ϴ� �۾��� �ݺ��ؼ� ��Ű���� �ݺ������� run()�� ������ �ʰ� �Ѵ�.
		while(isRun) { 
			System.out.print("1�� Ÿ�̾� ���� /");
			System.out.print("2�� Ÿ�̾� ���� /");
			System.out.print("3�� Ÿ�̾� ���� /");
			System.out.print("4�� Ÿ�̾� ���� \n");

			//�Ͻ������� �ʿ��� ���� wait() ���
			//wait()�� try-catch�� synchronized ����� ��� �ʿ�
			if(isWait) {
				try {
					synchronized (this) {
						System.out.println("�޽� �ð�");
						this.wait(); //wait()�� ���� ������� wait pool�� ���� Ŀ���� �� �ٿ� �����ְ� �ȴ�.
					}
				} catch (InterruptedException e1) {}
			}
			
			//1�� ���
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}//while
		System.out.println("���� ��� \n");
	}//run()
	
	//wait()�� �޼ҵ�
	void pauseThread() {
		isWait = true;
	}
	
	//notify()�� �����  �޼ҵ�
	void resumeThread() {
		isWait = false; //isWait = true�� ���θ� �ٽ� wait()�� ������ �ȴ�.
		
		synchronized (this) {
			this.notify();
		}
	}
	
	//stop()�� ����� ���� �޼ҵ�
	void stopThread() {
		isRun = false;
		
		//����ڰ� wait()�� ����� �� �ٷ� stopThread()�� ����� ���, isRun�� false�� �ٲ������ Ŀ���� �����ֱ� ������ while�� ������ ����. ������� ��.
		//����� ���� �ݺ����� ������ ��ɵ��� ����ǰ� �� �� isRun=false �� ���� �ݺ� ����
		synchronized (this) {
			this.notify();
		}
	}
}