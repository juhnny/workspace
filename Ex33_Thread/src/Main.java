
public class Main {

	public static void main(String[] args) {
		
		//Thread
		//동시에 여러 작업을 처리하는 기법
		//스레드, 프로세스, 트랜잭션, 태스크 이 네가지를 많이들 혼동한다.
		//1. 프로세스	: 현재 실행 중인 각각의 프로그램. 일련의 작업 절차. 태스크들의 모음. A-B-C-D task들로 이뤄진 하나의 공정 
		//본인만의 메모리 영역을 가짐. 할당받은 영역을 자바 프로그램은 Method-Stack-Heap 영역으로 나눠 사용하는 것.
		//메모리에 세 프로그램이 각각 영역을 할당받았으면 세 프로세스가 돌고 있다고 말한다.
		//프로세스 간에는 자원(메모리 영역 및 데이터) 공유가 불가.(중요) 곰플레이어에서 워드의 데이터를 읽어올 순 없다.
		
		//2. 스레드	: 프로세스를, 즉 일련의 작업(task)들을 진행시키는 일꾼. 실제로는 cpu가 하지만 소프트웨어적으로 이를 스레드라고 한다. 
		//하나의 프로세스가 실행되면 스레드는 무조건 하나 이상 존재한다. 그게 Main Thread. 회사로 치면 사장. 
		//스레드 하나는 하나의 task만 수행할 수 있다. A-B-C-D 공정이 각각 10초씩 걸리고 하나의 스레드가 처리하면 총 40초가 걸린다.
		//스레드 셋을 늘려서 각각의 task를 맡게 하면 전체 공정을 10초로 줄일 수 있다.
		//스레드도 객체다. Heap 메모리 안에 만들어진다.
		//하나의 프로세스 안에서 스레드 간에는 자원 공유 가능.
		
		//즉 thread는 작성되어 있는 코드를 읽어서 실행하는 녀석으로 생각하면 됨
		//그러니 하나의 프로세스에는 적어도 하나의 스레드는 기본적으로 존재해야 하는 것.
		
		//동시에 했으면 하는 작업 두 개 구현
		//예) 파일을 다운로드하면 음악재생 하기
		//아직 네트워크를 배우지 않았으니까 가상의 코드로 대체
		
		//20개의 파일 다운로드
//		for(int i = 0; i < 20; i++) {
//			System.out.println(i + "번 파일 다운로드 중");
//			//시간 지연을 위한 코드
//			for(long k = 0; k < 10000000000L; k++) {
//				new String();
//			}
//		}
//		System.out.println("파일 다운로드 완료!");
//		
//		//10개의 음악을 재생
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i + "번 파일 재생 중");
//			//시간 지연을 위한 코드
//			for(long k = 0; k < 20000000000L; k++) {
//				new String();
//			}
//		}
//		System.out.println("음악 재생 끝");
		
		//위 두 작업이 동시에 되면 더 빠르게 작업이 되겠지만
		//작업은 차례대로 이뤄진다. 왜? Main Thread 혼자 작업하고 있어서
		
		//thread도 객체지만 일반 객체와는 다르다. 
		//일반 객체에게 작업을 나눠준다고 해서 스레드처럼 작동하는 건 아니라는 것을 보이기 위해..
		//서로 다른 클래스를 만들어 위 두 가지 기능을 각각 수행토록 해보자.(아직 스레드 사용 아님)
//		WorkerA wA = new WorkerA();
//		WorkerB wB = new WorkerB();
//		wA.work();
//		wB.work();
		
		//아무리 객체가 많아도 그건 그냥 데이터와 실행문의 덩어리일 뿐 그 코드를 실행시키고 있는 건 Main thread 혼자다.
		
		//즉, 동시에 작업을 처리하려면 일반 객체를 만드는 것이 아니라 thread라는 능력을 가진 객체가 필요함
		//How? Thread 클래스를 상속받도록 클래스를 만들면 됨
		
		//thread 기능을 동작시키기 위한 메소드 run()
		//그 자체에는 실행문이 없으므로 오버라이드 해서 사용해야 한다.
		Thread t1 = new Thread();
		t1.run();
		System.out.println("--- run() ---\n");
		
		//Thread를 상속받도록 만든 ThreadA, ThreadB
		//같은 내용을 가진 run()과 work() 기능을 비교해보자.
		ThreadA tA = new ThreadA(); 
//		tA.run(); //하지만 이렇게 실행하면 별도 스레드가 아니라 메인 스레드가 run()을 실행한다. 
//		tA.start();
		
		ThreadB tB = new ThreadB();
//		tB.run();
//		tB.start();
		System.out.println("--- ThreadA start(), ThreadB start() --- \n");
		
		tA.work();
		tB.work();
		System.out.println("--- ThreadA work(), ThreadB work() --- \n");
		
		//CPU가 각 thread에 배정되는 시간은 scheduler에 의해 결정됨
		//thread들의 cpu 점유 비율을 스레드 우선순위로 약간 조절 설정 가능. 1~10
		tA.setPriority(1);
		tB.setPriority(10);
		
		//Thread.sleep();
		//Thread의 동작을 강제적으로 멈출 때 반복문은 시간 예측이 어려움
		//스레드를 거의 정확한 시간만큼 대기시키는 메소드
		
	}
}

class WorkerA{
	void work() {
		//20개의 파일 다운로드
		for(int i = 0; i < 20; i++) {
			System.out.println(i + "번 파일 다운로드 중");
			//시간 지연을 위한 코드
			for(long k = 0; k < 10000000000L; k++) {
				new String();
			}
		}
		System.out.println("파일 다운로드 완료!");
	}
}

class WorkerB{
	void work() {
		//10개의 음악을 재생
		for(int i = 0; i < 10; i++) {
			System.out.println(i + "번 파일 재생 중");
			//시간 지연을 위한 코드
			for(long k = 0; k < 20000000000L; k++) {
				new String();
			}
		}
		System.out.println("음악 재생 끝");
	}
}

class ThreadA extends Thread{
	void work() {
		//20개의 파일 다운로드
		for(int i = 0; i < 20; i++) {
			System.out.print(Thread.currentThread().getName()+": ");
			System.out.println(i + "번 파일 다운로드 중");
			//시간 지연을 위한 코드
			for(long k = 0; k < 10000000000L; k++) {
				new String();
			}
		}
		System.out.println("파일 다운로드 완료!");
	}
	@Override
	public void run() {
		//20개의 파일 다운로드
		for(int i = 0; i < 20; i++) {
			System.out.print(Thread.currentThread().getName()+": ");
			System.out.println(i + "번 파일 다운로드 중");
			//시간 지연을 위한 코드
			for(long k = 0; k < 10000000000L; k++) {
				new String();
			}
		}
		System.out.println("파일 다운로드 완료!");
	}
}

class ThreadB extends Thread{
	void work() {
		//10개의 음악을 재생
		for(int i = 0; i < 10; i++) {
			System.out.print(Thread.currentThread().getName()+": ");
			System.out.println(i + "번 파일 재생 중");
			//시간 지연을 위한 코드
			for(long k = 0; k < 20000000000L; k++) {
				new String();
			}
		}
		System.out.println("음악 재생 끝");
	}
	
	public void run() {
		//10개의 음악을 재생
		for(int i = 0; i < 10; i++) {
			System.out.print(Thread.currentThread().getName()+": ");
			System.out.println(i + "번 파일 재생 중");
			//시간 지연을 위한 코드
			for(long k = 0; k < 20000000000L; k++) {
				new String();
			}
		}
		System.out.println("음악 재생 끝");
	}
}