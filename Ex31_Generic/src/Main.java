
public class Main {

	public static void main(String[] args) {
		
		//generic
		//클래스를 만들 때 멤버의 자료형을 결정하지 않고
		//사용(new)할 때 결정하도록 하는 문법
		//같은 붕어빵 객체를 만들면서 팥을 넣었다가 슈크림을 넣었다가 하고 싶을 때
		
		//데이터 하나를 멤버로 저장하여 가지고 있는 Box 객체
		Box box = new Box();
		//기본형 자료형은 참조형 자료형이 아니므로 wrapper 클래스를 사용해서 입력해줘야 한다.
		box.setObj(new Integer(10));
		System.out.println(box.getObj());
		
		//다행히 간단히 축약형 표현도 지원한다.
		box.setObj(20);
		System.out.println(box.getObj());
		
		//다른 자료형도 Double 클래스로 바꾸어 대입 가능
		Box box2 = new Box();
		box2.setObj(3.14);
		System.out.println(box2.getObj());
		
		//문자열 대입도 가능
		Box box3 = new Box();
		box3.setObj("D'oh!");
		System.out.println(box3.getObj());
		
		//값을 가져와서 별도의 지역변수에 대입하고 사용해보자

		//Object를 Integer로 다운캐스팅, Integer 클래스는 int로의 형변환을 지원 
		int n = (int)(Integer)box.getObj();
		//Object -> Integer는 자동으로 해주기 때문에 생략 가능
		n = (int)box.getObj();

		double d = (double)(Double)box2.getObj();
		
		String s = (String)box3.getObj();
		
		//멤버를 Object 객체로 만들면 그 값을 사용할 때마다 형변환을 거쳐야 하는 번거로움이 있음
		
		//멤버로 제네릭을 사용한 클래스 Bo2
		Box2 b = new Box2(); //그냥 만들면 제네릭 멤버 a는 Object 클래스로 만들어짐
		b.setA("Donut");
		System.out.println(b.a.getClass().toString()); //?? String인데?
		
		//Box2<int> b2 = new Box2<int>(); //error - 제네릭은 참조형 자료형으로만 변형 가능
		//만약 기본형 자료형을 사용하고 싶다면.. wrapper 클래스를 사용
		Box2<Integer> b2 = new Box2<Integer>(); //이제부터 b2 객체의 T는 Integer 객체로 지정됨. b2 뒤에 점 찍어보면 알 수 있음
		b2.setA(new Integer(100));
		b2.setA(200); //자동 new Integer(10) [auto boxing]
		int m = b2.getA(); //자동 (int) 형변환
		
		//참조변수에 제네릭 자료형을 써줬다면 new 할 때는 생략 가능
		Box2<String> b3 = new Box2<>();
		b3.setA("Milk");
		System.out.println(b3.getA());
		
		//멤버로 제네릭을 여러 종류 사용한 클래스 Box3 
		//< > 안에 2개 이상의 자료형 지정도 가능
		Box3<Integer, String> bbb = new Box3<>();
		bbb.setMember(null, null, s);
		
		//제네릭에는 개발자가 만든 클래스도 사용 가능
		
		
		
	}
}
