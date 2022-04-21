
public class Initialization {

	//초기화 단계(순서)
	//기본값 초기화 -> 명시적 초기화 -> 초기화 블럭 -> 생성자
	//차례대로 진행된다. 명시적 초기화가 돼있더라도 기본값 초기화를 건너뛰지 않는다는 얘기
	
	//1. 기본값 초기화 
	int a;
	//2. 명시적 초기화
	//기본값 초기화 후 다시 10이 대입됨
	int b = 10;
	
	//3. 초기화 블럭
	{
		//실행문 작성이 가능
		//원래 객체의 멤버가 될 수 있는 건(클래스 내에 쓸 수 있는 건) 세가지 뿐(클래스, 필드, 메소드)
		if(a == 0) System.out.println("int a was "+a+" - 기본값 초기화 증거");		

		if(b == 10) {
			System.out.println("int b was "+b+" - 명시적 초기화 증거");
			b = 15; 			
		}
		int c = 100; //초기화 블록에서 생성된 c는 지역 변수.
		System.out.println("c: "+c);
		System.out.println("초기화 블럭 실행 끝");
	}
	
	//4. 생성자
	public Initialization() {
		if(b == 15)	{
			a = 10;
			System.out.println("int b was "+b);
		}
		b = 20;
//		System.out.println("c: "+c); //초기화 블록에서 생성된 c는 지역 변수.

		System.out.println("생성자 실행 끝");
	}
	
	//실무적으로는 명시적 초기화와 생성자 초기화를 자주 쓴다. 
	//초기화 블럭은 대부분의 경우 생성자 함수로 대체할 수 있어서 잘 안쓰인다.
	
}
