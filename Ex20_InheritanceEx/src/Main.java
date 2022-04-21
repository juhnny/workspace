
public class Main {

	public static void main(String[] args) {
		
		//회원가입 기능
		//회원 종류: 일반, 학생, 교수, 근로장학생
		
		//1. 일반회원	: 이름, 나이
		//2. 학생		: 이름, 나이, 전공
		//3. 교수		: 이름, 나이, 연구과제
		//4. 근로장학생	: 이름, 나이, 전공, 업무
		
		Person p = new Person("Kim", 20);
		p.show();
		System.out.println();
		
		Student s = new Student("Choi", 25, "Law");
		s.show();
		System.out.println();
		
		//교수와 근로장학생은 비슷하므로 생략
		
	}
}
