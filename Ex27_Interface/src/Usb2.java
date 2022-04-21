//한 클래스에 여러 인터페이스를 다중 구현 가능
public class Usb2 implements TypeA, TypeB {
	//상속받은 메소드들은 모두 구현해줘야 함
	@Override
	public void funcPubAbs() {
		
	}
	
	@Override
	public void aaa() {
		
	}
	
	@Override
	public void bbb() {
		
	}
	
	//TypeA, TypeB 공통 추상메소드인 ccc()
	//상속받은 추상메소드 중 이름이 같은 게 있다면 하나만 구현해주면 된다. 어차피 내용은 비어있으니까.
	//그 메소드들에 기대되는 기능이 서로 다르다면? 그 인터페이스들을 함께 사용하면 안 된다. 인터페이스 설계자의 의도에 어긋나는 것
	@Override
	public void ccc() { 
		
	}
	
	@Override
	public void ddd() {
		
	}


}
