import member.Person;

public class Main {
	
	public static void main(String[] args) {
		
		//접근 제어자
		//OOP에서는 객체의 멤버변수들을 외부로부터 보호하는 것을 중요하게 봄
		//캡슐화, 정보은닉의 개념. 외부에서는 그냥 기능(메소드)만 쓰도록. 안에 있는 값은 함부로 건드리지 마
		
		//접근 제어자의 종류 4가지(보안 강->약 순서)
		//1. private	: 클래스 내부에서만 접근 가능
		//2. (default)	: 같은 패키지 내에서 참조 연산자(.)로 접근 가능. 다른 패키지에서는 접근 불가. package 접근제한이라고도 부름
		//3. protected	: default와 동일. 단, 다른 패키지여도 상속관계의 클래스라면 접근 가능
		//4. public		: 어느 곳에서든 참조 연산자(.)로 접근 가능
		
		//접근제한자는 세 곳에 적용 가능 : 클래스, 필드, 메소드
		
		//클래스에의 적용
		//본 클래스 내의 private class First - private class는 이너 클래스에만 적용 가능 
		//같은 패키지의 (default) class Second
		//다른 패키지의 protected class Third
		//다른 패키지의 public class Fourth
		
		new First(); //private static inner class
		new Second(); //default
//		new pack.one.Third(); //다른 패키지의 protected class 접근 불가
		new pack.one.Fourth(); //public
		
		//필드, 메소드의 적용
		//같은 패키지의 (default) class Second
		Second sec = new Second();
		
//		sec.a = 10; //a는 private. 점 찍어도 나타나지 않음. 강제로 a에 값을 넣어보려 해도 불가
		sec.b = 20;
		sec.c = 30;
		sec.d = 40;
		
//		sec.showPrivate(); // private. 점 찍어도 나타나지 않음
		sec.showDefault();
		sec.showProtected();
		sec.showPublic();
		
		//다른 패키지의 public class Fourth
		pack.one.Fourth four = new pack.one.Fourth();

//		four.a = 10; //private
//		four.b = 10; //다른 패키지에서 접근 불가
//		four.c = 10; //다른 패키지에서 접근 불가
		four.d = 10; //다른 패키지에서는 public만 접근 가능! 
		
//		four.showPrivate(); //private
//		four.showDefault(); //다른 패키지에서 접근 불가
//		four.showProtected(); //다른 패키지에서 접근 불가
		four.showPublic(); //다른 패키지에서는 public만 접근 가능! 
		
		
		//OOP에서는 기본적으로 정보은닉이 중요하기 때문에
		//필드는 외부에 노출하지 않도록 private 권장
		//메소드는 기능을 사용할 수 있게 public 권장
		
		//다만 그렇게 하면 필드값 수정을 직접 할 수 없기 때문에 필드값 수정을 모두 메소드(생정자 포함)를 통해 해야 함
		//필드값을 읽어올 수도 없으므로 출력 및 반환 메소드도 필요해짐

		//필드값 대입을 위한 함수들을 Setter 메소드라고 함
		//필드값 리턴을 위한 함수들을 Getter 메소드라고 함
		
		//이클립스 자동완성 사용

		//setA까지 치고 shift + space 눌러보면 이클립스에서 자동완성 제공
		//놓칠 수 있던 public까지 자동 완성
		
		//전체 자동완성도 제공
		//우클릭 - Source - Generate getters and setters
		
		//예) 앱 사용자 정보 저장: 이름, 나이
		Person p = new Person();
		p.setPerson("Sam", 10);
		p.show();
		
		p.setName("Sammy");
		//p.setAge; //setAge()가 default로 돼있어 다른 패키지에서 읽어올 수 없으므로 public을 잊지 말고 써주자.
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
	}
	
	//private class는 이너클래스에서만 만들 수 있다. 
	//inner class는 static이 필요하네? 왜 필요하고 private과의 관계는 뭔지 생각해보자.
	private static class First{
		//접근 제한자를 부여한 필드
		private int a;
		int b;
		protected int c;
		public int d;
		
		void show() {
			System.out.println("I'm private static class First");
		}

	}
}

