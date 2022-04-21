//abstract class를 만들어보자
//이왕 하는 거 Animal의 자식으로 만들어보자. 
public abstract class Bird extends Animal{
	
	//추상 클래스도 일반 클래스와 동일하게 멤버를 다 가질 수 있다.
	int a; //일반적인 멤버변수 - 인스턴스 변수
	static int b; //static 멤버변수 - 클래스 변수
	
	//인스턴스 메소드. 물론 static 메소드도 가능
	void show() {
		System.out.println("show() of Bird");
	}
	
	//추상 메소드 
	//추상 메소드에 static은 불가능. 사용하기 위한 게 아니니까 그렇겠지.
	//접근제한자는 사용 가능. 단, private 불가. 
	//abstract method는 외부 클래스에서 오버라이딩용으로 사용하기 위한 메소드인데 외부에서 못 쓰게 하면 안돼서 그런 듯
	abstract void say(); //추상 메소드에는 중괄호 사용 불가. 구현은 자식 클래스에서 한다.
	
	//생성자
	public Bird() {
		System.out.println("Bird() 생성자");
	}
}


class Crow extends Bird {
	//추상 클래스를 상속받자 이런 에러가 뜬다. 
	//The type Crow must implement the inherited abstract method Bird.say()
	//추상 메소드를 가진 추상 클래스를 상속받은 클래스에서는 반드시 그 메소드를 오버라이드하여 기능을 구현해야 한다.
	@Override
	void say() {
		System.out.println("I'm a Crow");
	}
	
	//생성자
	public Crow() {
		System.out.println("Crow() 생성자");
	}
}

class Dove extends Bird {
	@Override
	void say() {} //오버라이드한 구현 메소드에 내용이 없어도 에러는 아니다. 
	//하지만 이렇게 어떤 자식에서는 쓰고 어떤 자식에서는 안 쓸 거라면 추상 메소드로 만들지 않았을 것이다.
	//추상 메소드로 만들어둔 데는 그 메소드를 상속받아 꼭 썼으면 하는 클래스 개발자의 의도가 반영된 것이다.
}

