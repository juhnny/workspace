
public class Robot {

	void move() {
		System.out.println("move @Robot");
	}
}

//원래 다른 파일에 만들어야 public을 붙일 수 있지만 귀찮아서..
class RobotFly extends Robot {
	//새로운 기능 추가
	void fly() {
		System.out.println("fly @Robot");
	}
	
	//상속받은 메소드를 수정해서 사용(override)
	//부모 메소드가 없어지는 게 아니라 둘 다 존재하지만 하나만 보이게 되는 것. 지역변수가 전역변수 가리는 것과 비슷
	//이름과 파라미터가 같아야 오버라이드
	//이름이 다르면 그냥 다른 메소드. 파라미터가 다르면 오버로드(부모의 메소드와 자식의 메소드라서 엄밀히 오버로딩인지는 모르겠지만)가 됨
	void move() {
		System.out.println("move @RobotFly");
	}
	
	//이클립스의 자동완성기능을 사용한 경우(move까지 치고 스페이스 엔터)
	//annotation은 기능이 있는 주석. 주석에 쓰인 기능과 그 아래 명령이 일치해야 한다.
//	@Override 
//	void move() {
//		// TODO Auto-generated method stub
//		super.move();   //일반적으로 부모의 메소드는 그대로 사용하고 기능을 덧붙이는 경우가 많아서 이렇게 제안하는 것
//						//오버라이드 된 부모의 메소드가 사라진 게 아니라는 증거
//	}
	
	void move(int a) {
		System.out.println("move(int a) @RobotFly");
	}
	
	
}