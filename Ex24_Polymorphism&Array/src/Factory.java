//���� ��ü(Cat, Dog, Pig)�� ���� �������ִ� ����� ���� Ŭ����
public class Factory {
	
	Animal createAnimal(int animalNum) {
		switch(animalNum) {
		case 1:
			return new Cat(); //return �ڿ��� break�� ���ʿ�. ������ �������� ���� ����̶� �����Ϸ��� ������ �䱸��.
		case 2:
			return new Dog();
		case 3:
			return new Pig();
		}
		System.out.println("Animal number(1~3)");
		return null;
	}
	
	//�Ʒ� ���� �ڵ�� �� ���� �ִ�. 
	//��ó�� �߰��߰��� return�� ������ return�� ��� �̷������� ã�Ⱑ ���������.. return�� ���������� �ϸ� ���������� ���ϴٰ�.
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
