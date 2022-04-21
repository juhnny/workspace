import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		
		cat.say();
		dog.say();
		pig.say();
		
		//만약 이런 동물 캐릭터가 수십마리면? cat50, dog20, pig10까지 만들 건가?
		//cat1.say();
		//cat2.say();
		//...
		//cat50.say();
		
		//이럴 땐 배열을 쓰면 비교적 손쉽게 가능하지만...
//		Cat[] cats = new Cat[50];
//		for(int i = 0; i < cats.length; i++) {
//			cats[i] = new Cat();
//		}
//		for(int i = 0; i < cats.length; i++) {
//			cats[i].say();
//		}
		
		System.out.println("--------------");
		
		//헌데 이것도 같은 Cat들만 있을 땐 괜찮지만 다른 동물 클래스들이 많으면 각각 이 짓을 해줘야 한다.
		
		//그리고 만약 여러 클래스를 한번에 움직이고 싶다면?
		//예를 들어 스타크래프트에서 여러 유닛을 한번에 드래그에서 move하는 것처럼.
		
		//만약 이 클래스들에게 각각 명령하는 게 아니라 하나의 명령어만으로 충분하다면?
		//공통의 부모 클래스를 만들어 한번에 사용할 수 있다면?
		
		//Dog, Cat, Pig에게 Animal이라는 부모 클래스를 만들어주자.
		//각각에 extends Animal을 써줘서 상속받는다.
		Animal ani1 = new Cat(); //업캐스팅
		Animal ani2 = new Dog(); //업캐스팅
		Animal ani3 = new Pig(); //업캐스팅
		
		//Animal에 say() 메소드를 만들어준다.
		ani1.say(); //Animal에 say() 메소드가 없으면 자식 객체의 say() 기능을 가리킬 수가 없다.
		ani2.say();
		ani3.say();
				
		//이제 다시 배열을 써보자.
		Animal[] animals = new Animal[12];
		Random rnd = new Random(); //그냥 대입하면 심심하니 랜덤 추가
		int n; 
		
		for(int i = 0; i < animals.length; i++) {
			n = rnd.nextInt(3);
			if(n == 0) animals[i] = new Cat();
			else if(n == 1) animals[i] = new Dog();
			else if(n == 2) animals[i] = new Pig();
		}
		
		for(Animal ani : animals) {
			ani.say();
		}
		
		//만약 부모 리모콘(참조변수)으로 자식 객체를 조종할 수 없다면
		//Animals의 각 요소가 isCat()인지, isDog()인지, isPig()인지 조건문으로 검사한 뒤에 각각 say()를 써줬어야 했을 것이다.

		//이제 스타크래프트 유닛들을 한번에 드래그 해서 move() 하는 게 가능해졌다.
		
		System.out.println("--------------");

		//또한 다형성은 메소드의 파라미터나 리턴에도 매우 유용
		
		//return에서의 사용
		//동물 객체들을 생산하는 Factory 객체를 만들어서 사용해보자. 공장이나 자판기를 상상.
		//실무에서는 객체를 만들 때 이런저런 설정을 같이 해줘야 할 때가 많아서 new 대신 이런 factory 클래스를 만들어서 쓴다.
		Factory fac = new Factory();
		
		//부모 참조변수로 받을 때
		Animal ani10 = fac.createAnimal(1);
		ani10.say(); //부모 기능 실행. 오버라이드한 각자의 메소드 발동.
		
		//자식 참조변수로 받을 때
		//createAnimal()에 1을 인수로 넣으면 Cat 객체가 나오지만 이 메소드의 리턴 타입은 어쨌든 Animal이기 때문에 컴파일러는 Animal이라고 인지한다.
//		Cat cat2 = fac.createAnimal(1); //리턴 Cat 그러나 에러.
		//이럴 땐 명시적 형변환이 필요하다. : 다운캐스팅
		Cat cat2 = (Cat)fac.createAnimal(1); //
		cat2.say();
		Dog dog2 = (Dog)fac.createAnimal(2);
		Pig pig2 = (Pig)fac.createAnimal(3);
		
		//헌데 부모 참조변수로 받아서 자식들의 고유 기능을 쓰고 싶으면?
		Animal ani11 = null;
		ani11 = fac.createAnimal(2); //리턴 Dog
		//Dog의 고유 기능인 bite()를 쓸 수 있나? 
		//ani11.bi..// bite는 당연히 존재하지 않는다.
		//Dog형 참조변수로 다운캐스팅해서 사용할수밖에 없다.
		Dog dog11 = (Dog)ani11;
		dog11.bite();
		//근데 이럴거면 처음부터 Dog형 참조변수로 받았지!
		//다행히 형변환 연산자를 통해 부모 참조변수만 갖고도 쓸 수 있다.
		((Dog)ani11).bite(); //다만 접근 연산자(.)의 우선순위가 형변환 연산자보다 우선하므로 괄호 필요. 안드로이드에서 많이 사용하는 표현
		
		//근데 factory에서 어떤 객체가 나올지 모르면 어떤 고유 기능을 써야할 지 정할 수가 없다.
		Animal ani12 = fac.createAnimal((rnd.nextInt(3) + 1));
		//ani12는 Cat일까, Dog일까, Pig일까?
		//그럴 때 쓰는 연산자
		//instanceof
		System.out.println(dog instanceof Dog); //true
		System.out.println(dog instanceof Animal); //true
//		System.out.println(dog instanceof Cat); //false
		
		//이를 이용해서 고유기능을 사용해보자.
		if(ani12 instanceof Dog) ((Dog)ani12).bite();
		else if(ani12 instanceof Cat) ((Cat)ani12).scratch();
		else if(ani12 instanceof Pig) ((Pig)ani12).eat();
		
		//파라미터에서의 사용
		fac.whichAnimal(ani1);
		fac.whichAnimal(cat2);
		fac.whichAnimal(dog2);
		fac.whichAnimal(pig2);
		
		
		
		//Animal 클래스는 그 자체를 객체로 사용하는 게 아니라 상속을 위한 클래스로 설계
		//하지만 그런 의도를 모르는 누군가는 Animal 객체를 직접 만들어 사용하려 할 위험이 존재
		//그래서 문법적으로 객체생성이 불가능한 class로 만드는 문법이 존재함
		//abstract class
		//Cat, Dog, Pig는 그 모습을 머릿속에서 그릴 수 있지만 동물(Animal)은 하나의 모습으로 떠올릴 수 없는 추상적인(abstract) 존재다.
		//abstract class는 new가 불가능.
	}
	
}
