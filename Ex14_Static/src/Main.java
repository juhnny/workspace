
public class Main {
	

		
	public static void main(String[] args) {
		
		//Static
		//멤버변수가 그 클래스를 new할 때, 즉 객체를 생성할 때마다 만들어진다면
		//static 멤버들은 그 클래스를 처음 사용할 때 만들어진다. 생성된(인스턴스화 한) 객체가 하나도 없더라도. 
		//static 메소드만 하나 쓰더라도 static 변수가 만들어진다.
		System.out.println(ClassA.b);
		//System.out.println(ClassA.a); //에러. a는 보이지도 않음
		System.out.println();
		
		//static 변수의 초기화(기본값 초기화, 명시적 초기화, static 초기화블럭)는 class를 처음 사용할 때만 적용되고 그 다음 사용할 때는 적용되지 않음(생성자는 예외)
		new ClassA(); //ClassA를 위에서 이미 불러온 적 있으므로 적용 X. 
		
		System.out.println("-------------------1");
		
		//static 변수는 클래스에 하나만 존재
		ClassA c1 = new ClassA();
		c1.show(); //b값 확인
		c1.b = 20; //b값 변경 
		c1.show();
		System.out.println("-------------------2");
		ClassA c2 = new ClassA(); //ClassA 객체를 하나 더 생성해도
		c2.show(); //b값은 그대로
					//주의할 점. 생성자 함수 내에서 static 변수 b에 대입하는 명령이 있으면 객체를 만들 때마다 b에 대입되어버린다.
		System.out.println();
		
		//static 멤버는 객체마다 있는 게 아니라 그 클래스를 대표해 Method 영역에 하나만 존재하므로 
		//개별 객체 뒤에 점을 찍어 접근하는 게 적절해보이지 않음. c1 안에 소속된 b, c2 안에 소속된 b가 개별 변수처럼 보이게 되니까.
		//객체 이름이 아닌 클래스 이름 뒤에 점을 찍어 사용한다.
		//같은 이유로 static 필드는 멤버변수라고 하기보다 클래스 변수라고 부른다.
		//일반 필드는 인스턴스화 된(메모리에 만들어진) 객체 하나하나마다 있으므로 인스턴스 변수라고 부른다.
		
		System.out.println("-------------------3");
		
		//static 멤버(클래스 변수/메소드)를 사용하는 이유
		//1. 객체를 만들지 않고도 변수를 사용하고 싶을 때
		//Java는 완전체 객체 지향 언어라서 모든 것은 객체 안에 있어야 한다.
		//그리고 객체를 사용하려면 그 객체를 만들어서(인스턴스화 시켜서) 사용해야 하는데
		//인스턴스를 만들지 않고도 쓰고 싶을 때 사용한다.

		//java에는 전역변수가 없다. 클래스 밖에 필드나 메소드가 존재할 수 없으니까. 근데 전역변수는 쓰고 싶다? 
		//그럴 땐 public static class Global을 만들어서 그 안에 static 필드/메소드를 만들어 쓰곤 한다.
		//안드로이드 스튜디오의 R 클래스가 그런 용도
		
		//2. 같은 클래스의 객체가 모두 같은 값을 공유하고 싶을 때
		//예) 그 클래스의 객체가 몇마리인지 확인하고 싶을 때 static int cnt 를 만들어 두고 생성자 메소드 안에서 cnt++할 수 있겠다.

		//void main() 앞에 public, static이 필요한 이유
		//컴퓨터(JVM)가 main 함수를 읽으려면 main()이 존재하는 class(class Main이라고 하자)의 객체부터 필요하다.
		//그런데 class를 만들려면, 즉 new Main을 하려면 실행문이니까 main 함수 내에 적어야 한다.
		//그런데 그러려면 class Main이 필요하고, 그러려면 new Main을 해야하고, 그러려면 main 함수가 필요하고...(반복)
		//이런 딜레마를 해결하기 위해 static이 필요
		//또한 컴퓨터 입장에서 main 함수가 어느 패키지 안에 있을 지 모르니 public이 필요.
		
		//static method 안에서는 인스턴스화 되지 않은 변수/메소드를 사용할 수 없다. 객체를 생성하지 않고도 쓸 수 있어야 하므로.
		//main()도 static method
//		ClassA.show();
		ClassA.showStatic();
		
		//심지어 같은 클래스 안의 멤버변수나 멤버함수도 non-static은 쓸 수 없다.
//		aaa = 10; //main()의 형제 멤버변수
		bbb = 10;
//		funcA(); //main()의 형제 멤버함수
		funcB();
		//class Main이 인스턴스화 되기 전까지는 aaa와 funcB 역시 메모리에 존재하지 않기 때문. 없는데 어떻게 써.
		
		System.out.println("-------------------4");
		
		//물론 인스턴스화가 된 객체라면 non-static 멤버도 얼마든지 쓸 수 있다.
		ClassC classC = new ClassC();
		classC.show();
		
		//오 근데 new Main도 되네? 하긴 main()은 static이라 Main 객체를 또 만들어도 중복으로 만들어지지 않는다(재귀호출 X). 
		//Main 클래스의 main() 외 다른 멤버들만 새로 만들어지는 셈. 
		Main m = new Main();
		m.aaa = 10;
		m.funcA();				
		
		System.out.println("-------------------5");
		
		//System.out.println() 의 구조를 알아보자
		//아래 두 구조는 같은 것
		ClassB.refC.show(); //show()는 static이 아니지만 refC가 static이라 사용 가능
		System.out.println(); //System 클래스 안에서  public static final PrintStream out = new PrintStream();
		
		//static int a; //지역변수에는 static 사용불가
	}
	
	//main()의 형제 멤버들(이런 용어는 없지만)
	int aaa; 
	static int bbb;
	
	void funcA() {
		System.out.println("I'm funcA of class Main");
	}
	static void funcB() {
		System.out.println("I'm funcB of class Main");
	}
}
