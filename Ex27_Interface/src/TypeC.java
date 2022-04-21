//다른 인터페이스의 추상메소드를 상속받은 인터페이스 만들기
//클래스끼리는 다중상속이 불가능하지만 인터페이스->인터페이스는 다중상속도 가능
public interface TypeC extends TypeA, TypeB{

	//이미 funcPubAbs(), aaa(),bbb(), ccc(), ddd() 추상메소드를 보유한 상태
	
	public abstract void eee(); //새로운 추상메소드 추가
}
