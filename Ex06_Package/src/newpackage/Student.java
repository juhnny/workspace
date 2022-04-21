package newpackage; //패키지명이 명시되어 있어야만 함

public class Student {
	
	String name;
	public int kor; //C++처럼 한번에 여러 멤버를 public 하는 문법은 없다. public 선언한 멤버만 다른 패키지에서 인식 가능.
	int eng;
	
	public void show() {
		System.out.println("Student @newpackage");
	}
}
