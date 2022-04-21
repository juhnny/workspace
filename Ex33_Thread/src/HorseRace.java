
public class HorseRace {

	public static void main(String[] args) {
		
		Horse h1 = new Horse("1번마");
		Horse h2 = new Horse("2번마");
		Horse h3 = new Horse("3번마");
		
		System.out.println("경주 시작");
		
		h1.setPriority(10); //1~10 사이로 조작
		h2.setPriority(5); //1~10 사이로 조작
		h3.setPriority(1); //1~10 사이로 조작
		
		h1.start();
		h2.start();
		h3.start();
		
		//thread의 우선순위는 job scheduler에 의해 정해지기 때문에 h1, h2, h3 중 누가 먼저 끝날 지 우리로서는 예측하기 어렵다.
		//우선순위를 제어하면 어느 작업이 더 빨리 끝날 확률이 높아진다(승부 조작). 하지만 역시 확실한 건 아니다.
		//우선순위만 보면 1번마-2번마-3번마 순으로 도착해야 하는데 매번 다르다...

	}
}

class Horse extends Thread{
	
	String name;
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(name + " 다그닥 다그닥");
			
			try {
				Thread.sleep(400); //0.4초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name +" 결승점 도착");
	}
	
	public Horse(String name) {
		this.name = name;
	}
}