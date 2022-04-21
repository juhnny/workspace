
public class ClassB extends ClassA {
	
	//그냥 보면 아무 멤버도 없는 것처럼 보이지만
	//상속받은 것만으로도 ClassA의 멤버를 이미 보유한 상태.
	//메모리상으로도 ClassB 객체 안에 ClassA가 존재하게 된다. ClassA가 다른 곳에 존재하는 게 아님.
	
	//멤버변수 추가
	int b;
	
	void showB() {
		System.out.println("b @ClassB : "+b);
	}
	
	//상속은 받았지만 부모 클래스의 출력은 부모가 하게 해~!
	void show() {
		//상속받은 부모 클래스의 메소드를 내 것 호출하듯
		showA();
	
		System.out.println("b @ClassB : "+b);			
	}
	
	//입력 메소드
	void setFields(int a, int b) {
//		this.a = a; //에러는 아니지만 엄밀히 말해 a 변수는 ClassB 객체 것이 아니므로 this 키워드가 어색함. 
					//부모 클래스의 멤버를 참조하는 특별한 키워드, super. this처럼 참조변수.
					//참고로 부모의 부모 클래스를 참조하는 키워드는 없음.
		super.a = a;
//		setFieldsA(a);
		this.b = b;
	}
	
	//생성자
	public ClassB(int a, int b){
		super.a = a;
		this.b = b;
	}
	
	public ClassB(){
		this(-1, -2);
	}
}
