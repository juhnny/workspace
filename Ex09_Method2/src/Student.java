
public class Student {

	//Field (멤버변수)
	String name;
	int kor;
	int eng;
	double aver;
	boolean grad;
//	int this; //this는 변수명으로 사용 불가
	
	//Method (멤버함수; 기능)
	void show() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(aver);
		System.out.println(grad);
	}
	
	//필드 값을 전달받아 입력해주는 메소드
	//파라미터의 이름도 이해하기 좋게 달아둬야 편집기 도움말을 보고 이해할 수 있다.
	//근데 매개변수에 필드명이 가려지네?
	//모든 클래스에는 내가 만들지 않아도 자동 포함되는 멤버변수가 있다. 그것이 this
	//this는 그 자신의 클래스의 주소를 갖고 있는 참조변수
	//this도 키워드라고 봐도 무리가 아닌 게 int this라고 변수명으로 쓸 수가 없는 걸 보면 예약어...나 다름 없다.
	void setField(String name, int kor, int eng, boolean grad) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.aver = (double)(kor + eng)/2;
		this.grad = grad;
		
	}
	
	//필드 중 name만을 수정하기 위한 메소드
	void setName(String name) {
		this.name = name;
	}
	
	//필드 중 kor를 수정하기 위한 메소드
	void setKor(int kor) {
		this.kor = kor;
		this.aver = (double)(kor + this.eng)/2; //해당 멤버변수를 이용하는 다른 멤버변수들도 수정해줘야겠군..
	}
	
	//나머지 필드 수정 메소드는 생략
	
	//점수 총합을 반환하는 메소드
	//매개변수에 필드명이 가려지지 않기 때문에 필드를 가리키기 위해 this를 쓸 필요가 없다.
	int getTotal() {
		return kor + eng;
	}
	
	//필드 aver가 없는 셈 치고 점수 평균을 구해주는 메소드. getSum()을 활용해보자.
	double getAverage() {
		return (double)getTotal() / 2;
	}
	
	//초기화를 위한 특별한 함수: 생성자
	
	
	
}
