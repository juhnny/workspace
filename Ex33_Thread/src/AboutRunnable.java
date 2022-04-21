
public class AboutRunnable {

	public static void main(String[] args) {
		
		//Thread를 만드는 방법은 두 가지가 있다.
		//1. Thread 클래스를 상속 받은 클래스를 설계하여 사용
		//2. Runnable 인터페이스를 구현한 클래스를 설계하여 사용
		
		//2번을 왜 쓰지? 어차피 Thread도 Runnable을 구현한 클래스이고, Runnable은 추상메소드 run()밖에 없는 인터페이스인데?
		//다중 상속의 효과를 보고 싶을 때 사용
		//즉, 기존 클래스를 그대로 사용하면서 Thread의 능력도 있었으면 할 때.
		
		PersonThread pt = new PersonThread();
		//pt.start(); //메소드가 없다.
		//Runnable 인터페이스에는 .start() 메소드가 없고
		//그렇다고 run()을 직접 실행하면 main thread가 작업하게 된다. 
		pt.run();
		//그럼 어떻게? Thread 객체를 만들어서 실행시켜야 한다.
		//원래 Thread는 Runnable의 run()을 발동(trigger)하기 위해 만들어진 클래스
		//예전에는 Runnable을 구현한 클래스를 만들고 Thread로 발동하는 방식으로 썼지만 지금은 그냥 Thread만 만들어서 쓰는 게 일반적
		Thread t1 = new Thread(pt); //Runnable을 구현한, 즉 run()을 가진 객체를 생성자로 전달
		t1.start(); //run 실행

		//그래도 Runnable을 쓰는 방법을 더 알아보자.
		//익명클래스로 Runnable을 구현하여 사용하는 경우도 많음
		Runnable r = new Runnable() { //업캐스팅
			public void run() {
				for(int i = 0; i < 10; i++) {
					String name = Thread.currentThread().getName();
					System.out.println(name +": I'm working (익명 클래스)");
				}
			};
		};
		Thread t2 = new Thread(r);
		t2.start();
		
		//줄여서 쓸 수도 있다.
		Thread t3 = new Thread( new Runnable() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					String name = Thread.currentThread().getName();
					System.out.println(name +": I'm working (익명 클래스)");
				}
			}
		});
		t3.start();
		
		//별도 thread를 쓰는 이유는 속도 향상을 위한 것도 있고
		//main thread의 작업을 별도의 작업과 분리해주기 위해서이기도 하다. 
		//안드로이드에서는 네트워크 작업은 모두 별도 스레드로 분리하도록 했는데 
		//네트워크 작업을 하는 동안에도 사용자의 터치에 반응하게 하기 위해서다.
		//즉, main thread 작업의 연속성을 살릴 수 있다.
		
		//Thread의 단점
		//여러 스레드가 동시에 같은 작업을 할 때 문제가 발생
		//main thread는 화면에 "Hello"를 말하라고 하고 동시에 thread 0에서는 화면에 "Bye"를 말하라고 하면 문제
		//특히 뱅킹에서 다중 스레드 사용은 큰 문제가 될 수 있다.
		//그럴 땐 동시 작업이 아니라 동기 작업이 되도록 해야 한다.
		//동시(비동기) Asynchronized : 스레드 간의 작업이 그야말로 동시에 임의로 이뤄지는 것
		//동기 Synchronized : 스레드 간의 작업을 일련의 작업 단위별로 이뤄지도록 하는 것. 스레드A의 작업a-b-c가 완전히 끝나면 스레드B의 작업 a-b-c를 하는 식.
		//멀티 스레드를 써봤냐는 건 바로 이 동기화 문제를 다뤄봤냐는 것
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

