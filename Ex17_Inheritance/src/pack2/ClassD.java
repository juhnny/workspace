package pack2;

import pack1.ClassC;

//다른 패키지의 클래스를 상속받기
public class ClassD extends ClassC {
	//상속만으로도 이미 멤버변수 4개(c1, c2, c3, c4) 존재.
	//헌데! 비록 상속은 받았지만 접근제어자가 있으면 부모의 멤버라도 맘대로 쓸 수 없다.
	void show() {
		//부모의 private 멤버
//		System.out.println(c1); //부모 클래스 외부에서는 접근 불가
		
		//부모의 (default) 멤버
//		System.out.println(c2); //패키지가 다르면 접근 불가
		
		//부모의 protected 멤버
		System.out.println(c3); //패키지가 달라도 상속관계라면 protected는 접근 가능
		
		//부모의 public 멤버
		System.out.println(c4); //public은 무조건 사용 가능
		
	}
	
	
	
	
}
