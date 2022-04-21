
public class AboutSleep {

	public static void main(String[] args) {

		//run() 메소드 안에 Thread.sleep(10000) 명령을 넣었다.
		//이 코드를 실행하는 thread가 10초 동안 잠에 든다.
		ThreadTest t = new ThreadTest();
		t.start();
		
		//2초 후 sleep() 중인 스레드를 깨워 보자.
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		t.interrupt(); // sleep()중에 Exception을 발생시키는 기능
		
	}
}

class ThreadTest extends Thread{
	@Override
	public void run() {
		System.out.println("Hello");
		//10초간 스레드를 sleep
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Don't bother me");;
		}
		System.out.println("Bye");
	}
}