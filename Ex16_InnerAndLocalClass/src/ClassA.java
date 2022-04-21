
//이너클래스를 갖고 있는 클래스는 아우터클래스라고 부름
public class ClassA {

	int n; 
	
	void show() {
		System.out.println("ClassA.show()");
		
//		k = 20; //아우터 클래스는 이너 클래스의 멤버를 자기 것처럼 사용할 수 없음
	}

	//Inner class: 클래스 안에 다른 클래스를 설계
	//객체 안에 객체가 있는 게 아니다. 그냥 설계도 안에 다른 설계도를 써놓았을 뿐
	//1. 외부(다른 클래스)에서 아우터 클래스명 없이는 인식 불가.
	//2. 외부에서 아우터명을 이용하여 인식하더라도 객체생성 불가. <- 그게 사용 이유
	//3. 이너 클래스는 아우터 클래스문 안에서만 생성할 수 있음
	//4. 이너 클래스는 아우터 클래스의 멤버를 자기 것처럼 사용할 수 있음.(이너 객체가 있다면 반드시 아우터 객체가 먼저 존재할 것이기 때문에)
	class Inner{
		int k = 10;
		
		void showInner() {
			n = 20; //아우터 클래스의 멤버변수를 내 것처럼
			System.out.println("Inner.showInner() n:"+n);
			
			show(); //아우터 클래스의 메소드도 내 것처럼
		}
	}
	
	
	//이너클래스를 외부 클래스에서도 사용하고 싶다면? 메소드를 통해 리턴으로 전달해줘야 한다.
	Inner makeNiceInstance() {
		//이너클래스 객체 생성
		Inner inner = new Inner();
		return inner;
	}
	
}///ClassA

