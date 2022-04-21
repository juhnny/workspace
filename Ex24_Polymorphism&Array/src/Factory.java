//동물 객체(Cat, Dog, Pig)를 만들어서 리턴해주는 기능을 위한 클래스
public class Factory {
	
	Animal createAnimal(int animalNum) {
		switch(animalNum) {
		case 1:
			return new Cat(); //return 뒤에는 break가 불필요. 어차피 도달하지 못할 명령이라 컴파일러가 지우라고 요구함.
		case 2:
			return new Dog();
		case 3:
			return new Pig();
		}
		System.out.println("Animal number(1~3)");
		return null;
	}
	
	//아래 같은 코드로 쓸 수도 있다. 
	//위처럼 중간중간에 return이 있으면 return이 어디서 이뤄졌는지 찾기가 어려워져서.. return을 마지막에만 하면 유지보수에 편하다고.
	Animal createAnimal2(int animalNum) {
		Animal ani = null;
		switch(animalNum) {
		case 1:
			ani = new Cat();
			break;
		case 2:
			ani = new Dog();
			break;
		case 3:
			ani = new Pig();
			break;
		}
		
		return ani;
	}
	
	void whichAnimal(Animal ani) {
		if(ani instanceof Dog) System.out.println("It's a Dog");
		else if(ani instanceof Cat) System.out.println("It's a Cat");
		else if(ani instanceof Pig) System.out.println("It's a Pig");;
	}
}
