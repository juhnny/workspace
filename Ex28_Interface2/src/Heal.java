//일부 유닛에게만 회복 기능을 주고 싶을 때는 따로 인터페이스를 만들어 그들에게만 적용한다.
public interface Heal {
	//추상 메소드
	public abstract void heal();
}
