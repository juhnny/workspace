
public class Main {

	public static void main(String[] args) {
		
		Student stu = new Student();
		
		//모든 객체들은 null에 해당하는 값으로 초기화됨
		System.out.println(stu.name);
		
		//메소드 호출
		stu.show();
		
		//대입하려고 보니 하나하나 하기 귀찮아
		//필드에 대입하기 편한 입력 기능이 있다면?
		//대입 메소드를 만들자.
		stu.setField("Sam", 67, 86, true);
		
		//근데 이름을 수정해야 하면?
		stu.name = "Sammy"; //라고 필드에 대입하면 되긴 하지만 만약 필드가 private이면 접근 연산자로는 접근이 안되는데?
		//그럼 다시 setField 메소드를 써야 하는데 파라미터도 다시 맞춰줘야 하잖아. 귀찮고 실수도 발생.
		stu.setField("Sammy", 67, 86, true);
		//이름만 수정해야 하는 경우도 고려해서 메소드를 꼼꼼하게 만들어주는 것이 좋은 클래스 설계 방법
		//이름만 수정하는 메소드도 만들자. 
		stu.setName("Sammy");
		//마찬가지로 필드 각각에 대한 메소드를 다 만들어주는 게 좋다.
		stu.setKor(90);
		stu.show();
		
		//총합을 리턴해주는 메소드
		System.out.println(stu.getTotal());
		
		//평균을 리턴해주는 메소드
		System.out.println(stu.getAverage());
		
		
		//Method Overloading
		//Calculator 클래스를 만들어 정수형 사칙연산과 실수형 사칙연산을 해주는 메소드를 만들어보자.
		//왜? 계산기가 실수 계산을 못하면 안되잖아.
		//정수형 연산 메소드와 실수형 연산 메소드의 이름은 같아야 한다.
		Calculator cal = new Calculator();
		System.out.println(cal.sum(10, 20));
		System.out.println(cal.sum(4.5, 4.2));
		
		//문자열 데이터의 산술 연산 메소드
		System.out.println(cal.sum("123", "123"));
		
		//가변길이 인자
		//사용자가 메소드에 몇 개의 인자를 넣을지 정하기 힘들다면? 메소드 오버로딩을 계속 해?
		//cal.sum(10, 20, 30, 40, 50); 이런 것도 되게 할 순 없을까?
		//가변길이 인자를 사용한 메소드는 오버로딩 불가(이름이 달라야 함)
		//printf가 대표적인 가변길이 인자 메소드
		System.out.println(cal.sumN(10, 20, 30, 40, 50));
		
		//위 Calculator처럼 필드 없이 메소드만 가진 클래스도 가능하고 많이 쓰인다.
		
	}
}
