
public class Main {

	public static void main(String[] args) {
		
		//generic
		//Ŭ������ ���� �� ����� �ڷ����� �������� �ʰ�
		//���(new)�� �� �����ϵ��� �ϴ� ����
		//���� �ؾ ��ü�� ����鼭 ���� �־��ٰ� ��ũ���� �־��ٰ� �ϰ� ���� ��
		
		//������ �ϳ��� ����� �����Ͽ� ������ �ִ� Box ��ü
		Box box = new Box();
		//�⺻�� �ڷ����� ������ �ڷ����� �ƴϹǷ� wrapper Ŭ������ ����ؼ� �Է������ �Ѵ�.
		box.setObj(new Integer(10));
		System.out.println(box.getObj());
		
		//������ ������ ����� ǥ���� �����Ѵ�.
		box.setObj(20);
		System.out.println(box.getObj());
		
		//�ٸ� �ڷ����� Double Ŭ������ �ٲپ� ���� ����
		Box box2 = new Box();
		box2.setObj(3.14);
		System.out.println(box2.getObj());
		
		//���ڿ� ���Ե� ����
		Box box3 = new Box();
		box3.setObj("D'oh!");
		System.out.println(box3.getObj());
		
		//���� �����ͼ� ������ ���������� �����ϰ� ����غ���

		//Object�� Integer�� �ٿ�ĳ����, Integer Ŭ������ int���� ����ȯ�� ���� 
		int n = (int)(Integer)box.getObj();
		//Object -> Integer�� �ڵ����� ���ֱ� ������ ���� ����
		n = (int)box.getObj();

		double d = (double)(Double)box2.getObj();
		
		String s = (String)box3.getObj();
		
		//����� Object ��ü�� ����� �� ���� ����� ������ ����ȯ�� ���ľ� �ϴ� ���ŷο��� ����
		
		//����� ���׸��� ����� Ŭ���� Bo2
		Box2 b = new Box2(); //�׳� ����� ���׸� ��� a�� Object Ŭ������ �������
		b.setA("Donut");
		System.out.println(b.a.getClass().toString()); //?? String�ε�?
		
		//Box2<int> b2 = new Box2<int>(); //error - ���׸��� ������ �ڷ������θ� ���� ����
		//���� �⺻�� �ڷ����� ����ϰ� �ʹٸ�.. wrapper Ŭ������ ���
		Box2<Integer> b2 = new Box2<Integer>(); //�������� b2 ��ü�� T�� Integer ��ü�� ������. b2 �ڿ� �� ���� �� �� ����
		b2.setA(new Integer(100));
		b2.setA(200); //�ڵ� new Integer(10) [auto boxing]
		int m = b2.getA(); //�ڵ� (int) ����ȯ
		
		//���������� ���׸� �ڷ����� ����ٸ� new �� ���� ���� ����
		Box2<String> b3 = new Box2<>();
		b3.setA("Milk");
		System.out.println(b3.getA());
		
		//����� ���׸��� ���� ���� ����� Ŭ���� Box3 
		//< > �ȿ� 2�� �̻��� �ڷ��� ������ ����
		Box3<Integer, String> bbb = new Box3<>();
		bbb.setMember(null, null, s);
		
		//���׸����� �����ڰ� ���� Ŭ������ ��� ����
		
		
		
	}
}
