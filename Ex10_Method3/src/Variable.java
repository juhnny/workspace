
public class Variable {

	public static void main(String[] args) {
		Variable var = new Variable(); //클래스 안에서 그 클래스를 사용할 수가 있네. 
		//new Var -> main -> new Var -> main -> ... 식으로 재귀가 이뤄지지 않는 건?
		//new Var -> main -> new Var까지는 이뤄지지만 다음 main 함수를 호출하진 않았기 때문
		//이제 main을 호출하면? 그건 그냥 main 함수의 무한 재귀호출. main -> main -> main -> ..  
//		var.main(args); //java.lang.StackOverflowError
		
		//재귀함수 eee()
//		var.eee(); //java.lang.StackOverflowError
	}
	
	//자바에서 변수의 종류 [ 멤버변수, 지역변수, 매개변수, 정적(static)변수-추후수업 ]
	
	//멤버변수(Field) - class {..}안에 선언된 변수
	//명령줄 위치와 관계없이 객체가 처음 생성될때 같이 만들어짐
	int a; //자동 0 초기화
	int b;
	
	//지역변수 - 메소드 {..}안에 선언된 변수
	void aaa() {
		int k; //지역변수 : 자동 초기화 되지 않음. 즉, 쓰레기
		
		System.out.println( a ); // 0
		//System.out.println( k ); //error - 쓰레기는 출력불가
		
		//지역변수는 선언 후 사용해야 하지만
//		d = 0; //error
		//int d;
		
		//멤버변수는 저 아래에서 선언하더라도 객체가 생성될 때 같이 생성되므로 더 위에 있는 메소드에서도 사용 가능
		System.out.println(c);
	}
	
	int c; //멤버변수가 이렇게 중간에 있어도 됨.
	
	void bbb() {
		//클래스의 멤버변수는 이 클래스 영역안에 어디서든 인식가능
		a= 50; //a는 멤버변수를 의미
		System.out.println(a); //50
		
		//aaa()메소드 영역안에 있는 지역변수 k는 인식불가
		//k=30;//error

		//멤버변수와 같은 이름을 가진 지역변수가 있을 수 있음
		int a;//지역변수
		a=30;
		System.out.println(a); //30
		
		//x=50;//error - 다른 함수의 매개변수는 그 지역에서만 사용가능
	}
	
	//매개변수는 지역변수의 일종
	void ccc(int x, int a) {
		x++;				
		a= 100; //a는 멤버변수가 아니라 매개변수를 의미함.
	}
	

	//재귀호출 : Recurcive call
	void eee() {
		eee(); //본인이 본인메소드를 호출할 수도 있음.		
	}

}

//클래스 밖에 변수 선언은 불가!
//int g; //에러 - 자바에는 전역변수가 없음.
