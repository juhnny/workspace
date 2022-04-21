import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//Object class에 대해 알아보자
		//객체라는 개념이 아니라 Object라는 클래스에 대해서
		
		//모든 class의 조상 클래스 - 최상위 클래스
		//Java 언어에 존재하는 모든 클래스는 무조건 Object class를 상속
		//James Gosling이 모든 클래스에 주어져야 한다고 생각했던 기능들
		//명시적으로 다른 클래스를 상속받더라도 Object 클래스는 상속됨(엄밀히 말하면     클래스가 Object를 상속했기에 계층상속에 의해 Object의 멤버를 가지게 됨
		
		//새로운 클래스를 만들어보자
		ClassA a = new ClassA();
		System.out.println(a.a);
		//기본적으로 Object로부터 상속받은 메소드들
		//equals(), getClass(), hashCode(), notify(), notifyAll(), toString(), wait()
		
		//1. hashCode()
		//객체의 해시코드를 반환. 리턴타입 int
		//해시코드: 메모리의 물리주소를 상대적인 주소로 표현한 숫자(자바에서의 주소)
		Random rnd = new Random();
		System.out.printf("%x \n", rnd.hashCode()); 
		System.out.println(Integer.toHexString(rnd.hashCode()));
		System.out.println("-----hashCode()-----\n");

		
		//2. toString()
		//그 객체를 소개하는 문자열을 리턴하는 메소드. 리턴타입 String
		//"패키지명.클래스명@해시코드"
		System.out.println(rnd.toString());
		System.out.println(rnd); //println은 toString()을 반환
		
		//toString()의 기능이 다른 클래스도 있다.
		String s = new String("Hello");
		System.out.println(s.toString()); //"패키지명.클래스명@해시코드"이 안 나오고 데이터가 나오네? 상속받은 메소드 그대로가 아니라 오버라이드 한 메소드라는 것
		
		//ClassA의 toString()을 직접 오버라이드 해보자
		System.out.println(a.toString());
		System.out.println("-----toString()-----\n");

		
		//3. equals(Object obj)
		//전달받은 obj와 같은 객체인지 여부를 리턴(true/false)
		//기본적으로는 주소를 비교한다. 클래스가 같아도 객체가 다르면 주소가 다르다.
		ClassA a2 = new ClassA();
		ClassA a3 = new ClassA();
		ClassA a4 = a3;
		
		System.out.println(a2.equals(a3));
		System.out.println(a3.equals(a4));
		
		//하지만 개발자들은 잘 쓰지 않는다. 
		//같은 객체인지 알고 싶으면 참조변수끼리 비교 연산 하면 되니까.
		System.out.println(a2 == a3);
		System.out.println(a3 == a4);
		
		//하지만 String에 대해서 equals()는 주소가 아니라 문자열을 비교해주는데..
		//그 말인 즉 String의 equals()는 오버라이드 돼있다는 소리
		System.out.println("-----equals()-----\n");
		
		//4. getClass()
		//클래스의 정보를 가진 객체를 리턴. 리턴타입 Class class(그 클래스의 정보를 가진 멤버를 갖고 있다)
		Class c = a.getClass();
		System.out.println(c.getName());
		System.out.println(c.getPackage());
		System.out.println(c.getPackageName());
		System.out.println(c.getSuperclass());
		System.out.println(c.getFields().length); 	
		System.out.println("------getClass()------\n");
		
		
		//5~7. wait(), notify(), notifyAll()
		//thread 수업 이후 설명
		
		
		//Object 클래스는 모든 클래스의 부모 클래스
		//이를 이용하면 Object 참조변수로 모든 객체를 참조할 수 있다는 것
		Object obj = null;
		obj = new Random(); //업캐스팅
		System.out.println(obj);
		//obj.nex.. //Random의 고유기능은 쓸 수 없다. 왜? Object에 그 기능이 없으니까.
		
		//이를 이용한 대표적인 메소드 - 메소드의 파라미터로 어떤 객체든 받고 싶을 때[리턴타입도 마찬가지]
		//System.out.println(Object x) - 전달받은 객체의 toString()을 발동시켜서 출력
		//Object 타입 참조변수로 받아서 String 타입 리턴
		System.out.println(new Random());
		System.out.println(new String("abc"));
		System.out.println(new ClassA());
		System.out.println("---------------\n");

		
		//배열의 정체는 뭘까?
		int[] arr = new int[] {10, 20, 30};
		System.out.println(Integer.toHexString(arr.hashCode())); //3ada9e37
		System.out.println(arr.toString());						//[I@3ada9e37
		System.out.println(arr.getClass().getName());			//[I
		System.out.println(arr.getClass().getPackage());		//null
		System.out.println("-----배열의 정체는 뭘까-----\n");
		
		



		
		
	}
}
