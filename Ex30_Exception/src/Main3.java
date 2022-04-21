
public interface Main3 {
	public static void main(String[] args) {
		
		// throw : 코드를 통해서 강제로 예외를 발동!! [ throws와 다름 ]
		
		//원래는 예외가 아니지만 억지로 예외상황이라고 만들고 싶을때..
		try {
			System.out.println("aaa");
			//억지로 예외를 던지고 싶을때.. -즉, catch문으로 이동하고 싶을때
			throw new Exception();
			
		}catch(Exception e) {
			System.out.println("예외발생!!");			
		}
		System.out.println();
		
		//[활용 예]
		//메소드에게 계산을 요청했을때.. 음수가 결과로 나오지 않았으면..할때
		//즉, 만약 음수가 나오면 "예외상황"이라고 인식 했으면...할때!
		//java언어는 계산결과가 음수라고 해서 [예외]라고 판단하지 않음.!
		int n;
		
		try {
			//n= aaa(10, 5);
			n= aaa(10, 15);
			System.out.println("n:"+n);
			
		}catch(Exception e) {
			System.out.println("계산결과가 음수면 안됨!");
			System.out.println(e.getMessage());
		}
		

	}
	
	//나만의 Exception클래스를 설계하여 사용
	static int aaa(int a, int b) throws MyException{
		if(a<b) {
//			throw new Exception("나만의 에러:음수 싫어!!"); //언제나 자식을 throws 하게 돼있는데 부모를 throw하라고 할 순 없다. 
			throw new MyException("Hi~~"); //class로 나만의 Exception 종류를 만들어 사용
		}
		
		return a-b;		
	}

} 


//나만의 Exception 클래스 설계 가능
class MyException extends Exception{	
	//에러메시지를 전달받는 생성자
	public MyException(String msg) {
		super(msg);	 //부모 클래스 Exception의 생성자를 활용. Exception 객체는 .getMessage() 메소드에서 이 String을 리턴
	}
}
