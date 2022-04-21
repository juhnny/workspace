
public interface TypeA {
	//interface도 생긴 건 class와 같다. class라고 생각해도 무방
	
	//1. 단독으로 객체 생성 불가
	
	//2. 필드에는 public & static & final 만 사용 가능.
	//인터페이스 안에서는 어떤 변수도 만들 수 없음.
	//final이므로 명시적 초기화 필요
//	int a; //변수를 만들어보려 해도 final로 인식되어 값을 대입하지 않으면 에러.
//	static int b; //static 변수를 의도했으나 final로 인식되어 값을 대입하지 않으면 에러.
	
	//필드에서 접근제한자는 public만 가능
//	private int aa = 5; //Illegal modifier for the interface field TypeA.aa; only public, static & final are permitted
//	default int bb = 6;
//	protected int cc = 7;
	public static final int d = 10;
	
	//모든 필드는 기본값이 public static final 상수
	//하지만 웬만하면 public static final이라고 명시를 해주자.
	int e = 20;	//자동 public static final
	final int f = 30; //자동 public static
	static int g = 40; //자동 final

//	d = 11; //값을 변경하려 하면 에러
//	e = 21;  //값을 변경하려 하면 에러
//	f = 31   //값을 변경하려 하면 에러
//	g = 41; //값을 변경하려 하면 에러
	
	
	//3. abstract 또는 default 인스턴스 또는 static 메소드만 사용 가능
	//자바 1.8 버전부터 default 인스턴스 메소드, static 메소드가 가능해짐.

	//메소드 접근제한자
	//인스턴스 메소드
	private void funcPri() {System.out.println();} //인터페이스문 내부에서만 쓸 메소드가 필요할 때?
	default void funcDef() {System.out.println("funcDef() of TypeA");} //라이브러리 업데이트에 default가 필요해서 만들어졌다는데 잘은 모르겠다.
																		//자식 객체에게 미리 구현한 기능을 상속해주고 싶을 때 사용하지 않을까..
																		//한 클래스에 여러 인터페이스 적용 시 추상 메소드는 이름이 같아도 문제 안되지만 인스턴스 메소드는 이름과 파라미터까지 같으면 에러
//	protected void funcPro() {}; //only public, private, abstract, default, static and strictfp are permitted
//	public void fundPub() {}; //abstract로 인식
	
	//static 메소드
	private static void funcPriSta() {System.out.println("funcPriSta() of TypeA");} //인터페이스 내부에서 인터페이스의 기능을 굳이 static으로 만들어 쓴다..? 잘 안 쓸 것 같고
//	default static void funcDefSta() {System.out.println();} //only one of abstract, default, or static permitted
//	protected static void funcDefSta() {System.out.println();} //only public, private, abstract, default, static and strictfp are permitted
	public static void funcPubSta() {System.out.println("funcPubSta() of TypeA");} //인터페이스의 고유 기능을 만들어서 쓰고 싶을 때 쓸 수 있겠다.
	
	//abstract 메소드
//	private abstract void funcPriAbs();
//	default abstract void funcDefAbs();
//	protected abstract void funcProAbs();
	public abstract void funcPubAbs(); //이게 인터페이스 사용의 주 목적
	
	//인터페이스에서는 기본값이 public abstract. 
	public abstract void aaa();
	abstract void bbb();	//자동 public
	void ccc();				//자동 public abstract

	
	//6. 이너클래스 생성 가능 - 자동 public static
	class Inner{
		void show() {
			System.out.println("show() of Inner class of TypeA interface");
		}
	}
}
