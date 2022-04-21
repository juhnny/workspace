
public class Animal {

	//오버라이드용 메소드
	void say() {
		System.out.println("for override");
	}
	
	//내용이 없다는 의미로 중괄호를 붙여서 써놓는 문화가 있지만 IDE의 자동정렬 기능을 쓰면 개행이 되고 마치 내용이 있어야 할 것처럼 보인다. 
	void aaa() {}
	//그래서 어차피 내용도 없으니 중괄호도 생략해버린, 형태가 없는 추상 메소드를 만듦
	//추상메소드를 하나라도 가진 클래스는 추상 클래스여야만 함. 추상 클래스가 추상 메소드를 갖지 않는 건 가능.
//	abstract void bbb();
}

//어차피 같은 패키지이니 다른 클래스도 같은 파일에 만들자
class Tiger extends Animal{
	void say() {
		System.out.println("I'm a tiger");
	}
}

class Leopard extends Animal{
	void say() {
		System.out.println("I'm a leopard");
	}
}

class Panther extends Animal{
	void say() {
		System.out.println("I'm a panther");
	}
}
