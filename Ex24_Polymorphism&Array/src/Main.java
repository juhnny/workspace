import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		
		cat.say();
		dog.say();
		pig.say();
		
		//���� �̷� ���� ĳ���Ͱ� ���ʸ�����? cat50, dog20, pig10���� ���� �ǰ�?
		//cat1.say();
		//cat2.say();
		//...
		//cat50.say();
		
		//�̷� �� �迭�� ���� ���� �ս��� ����������...
//		Cat[] cats = new Cat[50];
//		for(int i = 0; i < cats.length; i++) {
//			cats[i] = new Cat();
//		}
//		for(int i = 0; i < cats.length; i++) {
//			cats[i].say();
//		}
		
		System.out.println("--------------");
		
		//�嵥 �̰͵� ���� Cat�鸸 ���� �� �������� �ٸ� ���� Ŭ�������� ������ ���� �� ���� ����� �Ѵ�.
		
		//�׸��� ���� ���� Ŭ������ �ѹ��� �����̰� �ʹٸ�?
		//���� ��� ��Ÿũ����Ʈ���� ���� ������ �ѹ��� �巡�׿��� move�ϴ� ��ó��.
		
		//���� �� Ŭ�����鿡�� ���� ����ϴ� �� �ƴ϶� �ϳ��� ��ɾ���� ����ϴٸ�?
		//������ �θ� Ŭ������ ����� �ѹ��� ����� �� �ִٸ�?
		
		//Dog, Cat, Pig���� Animal�̶�� �θ� Ŭ������ ���������.
		//������ extends Animal�� ���༭ ��ӹ޴´�.
		Animal ani1 = new Cat(); //��ĳ����
		Animal ani2 = new Dog(); //��ĳ����
		Animal ani3 = new Pig(); //��ĳ����
		
		//Animal�� say() �޼ҵ带 ������ش�.
		ani1.say(); //Animal�� say() �޼ҵ尡 ������ �ڽ� ��ü�� say() ����� ����ų ���� ����.
		ani2.say();
		ani3.say();
				
		//���� �ٽ� �迭�� �Ẹ��.
		Animal[] animals = new Animal[12];
		Random rnd = new Random(); //�׳� �����ϸ� �ɽ��ϴ� ���� �߰�
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
		
		//���� �θ� ������(��������)���� �ڽ� ��ü�� ������ �� ���ٸ�
		//Animals�� �� ��Ұ� isCat()����, isDog()����, isPig()���� ���ǹ����� �˻��� �ڿ� ���� say()�� ������ ���� ���̴�.

		//���� ��Ÿũ����Ʈ ���ֵ��� �ѹ��� �巡�� �ؼ� move() �ϴ� �� ����������.
		
		System.out.println("--------------");

		//���� �������� �޼ҵ��� �Ķ���ͳ� ���Ͽ��� �ſ� ����
		
		//return������ ���
		//���� ��ü���� �����ϴ� Factory ��ü�� ���� ����غ���. �����̳� ���Ǳ⸦ ���.
		//�ǹ������� ��ü�� ���� �� �̷����� ������ ���� ����� �� ���� ���Ƽ� new ��� �̷� factory Ŭ������ ���� ����.
		Factory fac = new Factory();
		
		//�θ� ���������� ���� ��
		Animal ani10 = fac.createAnimal(1);
		ani10.say(); //�θ� ��� ����. �������̵��� ������ �޼ҵ� �ߵ�.
		
		//�ڽ� ���������� ���� ��
		//createAnimal()�� 1�� �μ��� ������ Cat ��ü�� �������� �� �޼ҵ��� ���� Ÿ���� ��·�� Animal�̱� ������ �����Ϸ��� Animal�̶�� �����Ѵ�.
//		Cat cat2 = fac.createAnimal(1); //���� Cat �׷��� ����.
		//�̷� �� ����� ����ȯ�� �ʿ��ϴ�. : �ٿ�ĳ����
		Cat cat2 = (Cat)fac.createAnimal(1); //
		cat2.say();
		Dog dog2 = (Dog)fac.createAnimal(2);
		Pig pig2 = (Pig)fac.createAnimal(3);
		
		//�嵥 �θ� ���������� �޾Ƽ� �ڽĵ��� ���� ����� ���� ������?
		Animal ani11 = null;
		ani11 = fac.createAnimal(2); //���� Dog
		//Dog�� ���� ����� bite()�� �� �� �ֳ�? 
		//ani11.bi..// bite�� �翬�� �������� �ʴ´�.
		//Dog�� ���������� �ٿ�ĳ�����ؼ� ����Ҽ��ۿ� ����.
		Dog dog11 = (Dog)ani11;
		dog11.bite();
		//�ٵ� �̷��Ÿ� ó������ Dog�� ���������� �޾���!
		//������ ����ȯ �����ڸ� ���� �θ� ���������� ���� �� �� �ִ�.
		((Dog)ani11).bite(); //�ٸ� ���� ������(.)�� �켱������ ����ȯ �����ں��� �켱�ϹǷ� ��ȣ �ʿ�. �ȵ���̵忡�� ���� ����ϴ� ǥ��
		
		//�ٵ� factory���� � ��ü�� ������ �𸣸� � ���� ����� ����� �� ���� ���� ����.
		Animal ani12 = fac.createAnimal((rnd.nextInt(3) + 1));
		//ani12�� Cat�ϱ�, Dog�ϱ�, Pig�ϱ�?
		//�׷� �� ���� ������
		//instanceof
		System.out.println(dog instanceof Dog); //true
		System.out.println(dog instanceof Animal); //true
//		System.out.println(dog instanceof Cat); //false
		
		//�̸� �̿��ؼ� ��������� ����غ���.
		if(ani12 instanceof Dog) ((Dog)ani12).bite();
		else if(ani12 instanceof Cat) ((Cat)ani12).scratch();
		else if(ani12 instanceof Pig) ((Pig)ani12).eat();
		
		//�Ķ���Ϳ����� ���
		fac.whichAnimal(ani1);
		fac.whichAnimal(cat2);
		fac.whichAnimal(dog2);
		fac.whichAnimal(pig2);
		
		
		
		//Animal Ŭ������ �� ��ü�� ��ü�� ����ϴ� �� �ƴ϶� ����� ���� Ŭ������ ����
		//������ �׷� �ǵ��� �𸣴� �������� Animal ��ü�� ���� ����� ����Ϸ� �� ������ ����
		//�׷��� ���������� ��ü������ �Ұ����� class�� ����� ������ ������
		//abstract class
		//Cat, Dog, Pig�� �� ����� �Ӹ��ӿ��� �׸� �� ������ ����(Animal)�� �ϳ��� ������� ���ø� �� ���� �߻�����(abstract) �����.
		//abstract class�� new�� �Ұ���.
	}
	
}
