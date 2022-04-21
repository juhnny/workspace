
public class ThreadControl {
	
	public static void main(String[] args) {
		
		//타이어를 조립하는 직원 객체 생성
		Worker w1 = new Worker();
		w1.start();
		
		//thread는 딱 한번만 start() 할 수 있다.
		//thread는 start()에 의해 run()이 실행되고 run()의 작업이 끝나면 더 이상 사용할 수 없다.
//		w1.start(); //IllegalThreadStateException
		
		//그래서 같은 작업을 계속 시키고 싶다면 run()이 끝나지 않도록 run() 안에서 반복문으로 붙잡아 둔다.
		
		
		//wait-notify
		//스레드 일시정지는 wait(), 재개는 notify() 또는 notifyAll()
		//wait(), notify(), notifyAll()은 synchronized method 혹은 synchronized 블록 안에서 써야 오류가 없다. 
		//wait()을 쓰면 스레드는 wait pool로 이동한다. 대기 중인 스레드의 목록 같은 개념
		//wait() 메소드도 일련의 명령들로 이뤄져 있을텐데 그 도중에 notify()가 동시에 실행되면 문제가 생기기 때문에 서로 동기화가 필요하다.
		//wait()은 try-catch문도 필요
		//notify()를 해서 휴식 중인 스레드를 불러오지 않으면 프로세스도 영원히 끝나지 않는다. wait()을 썼으면 반드시 notify() 해주자.
		
		//t.wait()이라고 쓰면 이 명령을 읽는 스레드, 여기서는 main thread가 wait에 들어가고 t의 wait pool에 main thread가 올라간다.
		//t.notify라고 하면 t의 wait pool에서 이 명령을 읽고 있는 해당 thread가 있는지 찾아보고 있으면 깨워낸다.
		/********* 이거 다시 테스트 해보자 **********/
		
		
		//3초 후 일시 정지
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

		//하지만 이렇게 일시정지시키는 것은 권장되지 않는다. run() 실행 중 어딘가에서 어중띠게 멈춰버리면 문제가 생길 수 있다.
		//작업 하던 곳까지는 마치게 하고 안전한 곳에 if(isWait){this.wait()}을 써서 멈추자.
		w1.isWait = true;
		
		
		//3초 후 작업 재개
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		synchronized (w1) {
			w1.isWait = false; //isWait = true로 놔두면 다시 wait()에 빠지게 된다.
			w1.notify();			
		}

		//동기화 처리가 없으면 예외 발생
//		w1.isWait = false; //isWait = true로 놔두면 다시 wait()에 빠지게 된다.
//		w1.notify(); //Exception in thread "main" java.lang.IllegalMonitorStateException: current thread is not owner
		
		
		//스레드의 종료
		//main thread가 3초 후 이 스레드를 퇴근하게 만들자.
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		//스레드 종료 방법 1. 
		//스레드를 끝내는 메소드로 stop()이 있다. 하지만..
		//stop() 메소드는 deprecated. 작업 중간에 일을 하다 말고 퇴근하게 되기 때문. 타이어 두 짝만 조립하고 집에 가면 어떡해.
//		w1.stop(); 

		//반복 작업을 하다가 멈추게 하려면 그냥 멈추는 게 아니라 하던 회차는 다 끝마치고 멈추게 해야 한다. 
		//반복문의 제어조건을 갖고 제어하면 반복문 중간에서 멈추지 않게 할 수 있다.
		
		//스레드 종료 방법 2. 
		//boolean isRun = true로 놓고 false로 바꾸면 while문이 자연스럽게 종료
		w1.isRun = false;
		
		System.out.println("----------메소드로 만들기----------");
		
		//그리고 멤버값을 이렇게 객체 외부에서 쓰면 객체 지향에 위배되므로 객체 스스로 할 수 있도록 메소드로 만들어 사용한다.
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

//특정 작업을 수행하는 직원(스레드) 클래스 설계
class Worker extends Thread{
	boolean isRun = true;
	boolean isWait = false;
	
	@Override
	public void run() {
		//타이어 4개를 조립하는 작업
//		System.out.println("1번 타이어 조립");
//		System.out.println("2번 타이어 조립");
//		System.out.println("3번 타이어 조립");
//		System.out.println("4번 타이어 조립 \n");
		
		//타이어 4개를 조립하는 작업을 반복해서 시키려면 반복문으로 run()이 끝나지 않게 한다.
		while(isRun) { 
			System.out.print("1번 타이어 조립 /");
			System.out.print("2번 타이어 조립 /");
			System.out.print("3번 타이어 조립 /");
			System.out.print("4번 타이어 조립 \n");

			//일시정지가 필요할 때는 wait() 사용
			//wait()은 try-catch와 synchronized 블록이 모두 필요
			if(isWait) {
				try {
					synchronized (this) {
						System.out.println("휴식 시간");
						this.wait(); //wait()을 쓰면 스레드는 wait pool로 가고 커서는 이 줄에 멈춰있게 된다.
					}
				} catch (InterruptedException e1) {}
			}
			
			//1초 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}//while
		System.out.println("직원 퇴근 \n");
	}//run()
	
	//wait()용 메소드
	void pauseThread() {
		isWait = true;
	}
	
	//notify()를 대신할  메소드
	void resumeThread() {
		isWait = false; //isWait = true로 놔두면 다시 wait()에 빠지게 된다.
		
		synchronized (this) {
			this.notify();
		}
	}
	
	//stop()을 대신할 종료 메소드
	void stopThread() {
		isRun = false;
		
		//사용자가 wait()을 사용한 후 바로 stopThread()를 사용한 경우, isRun은 false로 바뀌었지만 커서가 멈춰있기 때문에 while도 끝나지 않음. 깨워줘야 함.
		//깨우고 나면 반복문의 나머지 명령들이 실행되고 난 후 isRun=false 에 의해 반복 종료
		synchronized (this) {
			this.notify();
		}
	}
}