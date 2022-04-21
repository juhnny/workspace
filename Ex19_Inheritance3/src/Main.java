
public class Main {

	public static void main(String[] args) {
		
		//Method Override
		//상속받은 기능(메소드)을 수정하는 방법
		//부모 메소드가 없어지는 게 아니라 둘 다 존재하지만 가려지게 되는 것. 지역변수가 전역변수 가리는 것과 비슷
		//이름과 파라미터가 같아야 오버라이드
		//이름이 다르면 그냥 다른 메소드. 파라미터가 다르면 오버로드(부모의 메소드와 자식의 메소드라서 엄밀히 오버로딩인지는 모르겠지만)가 됨
		
		Robot r1 = new Robot();
		r1.move();
		System.out.println();
		
		RobotFly rf = new RobotFly();
		rf.fly();
		rf.move(); //오버라이드 메소드
		rf.move(5); //오버로드(?) 메소드
		
		//오버라이드 시 접근제한자
		//부모 메소드의 접근제한자보다 더 넓거나 같은 범위의 접근제한자를 사용해야 한다.
		//부모가 default였으면 자식 메소드에서 오버라이드 할 때는 최소한 default이거나 protect, public. 
		
	}
}
