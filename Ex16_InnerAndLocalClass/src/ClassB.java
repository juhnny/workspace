
public class ClassB {

	int m = 5;
	static int n = 10;
	
	//static 이너 클래스
	public static class StaticInner{
		//이너 클래스에서 아우터 클래스의 static 멤버 사용 가능 
		int k = n;
//		int j = m; //아우터 클래스의 인스턴스 멤버 변수는 사용 불가
	}
}
