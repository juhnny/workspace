
public class Member {

	int no;   //회원번호
	Person p; //회원개인정보 [이름,나이]
//	Person p = new Person(); //참조변수는 명시적 초기화 혹은 생성자에서 객체 할당을 해주어야 NullPointerException을 피할 수 있다. 
	
	//Person의 show()를 이용한 show()
	void show() {
		System.out.println("no: "+no);
		p.show();
	}
	
	//Person의 setField()를 이용한 setField()
	void setField(int no, String name, int age) {
		this.no = no;
//		this.p.name = name;
//		this.p.age = age; //이미 만들어진 Person의 메소드 사용
		this.p.setField(name, age);
	}
	
	//Person의 생성자를 활용한 생성자
	
	public Member(int no, String name, int age) {
		this.no = no;
		this.p = new Person(name, age); //참조변수는 명시적 초기화 혹은 생성자에서 객체 할당을 해주어야 NullPointerException을 피할 수 있다. 
	}

	public Member() {
		this(-1, "익명", 0);
	}
	
	//이것도 가능하긴 함
	public Member(int no, Person p) {
		this.no = no;
		this.p = p;
	}
}