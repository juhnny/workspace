
public class Main {

	public static void main(String[] args) {

		ClassA a = new ClassA(); //이너클래스 객체는 같이 만들어지지 않음
		
		//이너클래스는 외부에서 그냥은 인식 안됨
//		Inner inner; //에러
		
		//아우터클래스명을 사용해야 이너클래스명을 인식
		ClassA.Inner inner;
		
		//인식은 되지만 여기서 곧바로 객체 생성은 불가능. 외부에서 맘대로 못 쓰게 하려고 만든 게 이너클래스. 안정성을 위해.
		//즉, 아우터 객체 없이 이너 객체를 맘대로 만들지 못하도록 하기 위한 기법
		//예를 들어 경고창의 확인/취소 버튼도 클래스인데 이 버튼들이 경고창이라는 클래스 없이는 만들어질 수 없게끔.
//		ClassA.Inner inner2 = new ClassA.Inner(); //No enclosing instance of type ClassA is accessible.

		//이너클래스를 외부에서 사용하고 싶다면 아우터 객체(a)를 먼저 만들고 이너 객체를 리턴하는 메소드를 통해서 할당해줘야 함
		ClassA.Inner inner3 = a.makeNiceInstance();
		
		//static inner class
		//아우터 객체 없이 사용하는 이너 클래스
		//일반 이너클래스를 쓰는 것처럼 사용 안정성이 목적이 아니라 클래스의 소속을 표현하고 싶을 때 사용
		//예) Builder라는 클래스가 굉장히 많은데 
		//그럼 package를 쓰면 되는 거 아냐?
		//이너클래스를 쓰면 아우터 클래스의 일부(static 멤버)를 내 것처럼 쓸 수 있어서. 실제로 개발에 편리하다고.
		
		//static멤버변수 사용 - 객체생성없이 쓰는 변수
		System.out.println(ClassB.n);
		
		//static inner class - 아웃터객체없이 사용하는 이너클래스
		ClassB.StaticInner sInner = new ClassB.StaticInner();
		System.out.println(sInner.k);
		
		
	}

}
