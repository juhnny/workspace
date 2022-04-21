
public class ClassA {
	
	public int a = 5;	//멤버변수
	public static int b = 5; //정적(static) 멤버변수
	
	//클래스는 Heap에 만들어짐
	//참조변수는 Stack에 만들어져 Heap의 클래스를 가리킴
	//지역변수 a는 Stack에 만들어짐
	//static 변수 b는 Method 영역(C에서의 Code 영역과 Data 영역을 합친 개념)에 만들어짐
	
	//static 변수는 그 클래스의 객체를 아무리 많이 만들어도 Method 영역에 하나만 존재
	
	//초기화 블럭
	{
		a = 3;
//		b = 3;
		System.out.println("instance 초기화 블럭"); //객체가 생성될 때마다 실행
	}
	
	//static 초기화 블럭
	static
	{
//		a = 7; //static 초기화 블럭 내에서 인스턴스 변수는 사용 불가
		b = 7;
		System.out.println("static 초기화 블럭"); //처음 클래스가 사용될 때 딱 한번만 초기화
	}
	//static 변수 초기화는 일반 초기화 블럭 내에서는 잘 하지 않는다. 각각 static 변수용, 인스턴스 변수용으로 구분해주는 게 좋다.
	
	//생성자
	public ClassA(int a, int b) {
		this.a = a;
//		this.b = b; //생성자 메소드 내에 static 변수를 대입하는 실행문이 있으면 ClassA 객체를 만들 때마다 b에 대입되어버리니까 잘 생각해서 결정하자.
		System.out.println("생성자 초기화");
	}
	
	public ClassA() {
		this(10, 10);
		System.out.println("생성자 초기화");
	}
	
	//인스턴스 메소드
	public void show() {
		System.out.print("a: "+ a);
		System.out.println(" b: "+b);
	}
	
	//static 메소드
	public static void showStatic() {
//		System.out.print("a: "+ a); //에러. static method 안에서는 인스턴스 멤버변수를 사용할 수 없다. 객체를 생성하지 않고도 쓸 수 있어야 하므로.
		System.out.println(" b: "+b);
		
//		show(); //위와 마찬가지 이유로 인스턴스 멤버 메소드도 사용할 수 없다. ClassA 객체가 생성되기 전까지는 show()가 만들어지지 않을 테니까.  
		//같은 이유로 public static void main() 안에서 인스턴스 필드/메소드를 사용할 수 없다. static 필드/메소드만 부를 수 있다.
//		this.show(); //Cannot use this in a static context
	}
}
