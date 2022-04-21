package pack.one;

public class Main {

	public static void main(String[] args) {
		
		Second sec = new Second();
		sec.show();
		
		//위에 만 줄짜리 코드가 있는데 Second라는 클래스명을 Third로 바꾸고 싶다면?
		//.java 파일명과 클래스명과 그 클래스를 이용한 모든 코드를 다 바꿔야 하는데?
		//왼쪽 Package Explorer에서 .java 파일 우클릭 -> Refactor -> Rename
		//Update references 체크하면 이 클래스를 참조한 코드들도 한번에 다 수정됨
		//체크 안 하면 파일명과 클래스명만 바뀜
		
		pack.two.Fourth fou = new pack.two.Fourth();
		fou.show();
		
		//위에 만 줄짜리 코드가 있는데 pack.two라는 패키지명을 pack.three로 바꾸고 싶으면?
		//pack.two라는 패키지명과 그 하위 패키지명과 그 패키지를 이용한 코드를 다 바꿔야 하는데?
		//왼쪽 Package Explorer에서 pack.two 패키지를 우클릭 -> Refactor -> Rename
		//하위 패키지도 포함해서 이름을 변경하고 싶으면 Rename subpackages 체크
		//Update references 체크하면 이 패키지를 참조한 코드들도 한번에 다 수정됨
		//체크 안 하면 패키지명만 바뀜
		
	}
}
