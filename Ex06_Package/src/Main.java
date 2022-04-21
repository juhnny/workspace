//import newpackage.Student;
//import newpackage.*;

public class Main {
	
	public static void main(String[] args) {
		
		//사용자 정의 클래스를 만들다 보면 
		//보통 클래스 이름은 그 기능을 따라 짓기 때문에
		//의도치 않게 클래스 이름이 같아지는 경우가 있는데
		//이런 문제를 해결하기 위한 문법이 package
		//물리적인 폴더구분을 통해 같은 이름의 class를 구별
		
		//학생 신상정보를 저장하는 클래스와 시험성적을 저장하는 클래스가 이름이 둘 다 Student인 경우
		//새 패키지 폴더를 만들어 구분
		//Package Explorer에서 default package는 따로 패키지 폴더가 없다는 것
		//src 폴더 우클릭 - New - Package 선택해 newpackage라는 이름의 새 패키지 생성했음
		//패키지명은 모두 소문자로 적는 것이 관례. 대문자 하나도 없이.-> 클래스 이름과 구분하기 위해
		//단어의 구분은 점(.)으로 대신. 큰 개념이 앞에 오고 작은 개념이 뒤에 오게.
		//패키지명이 겹치면 에러. 그럼 전세계 어디에도 없는 유니크한 패키지명을 쓰는 법? 
		//현업에서는 인터넷 도메인을 쓰거나(썬마이크로시스템 - com.sun.crypto.provider) 아이디를 쓰거나(구글 스토어)
		//가급적 패키지명은 2단어 이상을 권장. 한 단어는 겹쳐질 확률이 크니까.
		//ex) java.time   google.maps   kakao.maps   naver.maps
		//java.time이라는 패키지명은 java.time이라는 폴더명이 있는 게 아니라 java 폴더 안에 time이라는 폴더가 있는 것
		//ex) new aaa.bbb.ccc.Hello.Nice(); 라고 쓰면 aaa 패키지 안의 bbb 패키지 안의 ccc 패키지 안의 Hello 클래스 안의 Nice 클래스


		//default package와 newpackage 폴더 아래 각각 Student 클래스를 생성함
		
		Student stu1 = new Student(); //그냥 불러온 Student는 default package에 있는 Student
		stu1.show();
		
		//다른 패키지의 클래스를 불러오는 법
		//패키지.클래스
		newpackage.Student stu2 = new newpackage.Student(); //newpackage의 Student 클래스
//		stu2.name; //인식이 안 된다. 다른 패키지의 클래스는 public 멤버만 불러올 수 있다.
//		stu2.eng; //private이라 인식 불가
		stu2.show(); //public 선언해서 인식 가능
		//C++처럼 한번에 여러 멤버를 public 하는 문법은 없다.
		
		//이클립스에서 package 대신 folder로 만들면?
		folder.Student stu3 = new folder.Student();
		stu3.show();
		//차이 없다.
		//탐색기에서 직접 폴더를 만들면 이클립스에서 인식을 못하네.
		
		//default package는 anonymous package라고 해서 이름이 없으므로 불러오는 게 불가능
//		new defaultpackage.Student; //이런 문법이 없어.
		//다른 패키지에서 default package의 클래스를 쓸 방법이 없다! 
		//그래서 실무에서 패키지 없이 default package를 쓰는 일은 없다.
		
		//import
		//newpackage의 Student를 기본값으로 하고 싶다면?
		//import newpackage.Student;를 맨 위에 써준다.
		
		//java의 2000여 개의 클래스들(Java System API)은 모두 패키지 안에 있음
		//java.lang 패키지는 워낙 필수적인 클래스들이 있어서 import 명시 없이도 import 되어 있음.
		//그래서 String 클래스는 그냥 쓸 수 있는 것
		new java.lang.String();
		new String();
		//그 외의 class들은 모두 명시적으로 import 필요
		
		//같은 이름을 가진 클래스 둘을 동시에 import 하면 에러
		
		//import 패키지명.*;
		//패키지 내 클래스 모두를 import
		
		
		
	}
}
