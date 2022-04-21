
public class AboutJoin {
	
	public static void main(String[] args) {
		
		//join() 
		//해당 스레드의 작업이 끝날 때까지 다른 스레드의 작업을 멈추는 메소드
		//필요 예) 스레드A가 현재 GPS 정보를 가져오고 스레드B가 주변 정보를 가져올 경우
		//현재 위치 정보를 가져오기까지 기다리지도 않고 동시에 주변 정보를 가져오면 문제가 된다.
		
		JoinTest j = new JoinTest();
		j.start(); //5초 걸리는 작업 시작

		//j 스레드에 join()
		try {
			j.join(); // j스레드의 작업이 끝날때까지 다른 스레드의 작업을 block
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		//main thread가 수행할 작업
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