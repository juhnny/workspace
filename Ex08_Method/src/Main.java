
public class Main {

	public static void main(String[] args) {

		//Java���� ��� method�� ��ü �ȿ� �־�� �Ѵ�.
		
		// �л� �������� ���α׷�
		Student stu1 = new Student();

		// ��ü�� �����͸� �ѹ��� ����ϴ� ����� ����
		System.out.println(stu1); // C������� �ּҸ� �˷�������� �ڹٿ����� ���� �ּ� ��� [Ŭ������@�ּ��ؽ��ڵ�] ������ �˷���.
		// ����� println�� �ڵ����� ��ü�� ���� toString() �޼ҵ带 ȣ����

		// �ʵ� �ϳ��� ���
		System.out.println(stu1.name);
		System.out.println(stu1.kor);
		System.out.println(stu1.eng);
		System.out.println(stu1.aver);
		System.out.println(stu1.grad);
		System.out.println();

		stu1.name = "Sam";
		stu1.kor = 90;
		stu1.eng = 85;
		stu1.aver = (double) (stu1.kor + stu1.eng) / 2;
		stu1.grad = true;

		System.out.println(stu1.name);
		System.out.println(stu1.kor);
		System.out.println(stu1.eng);
		System.out.println(stu1.aver);
		System.out.println(stu1.grad);
		System.out.println();
		
		//�Ź� �̷��� ���� ������. ��ü �ȿ� �ѹ��� ����ϴ� ��� ������ ���ݾ�.
		//�׷��� Ŭ���� �ȿ��� �����ִ� ����� �����ؼ� ���뼺�� ���δ�.
		
		stu1.show();
		
		//
	}
}
