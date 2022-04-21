
public class ClassC {

	int g = 10;
	
	
	
	void aaa() {
		
		int h = 20;
		
		//Local class - 메소드 안에 설계한 클래스
		//1. 그 메소드 안에서만 잠깐, 마치 1회용처럼 사용하는 객체를 만들고 싶을 때. 독립된 클래스로 만들면 누가 불러서 쓸 수도 있으니까. 자주 있는 경우는 아니다. 
		//2. 익명클래스를 사용할 때 지역클래스를 이용함
		//지역 클래스 안에서는 아우터 클래스의 멤버변수를 내것처럼 사용할 수 있음. 익명클래스도 마찬가지.
		class Local{
			
			int i = 30; //로컬 클래스의 멤버변수
			
			void showLocal() {
				System.out.println("Local class @ClassC.aaa()");
				System.out.println("g: "+g);
				System.out.println("h: "+h); //에러 표시는 안 나지만 에러. 
				//로컬 클래스 내에서 지역변수는 사용 불가 -> 로컬 클래스 안에서 쓰려면 
				//aaa() 내에서 Local 객체를 사용하고 난 뒤에 aaa()가 끝나면 지역변수는 사라지지만 객체는 가비지 컬렉터가 지우기 전까진 유지되기 때문.
				//단, final 지역 변수는 사용 가능. 상수는 Method 영역에 만들어지기 때문.
				//지역변수 h를 썼는데도 에러가 안 뜨는 이유는 이클립스가 int h를 final일 것으로 자동으로 가정하기 때문
//				h = 25; //지역변수 h를 수정하려 h는 final이거나 사실상 final이어야 한다면서 에러
				g = 15; //아우터 멤버변수 g를 수정하는 건 가능
				i = 10; //자기 멤버변수는 물론 맘대로 쓸 수 있다.
				//결론: 로컬 클래스 내에서 외부의 (final 상수가 아닌) 변수를 써야 한다면 메소드 안에 있는 지역변수가 아닌 아우터 클래스의 멤버변수를 써야 한다.
			}
		}//class Local
		
		Local local = new Local();
		local.showLocal(); 
		
	}//aaa()
	
//	Local local2;
	
	void bbb() {
//		Local local = new Local(); //메소드 밖에서는 로컬 클래스를 찾을 수도 없다. 
	}
	
}