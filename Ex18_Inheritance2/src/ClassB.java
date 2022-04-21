
public class ClassB extends ClassA {
	
	private int b;
	
	void showB() {
		//System.out.println("a : " + a); //error. 부모의 멤버 a가 private -> 메소드로 읽어와야 함
		showA();
		System.out.println("b: "+b);
		System.out.println();
	}
	
	public ClassB(int a, int b) {
		//super.a= a; //상속 받은 부모의 멤버라도 private 멤버는 사용 불가
		super(a);
		this.b = b;
		System.out.println("ClassB(int a, int b)");
	}
	
	public ClassB() {
		//ClassA 생성자가 숨어있다.
		System.out.println("ClassB()");
	}
	
	
}
