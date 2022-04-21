
public class Main {

	public static void main(String[] args) {

		//Java에서 모든 method는 객체 안에 있어야 한다.
		
		// 학생 성적관리 프로그램
		Student stu1 = new Student();

		// 객체의 데이터를 한번에 출력하는 방법은 없음
		System.out.println(stu1); // C에서라면 주소를 알려줬겠지만 자바에서는 실제 주소 대신 [클래스명@주소해시코드] 정보를 알려줌.
		// 참고로 println은 자동으로 객체가 가진 toString() 메소드를 호출함

		// 필드 하나씩 출력
		System.out.println(stu1.name);
		System.out.println(stu1.kor);
		System.out.println(stu1.eng);
		System.out.println(stu1.aver);
		System.out.println(stu1.grad);
		System.out.println();

		stu1.name = "Sam";
		stu1.kor = 90;
		stu1.eng = 85;
		stu1.aver = (double) (stu1.kor + stu1.eng) / 2;
		stu1.grad = true;

		System.out.println(stu1.name);
		System.out.println(stu1.kor);
		System.out.println(stu1.eng);
		System.out.println(stu1.aver);
		System.out.println(stu1.grad);
		System.out.println();
		
		//매번 이렇게 쓰기 귀찮다. 객체 안에 한번에 출력하는 기능 있으면 좋잖아.
		//그래서 클래스 안에는 관련있는 기능을 저장해서 재사용성을 높인다.
		
		stu1.show();
		
		//
	}
}
