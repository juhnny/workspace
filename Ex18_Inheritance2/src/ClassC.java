
//상속의 상속
public class ClassC extends ClassB {
	
	public ClassC() {
		//grandsuper()//이런 문법은 없음. 조부모 클래스를 지칭하는 키워드는 없다.
		super(); //생략 가능
		System.out.println("ClassC()");
	}
	
}
