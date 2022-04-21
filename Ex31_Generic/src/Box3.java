
//여러 제네릭 타입을 쓸 경우
public class Box3<T, U> {
	
	T a;
	T b;
	U c;
	
	public void setMember(T a, T b, U c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
}
