import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//Object class�� ���� �˾ƺ���
		//��ü��� ������ �ƴ϶� Object��� Ŭ������ ���ؼ�
		
		//��� class�� ���� Ŭ���� - �ֻ��� Ŭ����
		//Java �� �����ϴ� ��� Ŭ������ ������ Object class�� ���
		//James Gosling�� ��� Ŭ������ �־����� �Ѵٰ� �����ߴ� ��ɵ�
		//��������� �ٸ� Ŭ������ ��ӹ޴��� Object Ŭ������ ��ӵ�(������ ���ϸ�     Ŭ������ Object�� ����߱⿡ ������ӿ� ���� Object�� ����� ������ ��
		
		//���ο� Ŭ������ ������
		ClassA a = new ClassA();
		System.out.println(a.a);
		//�⺻������ Object�κ��� ��ӹ��� �޼ҵ��
		//equals(), getClass(), hashCode(), notify(), notifyAll(), toString(), wait()
		
		//1. hashCode()
		//��ü�� �ؽ��ڵ带 ��ȯ. ����Ÿ�� int
		//�ؽ��ڵ�: �޸��� �����ּҸ� ������� �ּҷ� ǥ���� ����(�ڹٿ����� �ּ�)
		Random rnd = new Random();
		System.out.printf("%x \n", rnd.hashCode()); 
		System.out.println(Integer.toHexString(rnd.hashCode()));
		System.out.println("-----hashCode()-----\n");

		
		//2. toString()
		//�� ��ü�� �Ұ��ϴ� ���ڿ��� �����ϴ� �޼ҵ�. ����Ÿ�� String
		//"��Ű����.Ŭ������@�ؽ��ڵ�"
		System.out.println(rnd.toString());
		System.out.println(rnd); //println�� toString()�� ��ȯ
		
		//toString()�� ����� �ٸ� Ŭ������ �ִ�.
		String s = new String("Hello");
		System.out.println(s.toString()); //"��Ű����.Ŭ������@�ؽ��ڵ�"�� �� ������ �����Ͱ� ������? ��ӹ��� �޼ҵ� �״�ΰ� �ƴ϶� �������̵� �� �޼ҵ��� ��
		
		//ClassA�� toString()�� ���� �������̵� �غ���
		System.out.println(a.toString());
		System.out.println("-----toString()-----\n");

		
		//3. equals(Object obj)
		//���޹��� obj�� ���� ��ü���� ���θ� ����(true/false)
		//�⺻�����δ� �ּҸ� ���Ѵ�. Ŭ������ ���Ƶ� ��ü�� �ٸ��� �ּҰ� �ٸ���.
		ClassA a2 = new ClassA();
		ClassA a3 = new ClassA();
		ClassA a4 = a3;
		
		System.out.println(a2.equals(a3));
		System.out.println(a3.equals(a4));
		
		//������ �����ڵ��� �� ���� �ʴ´�. 
		//���� ��ü���� �˰� ������ ������������ �� ���� �ϸ� �Ǵϱ�.
		System.out.println(a2 == a3);
		System.out.println(a3 == a4);
		
		//������ String�� ���ؼ� equals()�� �ּҰ� �ƴ϶� ���ڿ��� �����ִµ�..
		//�� ���� �� String�� equals()�� �������̵� ���ִٴ� �Ҹ�
		System.out.println("-----equals()-----\n");
		
		//4. getClass()
		//Ŭ������ ������ ���� ��ü�� ����. ����Ÿ�� Class class(�� Ŭ������ ������ ���� ����� ���� �ִ�)
		Class c = a.getClass();
		System.out.println(c.getName());
		System.out.println(c.getPackage());
		System.out.println(c.getPackageName());
		System.out.println(c.getSuperclass());
		System.out.println(c.getFields().length); 	
		System.out.println("------getClass()------\n");
		
		
		//5~7. wait(), notify(), notifyAll()
		//thread ���� ���� ����
		
		
		//Object Ŭ������ ��� Ŭ������ �θ� Ŭ����
		//�̸� �̿��ϸ� Object ���������� ��� ��ü�� ������ �� �ִٴ� ��
		Object obj = null;
		obj = new Random(); //��ĳ����
		System.out.println(obj);
		//obj.nex.. //Random�� ��������� �� �� ����. ��? Object�� �� ����� �����ϱ�.
		
		//�̸� �̿��� ��ǥ���� �޼ҵ� - �޼ҵ��� �Ķ���ͷ� � ��ü�� �ް� ���� ��[����Ÿ�Ե� ��������]
		//System.out.println(Object x) - ���޹��� ��ü�� toString()�� �ߵ����Ѽ� ���
		//Object Ÿ�� ���������� �޾Ƽ� String Ÿ�� ����
		System.out.println(new Random());
		System.out.println(new String("abc"));
		System.out.println(new ClassA());
		System.out.println("---------------\n");

		
		//�迭�� ��ü�� ����?
		int[] arr = new int[] {10, 20, 30};
		System.out.println(Integer.toHexString(arr.hashCode())); //3ada9e37
		System.out.println(arr.toString());						//[I@3ada9e37
		System.out.println(arr.getClass().getName());			//[I
		System.out.println(arr.getClass().getPackage());		//null
		System.out.println("-----�迭�� ��ü�� ����-----\n");
		
		



		
		
	}
}
