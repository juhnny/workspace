
// 꺽쇠 < > 안에 전달된 자료형으로 바꿔치기 됨 
public class Box2 <T>{

	//아직 타입을 결정하지 않은 임의의 멤버변수를 설정
	T a; //타입명은 아무 글자나 써도 되지만 Type의 T를 따와서 주로 사용
		//제네릭의 타입명은 한글자로 쓰는 게 관습. 일반적인 클래스명과 구분하기 위해.
	
	public void setA(T a) {
		this.a = a;
	}
	
	public T getA() {
		return a;
	}
	
}
