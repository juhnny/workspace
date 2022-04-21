
public class Second extends First{
	
	int b;
	
	void showSecond() {
		System.out.println("Second 클래스의 고유기능");
	}
	
	//override
	void show() {
		System.out.println("Second에서 오버라이드 한 show()");
	}

}
