
public interface Unit {

	public abstract void attack();
	void move(); //자동 public abstract
	
}

class Marine implements Unit, Heal{
	@Override
	public void attack() {
		System.out.println("마린 기관총 공격!");
	}
	
	@Override
	public void move() {
		System.out.println("마린 걸어서 이동");	
	}

	@Override
	public void heal() {
		System.out.println("마린 체력 자동 회복");
		
	}
}

class Medic implements Unit, Heal{
	@Override
	public void attack() {
		System.out.println("메딕은 공격 못해");	
	}
	
	@Override
	public void move() {
		System.out.println("메딕 걸어서 이동");	
	}

	@Override
	public void heal() {
		System.out.println("메딕 체력 자동 회복");
	}
}

class Tank implements Unit{
	@Override
	public void attack() {
		System.out.println("자주포 발사해 공격");	
	}

	@Override
	public void move() {
		System.out.println("탱크 바퀴로 이동");	
	}
	
}

