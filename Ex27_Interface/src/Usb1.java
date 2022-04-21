//인터페이스는 상속할때 extends라는 키워드를 사용하지 않고.
//구현한다는 뜻을 의미하는 implements 키워드 사용함.
public class Usb1 implements TypeA{
	//인터페이스는 추상메소드를 가지고 있기 때문에
	//반드시 추상메소드들을 오버라이드 해서 구현해야만 함!
	//즉, 강제적으로 그 기능을 보유하도록 규격화 함!

	@Override
	public void funcPubAbs() {
		System.out.println("funcPubAbs() of Usb1");	
		
	}

	public void aaa() {
		System.out.println("aaa() of Usb1");
	}
	
	@Override
	public void bbb() {
		System.out.println("bbb() of Usb1");	
	}

	@Override
	public void ccc() {
		System.out.println("ccc() of Usb1");	
	}

	
}
