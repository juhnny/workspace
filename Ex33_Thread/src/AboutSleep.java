
public class AboutSleep {

	public static void main(String[] args) {

		//run() �޼ҵ� �ȿ� Thread.sleep(10000) ����� �־���.
		//�� �ڵ带 �����ϴ� thread�� 10�� ���� �ῡ ���.
		ThreadTest t = new ThreadTest();
		t.start();
		
		//2�� �� sleep() ���� �����带 ���� ����.
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		t.interrupt(); // sleep()�߿� Exception�� �߻���Ű�� ���
		
	}
}

class ThreadTest extends Thread{
	@Override
	public void run() {
		System.out.println("Hello");
		//10�ʰ� �����带 sleep
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Don't bother me");;
		}
		System.out.println("Bye");
	}
}