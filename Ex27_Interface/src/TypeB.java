
public interface TypeB {
	//추상 메소드
	//추상 메소드는 다른 인터페이스의 추상 메소드와 이름이 같아도 다중상속 시 문제 되지 않음. 하나만 구현해주면 된다.
	public abstract void ccc(); 
	
	//인스턴스 메소드는 다른 인터페이스의 인스턴스 메소드와 이름과 파라미터가 같으면 상속받는 클래스에서 에러
//	default void funcDef() {System.out.println("funcDef() of TypeB");}
	
	//다른 인터페이스의 동명의 메소드와 파라미터가 다르면 오버로딩
	default void funcDef(int a) {System.out.println("funcDef() of TypeB");}

	//TypeA와 이름이 중복되는 public static 메소드. static은 문제 없음.
	public static void funcPubSta() {System.out.println("funcPubSta() of TypeB");} 
	
	//자동 public abstract
	void ddd();
	
	
}
