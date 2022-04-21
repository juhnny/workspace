
public class Synchronized {

	public static void main(String[] args) {
		
		//동기화(Synchronized) 처리에 대한 학습
		//Thread의 특징이 동시(비동기, Asynchronzed) 작업이고 그것을 임시적으로 막는 게 동기화
		//동기화 된 부분이 너무 많아지면 스레드 사용의 의미가 퇴색된다.
		
		//입금 기능을 가진 Account 클래스를 만들었다. 스레드 기능 없음.
		Account acc1 = new Account();
//		acc1.add(500); //main 스레드에서 작업
		
		//Account 클래스를 이용해 thread를 사용하는 클래스를 만들었다.
		//위에서 만든 계좌에 두 명이 동시에 입금하는 경우를 만들어보자.
		AccountByThread abt1 = new AccountByThread(acc1);
		AccountByThread abt2 = new AccountByThread(acc1);
		abt1.start();
		abt2.start();
		
		//<실행결과>
		//입금 작업을 시작합니다.
		//입금 작업을 시작합니다.
		//현재 잔액: 0 by Thread-1
		//현재 잔액: 0 by Thread-0
		//100원 입금 후 잔액: 200 by Thread-0
		//100원 입금 후 잔액: 200 by Thread-1
		
		//Thread 각각의 입장에서 보면 잔액이 0원에서 갑자기 200원이 되는 이상한 상황.
		//이를 해결하기 위해 동기화가 필요하다.
		
		//방법 1. 메소드 통째로 동기화
		//동기화가 필요한 메소드 이름 앞에 synchronized 키워드 추가
		
		//방법 2. 메소드 중 원하는 부분만 동기화
		//동기화가 필요한 곳에 synchronized 블럭 추가
	}
}

class Account{
	int money = 0;
	
	//입금 기능
//	void add(int m) {
//		System.out.println("입금 작업을 시작합니다.");
//		System.out.println("현재 잔액: "+money +" by "+ Thread.currentThread().getName());
//		money += m;
//		//입금 처리에 걸리는 시간
//		try {Thread.sleep(1000);} 
//		catch (InterruptedException e) {}
//		System.out.println(m+"원 입금 후 잔액: "+money+" by "+ Thread.currentThread().getName());
//	}
	
	//방법 1. 메소드를 통으로 동기화
	//입금 기능
//	synchronized void add(int m) {
//		System.out.println("입금 작업을 시작합니다.");
//		System.out.println("현재 잔액: "+money +" by "+ Thread.currentThread().getName());
//		money += m;
//		//입금 처리에 걸리는 시간
//		try {Thread.sleep(1000);} 
//		catch (InterruptedException e) {}
//		System.out.println(m+"원 입금 후 잔액: "+money+" by "+ Thread.currentThread().getName());
//	}
	
	//방법 2. 메소드 중 원하는 부분만 동기화
	//입금 기능
	void add(int m) {
		//synchronized문 밖의 영역은 여러 스레드에서 동시에 실행된다.
		System.out.println("입금 작업을 시작합니다.");
		
		//this객체(Account)를 다른 스레드가 건드릴때 이를 막는 블럭 - 동기화 되는 영역
		//mutex: mutual exclusion 상호 배제. 문제가 되는 공유자원을 써준다.
		synchronized (this) {
			System.out.println("현재 잔액: "+money +" by "+ Thread.currentThread().getName());
			money += m;
			//입금 처리에 걸리는 시간
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {}
			System.out.println(m+"원 입금 후 잔액: "+money+" by "+ Thread.currentThread().getName());
		}
	}
}

class AccountByThread extends Thread{
	
	Account acc; //위에서 만든 클래스를 사용
	
	//constructor
	AccountByThread(Account acc){
		this.acc = acc;
	}
	
	//입금 기능
	public void run() {
		//별도 스레드로 사용할 메소드 
		acc.add(100);
	}	
}

